# -*- coding: utf-8 -*-
from Repository import *
from Services import *


class Controller(object):

    def __init__(self, tank: Tank):
        self.__tank = tank
        self.panel = Panel()
        self.acceptor = Acceptor()
        # init product as empty because IDE curse init outside of init
        self.__product = Product('', 0.0)
        self.__bank: float = 0.0

    @property
    def bank(self) -> float:
        return self.__bank

    def add_product(self, product: Product) -> None:
        self.__tank.fill_tank(product)
        self.__init_panel()

    def __init_panel(self) -> None:
        product_list = set(self.__tank.products)
        count: int = 1
        self.panel.reset()
        for product in product_list:
            if isinstance(product, Product):
                self.panel.add_button(product, count)
                count += 1

    def __accept_payment(self) -> bool:
        return self.acceptor.deposit - self.__product.cost >= 0

    def push_product(self, index: int) -> None:
        self.__product = self.__tank.empty_tank(index)
        if self.__product and self.__accept_payment():
            self.__bank += self.__product.cost
            DeliveryWindow.give_product(self.__product)
            self.__init_panel()
            self.acceptor.deposit -= self.__product.cost
            self.__product = None
        else:
            print('No accept payment or product', file=sys.stderr)
            if self.acceptor.deposit != 0:
                print(f"Your change\n{self.acceptor.deposit}")
            self.acceptor.deposit = 0.0
            self.__product = None

    def product_request(self, button: int) -> int:
        if self.panel.push_button(button):
            return button - 1
        else:
            raise IndexError

    def diagnostic(self) -> None:
        print("****DIAGNOSTIC****\n\t{0}\n\t{1}\n\t{2}\n\t{3}\n\t{4}".format(
            self.__tank,
            self.panel,
            self.acceptor,
            self.__product,
            self.__bank
        ), file=sys.stderr)
