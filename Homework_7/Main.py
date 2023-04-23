from Model import Drink, Eat, Product
from Services import Acceptor, Panel, DeliveryWindow

drink = Drink('Coffee', 12.99, 0.3)
eat = Eat('Mars', 10.5, 0.08)
acceptor = Acceptor()
acceptor.deposit = 30
panel = Panel()
panel.add_button(drink, 1)
panel.add_button(eat, 2)

DeliveryWindow.give_product(eat)
DeliveryWindow.give_product(drink)

print(drink, eat, acceptor, panel)