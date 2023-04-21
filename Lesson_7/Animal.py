from abc import ABC, abstractmethod

class Animal(ABC):
    _name: str
    _age: int

    @abstractmethod
    def voice(self):
        pass

    @abstractmethod
    def feed(self, food):
        pass

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_age(self):
        return self._age

    def set_age(self, age):
        self._age = age
