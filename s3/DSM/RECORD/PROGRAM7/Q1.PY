import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error


data = load_iris()
x = data.data
y = data.target
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)
lr_model = LinearRegression()
lr_model.fit(x_train, y_train)
lr_prediction = lr_model.predict(x_test)
lr_mse = mean_squared_error(y_test, lr_prediction)
print(f'Linear Regression MSE: {lr_mse}')



# algorithm

# Step 1: Import necessary libraries (numpy, pandas, sklearn modules).
# Step 2: Load the Iris dataset and separate features (X) and target labels (y).
# Step 3: Split the dataset into training and testing sets (80% train, 20% test).
# Step 4: Initialize the Linear Regression model.
# Step 5: Train the model using the training data.
# Step 6: Predict target values for the test data.
# Step 7: Calculate the Mean Squared Error (MSE) between actual and predicted values.
# Step 8: Print the MSE result.
