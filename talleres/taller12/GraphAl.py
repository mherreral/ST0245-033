from collections import defaultdict
class GraphAl:

    def __init__(self, size):
        self.size = size
        self.lista = [[] for i in range(size)]

    def __repr__(self):
        return '{}'.format(self.lista)

    def getWeight(self, source, destination):
        for d in self.lista[source]:
            if d[0] == destination:
                return d[1]

    def addArc(self, source, destination, weight):
        self.lista[source].append((destination, weight))

    def getSuccessors(self, vertice):
        succs = []
        for d in self.lista[vertice]:
            succs.append(d[0])
        return succs

    def depthFirst(self, inicio, hasta):
        listaAux = [False]*len(self.lista)
        if(self.aux(inicio, listaAux)[hasta] == True):
            print(True)
        else:
            print(False)


    def aux(self, inicio, lista):
        lista[inicio] = True
        for i in range(self.size):
            if lista[i] == False:
                self.aux(i, lista)
        return lista




ga = GraphAl(3)
ga.addArc(0, 3, 10)
#print(ga)
#print(ga.getWeight(0, 3))
ga.addArc(0, 4, 7)
print(ga.depthFirst(1, 0))