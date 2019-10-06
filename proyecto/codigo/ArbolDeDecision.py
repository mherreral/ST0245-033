import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.tree import export_graphviz


data = pd.read_csv('./data_set_balanced.csv') # Aquí se lee el data_set

print(data.count(0) / data.shape[0] * 100) # Esto imprime el porcentaje de datos que hay en cada columna (100% significa que no hay datos vacios)

print("\n", data.groupby('label').label.count()) # Imprime la que cantidad de datos contienen un valor de label

features = ['ph', 'soil_temperature', 'soil_moisture', 'illuminance',
            'env_temperature', 'env_humidity']                          # Variables independientes

X = data[features].values # Se almacenan los valores de las variables independientes

y = data['label'].values # Se almacenan los valores de la variable dependiente

#X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.1, random_state=100)

clf = DecisionTreeClassifier(criterion="gini", random_state=100, max_depth=5, min_samples_leaf=5)
# Esto genera el árbol con una frofundidad de maximo 5 niveles o un criterio de minimo 5 datos para dejar de generar nodos

clf.fit(X, y) # Esto lo entrena


#Esto genera un archivo txt que posteriormente se usa para graficar el arbol en la pagina http://www.webgraphviz.com/
with open("tree_income.txt", "w") as f:
    f = export_graphviz(clf, out_file=f, feature_names=features)

# Aquí se predice un valor dada una entrada (Inestable)

#X_toPred = input('¿Qué deseas Clasificar?\n')

#y_pred = clf.predict(X_toPred)

#y2_pred = clf.predict_proba(X_toPred)
