import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error

# Load dataset
data = load_iris()
x = data.data
y = data.target

# Split into training and testing sets
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)

# Train Linear Regression model
lr_model = LinearRegression()
lr_model.fit(x_train, y_train)

# Predict
lr_prediction = ir_model.predict(x_test)

# Calculate MSE
lr_mse = mean_squared_error(y_test, ir_prediction)

print(f'Linear Regression MSE: {lr_mse}')



# algorithm

# Step 1: Import necessary machine learning libraries (e.g., sklearn, numpy, pandas).
# Step 2: Load the Iris dataset and separate it into features (X) and target labels (y).
# Step 3: Split the dataset into training set (80%) and testing set (20%).
# Step 4: Initialize the Linear Regression model.
# Step 5: Train the model using the training data (X_train, y_train).
# Step 6: Predict the target values for the test data (X_test).
# Step 7: Calculate the Mean Squared Error (MSE) between the predicted values and the actual test labels.
# Step 8: Print the final MSE score.