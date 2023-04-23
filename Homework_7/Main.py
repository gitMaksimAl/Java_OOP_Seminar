from Model import Drink, Eat, Product
from Services import Acceptor, Panel, DeliveryWindow

drink = Drink('Coffee', 12.99, 0.3)
eat = Eat('Mars', 10.5, 0.08)
acceptor = Acceptor()
acceptor.deposit = 30
panel = Panel()
panel.add_button(drink, 1)
panel.add_button(eat, 2)

product = Product('Tea', 5.55)
print(Drink(product))
DeliveryWindow.give_product(Product(eat))
DeliveryWindow.give_product(Product(drink))

print(drink, eat, acceptor, panel)