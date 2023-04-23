from Model import Product


class Acceptor(object):

    def __init__(self) -> None:
        self.__deposit = 0

    @property
    def deposit(self) -> float:
        return self.__deposit

    @deposit.setter
    def deposit(self, deposit: float) -> None:
        self.__deposit = deposit

    def get_coin(self, coin: int) -> None:
        self.__deposit += float(coin) / 100

    def get_bill(self, bill: int) -> None:
        self.__deposit += float(bill)

    def __str__(self):
        return f"Acceptor{{deposit='{self.__deposit}'}}"


class Panel(object):

    def __init__(self) -> None:
        self.__buttons = dict()

    def __str__(self):
        return f"Panel{{buttons=f'{str(self.__buttons)}'}}"

    @property
    def buttons(self) -> dict:
        return self.__buttons

    def add_button(self, product: Product, num: int) -> None:
        self.__buttons[num] = "{0} {1:.2f}".format(product.name, product.cost)

    def push_button(self, num: int) -> bool:
        return num in self.__buttons

    def reset(self) -> None:
        self.__buttons.clear()


class DeliveryWindow(object):

    @staticmethod
    def give_product(product: Product) -> None:
        if isinstance(product, Product):
            box_size = len(product.name) * 7
            print('-' * box_size, f"| {product} |", '-' * box_size, sep='\n')
        else:
            raise TypeError
