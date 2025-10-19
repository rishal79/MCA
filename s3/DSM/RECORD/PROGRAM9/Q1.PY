import numpy as np
import matplotlib.pyplot as plt
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score
from sklearn import tree

data=load_iris()
X = data.data
y= data.target
X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.2,random_state=42)
dt_model=DecisionTreeClassifier()
dt_model.fit(X_train,y_train)
plt.figure(figsize=((22,10)))
tree.plot_tree(dt_model)
y_pred = dt_model.predict(X_test)
accuracy = accuracy_score(y_test,y_pred)
print(f'Accuracy of Decision Tree model: {accuracy:2f}')



# algorithm

# Step 1: Import necessary libraries (numpy, matplotlib, sklearn modules).
# Step 2: Load the Iris dataset and separate features (X) and target labels (y).
# Step 3: Split the dataset into training and testing sets (80% train, 20% test).
# Step 4: Initialize the Decision Tree Classifier model.
# Step 5: Train the model using the training data.
# Step 6: Visualize the trained decision tree using matplotlib.
# Step 7: Predict target labels for the test data.
# Step 8: Calculate the accuracy of the model.
# Step 9: Print the model accuracy.
