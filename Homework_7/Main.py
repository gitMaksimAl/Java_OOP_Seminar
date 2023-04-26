# -*- coding: utf-8 -*-
from Repository import *
from Controller import Controller
from View import View

drink1 = Drink('Coffee', 12.99, 0.3)
drink2 = Drink('Coffee', 12.99, 0.3)
drink3 = Drink('Coffee', 12.99, 0.3)
drink4 = Drink('Tea', 7.57, 0.3)
drink_list = list()
drink_list.append(drink1)
drink_list.append(drink2)
drink_list.append(drink3)

eat1 = Eat('Mars', 10.5, 0.08)
eat2 = Eat('Snickers', 9.5, 0.08)
eat3 = Eat('Alenka', 12.7, 0.08)
eat_list = list()

eat_list.append(eat1)
eat_list.append(eat2)
eat_list.append(eat3)

drink_container = LiquidTank(8.5)
eat_container = SolidTank(12)


def build_vending_machines(tank: Tank, products: list):
    controller = Controller(tank)
    for product in products:
        controller.add_product(product)
    View.run(controller)


if __name__ == "__main__":
    build_vending_machines(drink_container, drink_list)
