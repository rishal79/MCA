// 1. Create a MongoDB Database named “Inventory”

```js
use Inventory
```

// 2. Create a collection named ‘Products’ and insert the following documents
db.Products.insertMany([
  {
    _id: 1,
    name: "xPhone",
    price: 799,
    releaseDate: ISODate("2011-05-14"),
    spec: { ram: 4, screen: 6.5, cpu: 2.66 },
    color: ["white", "black"],
    storage: [64, 128, 256],
  },
  {
    _id: 2,
    name: "xTablet",
    price: 899,
    releaseDate: ISODate("2011-09-01"),
    spec: { ram: 16, screen: 9.5, cpu: 3.66 },
    color: ["white", "black", "purple"],
    storage: [128, 256, 512],
  },
  {
    _id: 3,
    name: "SmartTablet",
    price: 899,
    releaseDate: ISODate("2015-01-14"),
    spec: { ram: 12, screen: 9.7, cpu: 3.66 },
    color: ["blue"],
    storage: [16, 64, 128],
  },
  {
    _id: 4,
    name: "SmartPad",
    price: 699,
    releaseDate: ISODate("2020-05-14"),
    spec: { ram: 8, screen: 9.7, cpu: 1.66 },
    color: ["white", "orange", "gold", "gray"],
    storage: [128, 256, 1024],
  },
  {
    _id: 5,
    name: "SmartPhone",
    price: 599,
    releaseDate: ISODate("2022-09-14"),
    spec: { ram: 4, screen: 9.7, cpu: 1.66 },
    color: ["white", "orange", "gold", "gray"],
    storage: [128, 256],
  },
]);

// 3. Display all documents in the collection
db.Products.find();

// 4. Display product with _id = 2
db.Products.find({ _id: 2 });

// 5. Display the first document in the collection
db.Products.findOne();

// 6. Display name and price of product with _id = 5
db.Products.find({ _id: 5 }, { name: 1, price: 1, _id: 0 });

// 7. Select documents where price = 899
db.Products.find({ price: 899 });

// 8. Find where spec.ram = 4
db.Products.find({ "spec.ram": 4 });

// 9. Find where color array contains "black"
db.Products.find({ color: "black" });

// 10. Find where releaseDate = "2020-05-14"
db.Products.find({ releaseDate: ISODate("2020-05-14") });

// 11. Find where price < 799
db.Products.find({ price: { $lt: 799 } });

// 12. Find where spec.screen < 7
db.Products.find({ "spec.screen": { $lt: 7 } });

// 13. Find where any storage < 128
db.Products.find({ storage: { $elemMatch: { $lt: 128 } } });

// 14. Find where price is either 599 or 799
db.Products.find({ price: { $in: [599, 799] } });

// 15. Find where color array contains "black" or "white"
db.Products.find({ color: { $in: ["black", "white"] } });

// 16. Find where price is neither 599 nor 799
db.Products.find({ price: { $nin: [599, 799] } });

// 17. Find where color array does not contain "black" or "white"
db.Products.find({ color: { $nin: ["black", "white"] } });

// 18. Find where price = 899 and color is "black" or "white"
db.Products.find({ price: 899, color: { $in: ["black", "white"] } });

// 19. Find where price < 699 or > 799
db.Products.find({ $or: [{ price: { $lt: 699 } }, { price: { $gt: 799 } }] });
