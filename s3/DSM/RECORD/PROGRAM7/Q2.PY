import numpy as np
import pandas as pd
from sklearn.datasets import load_iris
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error

data=load_iris()
x=data.data[:,0].reshape(-1,1)
y=data.target

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)

mlr_model=LinearRegression()
mlr_model.fit(x_train,y_train)
mlr_predictions=mlr_model.predict(x_test)
mlr_mse=mean_squared_error(y_test,mlr_predictions)
print(f'Multiple Linear Regression MSE: {mlr_mse}')

