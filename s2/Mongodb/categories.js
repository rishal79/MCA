db.categories.insertMany([
  {
    category_id: 1,
    name: "Phones",
    parent_category: null,
    products: []
  },
  {
    category_id: 2,
    name: "Laptops",
    parent_category: null,
    products: [
      {
        product_id: 2,
        name: "MacBook Pro",
        price: 1999.99,
        quantity: 5
      }
    ]
  },
  {
    category_id: 3,
    name: "Consoles",
    parent_category: null,
    products: [
      {
        product_id: 4,
        name: "Sony PlayStation 5",
        price: 499.99,
        quantity: 20
      },
      {
        product_id: 5,
        name: "Nintendo",
        price: 149.99,
        quantity: 12
      }
    ]
  },
  {
    category_id: 4,
    name: "iPhone",
    parent_category: 1,
    products: [
      {
        product_id: 1,
        name: "iPhone 12",
        price: 999.99,
        quantity: 10
      }
    ]
  },
  {
    category_id: 5,
    name: "Windows",
    parent_category: 2,
    products: [
      {
        product_id: 3,
        name: "Dell XPS 15",
        price: 1599.99,
        quantity: 8
      }
    ]
  },
  {
    category_id: 6,
    name: "Xbox",
    parent_category: 3,
    products: [
      {
        product_id: 6,
        name: "Xbox Series X",
        price: 499.99,
        quantity: 25
      }
    ]
  }
])

// Q1: Update the value of products of category_id = 1 to an empty array if it is currently null.
db.categories.updateOne(
  { category_id: 1, products: null },
  { $set: { products: [] } }
);

// Q2: List all product names (include only product_id, name).
db.categories.aggregate([
  { $unwind: "$products" },
  { $project: { _id: 0, product_id: "$products.product_id", name: "$products.name" } }
]);

// Q3: List all categories that have a parent category (include category_id, name, parent_category).
db.categories.find(
  { parent_category: { $ne: null } },
  { _id: 0, category_id: 1, name: 1, parent_category: 1 }
);

// Q4: Retrieve all products and their corresponding categories (include product_id, name, category name).
db.categories.aggregate([
  { $unwind: "$products" },
  {
    $project: {
      _id: 0,
      product_id: "$products.product_id",
      name: "$products.name",
      category_name: "$name"
    }
  }
]);

// Q5: Get names of all products in the Consoles category ordered by name descending (only product name).
db.categories.aggregate([
  { $match: { name: "Consoles" } },
  { $unwind: "$products" },
  { $sort: { "products.name": -1 } },
  { $project: { _id: 0, name: "$products.name" } }
]);

// Q6: List all products that contain the letter "o" anywhere in the name (include product_id, name).
db.categories.aggregate([
  { $unwind: "$products" },
  { $match: { "products.name": /o/i } },
  {
    $project: {
      _id: 0,
      product_id: "$products.product_id",
      name: "$products.name"
    }
  }
]);

// Q7: Find the product with the maximum quantity (include product_id, name, quantity).
db.categories.aggregate([
  { $unwind: "$products" },
  { $sort: { "products.quantity": -1 } },
  { $limit: 1 },
  {
    $project: {
      _id: 0,
      product_id: "$products.product_id",
      name: "$products.name",
      quantity: "$products.quantity"
    }
  }
]);

// Q8: List the products with a price greater than 1000, sorted by name in descending order.
db.categories.aggregate([
  { $unwind: "$products" },
  { $match: { "products.price": { $gt: 1000 } } },
  { $sort: { "products.name": -1 } },
  {
    $project: {
      _id: 0,
      name: "$products.name",
      price: "$products.price"
    }
  }
]);

// Q9: Retrieve the total number of products in each category (include category_id, name, totalProducts).
db.categories.aggregate([
  {
    $project: {
      _id: 0,
      category_id: 1,
      name: 1,
      totalProducts: { $size: "$products" }
    }
  }
]);
