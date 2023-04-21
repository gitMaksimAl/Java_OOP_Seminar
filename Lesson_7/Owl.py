from Animal import Animal
from Salmon import Salmon


class Owl(Animal):

    def __init__(self, domesticated: bool, hunger: int):
        self.__isDomesticated = domesticated
        self.__hunger = hunger

    def voice(self):
        pass

    def feed(self, food):
        if isinstance(food, Salmon):
            if food.get_cooked():
                self.__hunger -= 8
            else:
                self.__hunger -= 5

    def get_hunger(self):
        return self.__hunger

    def set_hunger(self, hunger: int):
        self.__hunger = hunger

    def set_domesticated(self, domesticated: bool):
        self.__isDomesticated = domesticated

    def get_domesticated(self):
        return self.__isDomesticated

    def __str__(self):
        return f"Owl{{name='{self._name}', age='{self._age}', domesticated='{self.__isDomesticated}', hunger='{self.__hunger}'}}'"
