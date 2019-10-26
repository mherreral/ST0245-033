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

    def depthFirst(self, root):
        listaAux = ["azul"] * len(self.lista)
        self.aux(root, listaAux)
        aux = 0
        for a in self.lista-1:
            if self.lista[a] == self.lista[a + 1]:
                aux + 1
        if aux == 0:
            print("Bicoloreable")
        else:
            print("Not bicoloreable")

    def aux(self, inicio, lista):
        lista[inicio] = "morado"
        for i in range(self.size):
            if lista[i] == False:
                self.aux(i, lista)
        return lista

    def lectura(self):
        nodo = input()
        arcos = input()
        while input() != "0":
            linea = input()
            arreglo = linea.split()
            self.addArc(arreglo.index(0), arreglo.index(1))
        self.depthFirst(0)
