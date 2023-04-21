class Salmon():
    __isCooked: bool

    def __init__(self, cooked: bool):
        self.__isCooked = cooked

    def set_cooked(self, cooked: bool):
        self.__isCooked = cooked

    def get_cooked(self):
        return self.__isCooked
