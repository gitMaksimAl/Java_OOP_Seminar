class Product(object):

    def __init__(self, name: str, cost: float):
        self._name = name
        self._cost = cost

    @property
    def name(self) -> str: return self._name

    @property
    def cost(self) -> float: return self._cost

    def __str__(self):
        return f"Product{{name='{self._name}', cost='{self._cost}'}}"


class Drink(Product):

    def __init__(self, name: str, cost: float, volume: float):
        super().__init__(name, cost)
        self.__volume = volume

    def __str__(self):
        return f"Drink{{name='{self._name}', cost='{self._cost}\u20BD', " \
               f"volume='{self.__volume}}}"

    @property
    def name(self):
        return self._name

    @property
    def cost(self):
        return self._cost

    @property
    def volume(self):
        return self.__volume

    @volume.setter
    def volume(self, volume: float):
        self.__volume = volume


class Eat(Product):

    def __init__(self, name: str, cost: float, weight: float):
        super().__init__(name, cost)
        self.__weight = weight

    def __str__(self):
        return f"Eat{{name='{self._name}', cost='{self._cost}\u20BD', " \
               f"weight='{self.__weight}}}"

    @property
    def weight(self):
        return self.__weight

    @weight.setter
    def weight(self, weight):
        self.__weight = weight

    @property
    def name(self):
        return self._name

    @property
    def cost(self):
        return self._cost
