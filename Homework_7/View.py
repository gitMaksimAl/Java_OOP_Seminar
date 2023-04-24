# -*- coding: utf-8 -*-
from Controller import Controller


class View(object):

    @staticmethod
    def run(controller: Controller) -> None:
        print(controller.panel.buttons)
        choice = input()
        while choice != "":
            if choice.isdecimal():
                try:
                    choice = controller.product_request(int(choice))
                    print('Please enter bill...')
                    money = input()
                    if money.isdecimal():
                        controller.acceptor.get_bill(int(money))
                    print('Please enter coins...')
                    money = input()
                    if money.isdecimal():
                        controller.acceptor.get_coin(int(money))
                    controller.push_product(choice)
                except Exception as e:
                    controller.diagnostic()
                    print(e)
            print(controller.panel.buttons)
            choice = input()
        if controller.acceptor.deposit != 0:
            print("Your change\n{0:.2f}\u20BD".
                  format(controller.acceptor.deposit))
        controller.acceptor.deposit = 0.0
