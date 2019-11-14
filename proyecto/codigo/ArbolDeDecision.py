import pandas as pd
from time import time

#now we import the dataset
from sklearn.metrics import accuracy_score
from sklearn.tree import DecisionTreeClassifier, export_graphviz

start_time: float = time()
dataset_forTraining = pd.read_csv('~/PycharmProjects/arbol/data_set_train.csv')
dataset_Test = pd.read_csv('~/PycharmProjects/arbol/data_set_balanced.csv')

cols = list(dataset_forTraining)

#here we define our independent variables
cols.remove('label')

x = dataset_forTraining[cols].values #we store our independent values
y = dataset_forTraining['label'].values #we store our depdendent values
xTest = dataset_Test[cols]
yTest = dataset_Test['label'].values

    #building the classifier
def training(x, y, xTest, yTest) :
    cls = DecisionTreeClassifier(criterion='gini', random_state=0, max_depth=10, min_samples_leaf=5)

    #training the tree
    cls.fit(x, y)
    DecisionTreeClassifier(class_weight=0, criterion='gini', max_depth= None, min_impurity_decrease=0.0,
                           min_impurity_split=None, min_samples_leaf=9, min_samples_split=2, min_weight_fraction_leaf=0.0,
                           presort=False, random_state=0, splitter='best')
    #predictiong with the test
    ypred = cls.predict(xTest)
    print(ypred)

    print(accuracy_score(yTest, ypred) * 100)

    final_time = time()-start_time
    #print(final_time)
    with open("tree_income.txt", "w") as f:
       f = export_graphviz(cls, out_file=f, feature_names=cols)

def main() :
    training(x, y, xTest, yTest)

main()
