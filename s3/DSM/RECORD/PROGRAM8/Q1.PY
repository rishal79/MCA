import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn import svm
from sklearn import metrics
iris=load_iris()
X,y=iris.data,iris.target
X_train,X_test,y_train,y_test=train_test_split(X,y,test_size=0.25,random_state=0)
clf = svm.SVC(kernel='linear')
clf.fit(X_train, y_train)
y_pred = clf.predict(X_test)
print("Accuracy:",metrics.accuracy_score(y_test, y_pred))
print("Precision:",metrics.precision_score(y_test, y_pred,average='micro'))
print("Recall:",metrics.recall_score(y_test, y_pred,average='micro'))



# algorithm
# Step 1: Import necessary libraries (numpy, sklearn modules).
# Step 2: Load the Iris dataset and separate features (X) and target labels (y).
# Step 3: Split the dataset into training and testing sets (75% train, 25% test).
# Step 4: Initialize the Support Vector Machine (SVM) classifier with a linear kernel.
# Step 5: Train the SVM model using the training data.
# Step 6: Predict the target labels for the test data.
# Step 7: Evaluate model performance using accuracy, precision, and recall metrics.
# Step 8: Print the accuracy, precision, and recall scores.
