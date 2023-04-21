from Animal import Animal
from Salmon import Salmon


class Dog(Animal):

    def __init__(self, breed: str, hunger: int):
        self.__breed = breed
        self.__hunger = hunger

    def voice(self):
        pass

    def feed(self, food):
        if isinstance(food, Salmon):
            if food.get_cooked():
                self.__hunger -= 5
            else:
                self.__hunger -= 3

    def get_breed(self):
        return self.__breed

    def set_breed(self, breed: bool):
        self.__breed = breed

    def get_hunger(self):
        return self.__hunger

    def set_hunger(self, hunger: int):
        self.__hunger = hunger

    def __str__(self):
        return f"Dog{{name='{self._name}', age='{self._age}', breed='{self.__breed}', hunger='{self.__hunger}'}}'"
