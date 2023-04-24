# -*- coding: utf-8 -*-
import sys

from Model import *


class Tank(object):

    _products: list

    def __init__(self, capacity: int | float):
        self._products = list()
        self._capacity = capacity
        self._current_capacity = 0

    @property
    def products(self) -> list:
        return self._products

    @property
    def capacity(self) -> float | int:
        return self._capacity

    def empty_tank(self, index: int) -> Product:
        return self._products.pop(index)

    def fill_tank(self, product: Product) -> None:
        self._products.append(product)
        self._current_capacity += 1


class LiquidTank(Tank):

    def __init__(self, capacity: float):
        super().__init__(capacity)

    def empty_tank(self, index: int) -> Drink:
        if self._current_capacity == 0:
            raise IndexError
        else:
            self._current_capacity -= self._products[index].volume
            return self._products.pop(index)

    def fill_tank(self, product: Drink) -> None:
        if isinstance(product, Drink)\
                and self._current_capacity + product.volume <= self._capacity:
            self._products.append(product)
            self._current_capacity += product.volume
        else:
            print('Cant fill the tank', file=sys.stderr)

    def __str__(self):
        return f"LiquidTank{{products='{str(self._products)}', \
            capacity='{self._capacity}pieces'," \
               f"current_capacity='{self._current_capacity}'}}"


class SolidTank(Tank):

    def __init__(self, capacity: int):
        super().__init__(capacity)

    def empty_tank(self, index: int) -> Eat:
        if self._current_capacity == 0:
            raise IndexError
        else:
            self._current_capacity -= 1
            return self._products.pop(index)

    def fill_tank(self, product: Eat) -> None:
        if isinstance(product, Eat)\
                and self._current_capacity + product.weight <= self._capacity:
            self._products.append(product)
            self._current_capacity += 1
        else:
            print('Cant fill the tank', file=sys.stderr)

    def __str__(self):
        return f"SolidTank{{products='{str(self._products)}', \
            capacity='{self._capacity}pieces'," \
               f"current_capacity='{self._current_capacity}'}}"
