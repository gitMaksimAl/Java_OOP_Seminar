from Animal import Animal
from Salmon import Salmon


class Cat(Animal):

    def __init__(self, mood: bool, hunger: int):
        self.__isInGoodMood = mood
        self.__hunger = hunger

    def voice(self):
        pass

    def feed(self, food):
        if isinstance(food, Salmon):
            if food.get_cooked():
                self.__hunger -= 8
            else:
                self.__hunger -= 4

    def get_mood(self):
        return self.__isInGoodMood

    def set_mood(self, mood: bool):
        self.__isInGoodMood = mood

    def get_hunger(self):
        return self.__hunger

    def set_hunger(self, hunger: int):
        self.__hunger = hunger

    def __str__(self):
        return f"Cat{{name='{self._name}', age='{self._age}', mood='{self.__isInGoodMood}', hunger='{self.__hunger}'}}'"