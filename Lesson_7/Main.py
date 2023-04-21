from Dog import Dog
from Cat import Cat
from Owl import Owl
from Salmon import Salmon

cat1 = Cat(True, 30)
cat1.set_name('Barsik')
cat1.set_age(3)
dog1 = Dog('Pudel', 40)
dog1.set_name('Bobik')
dog1.set_age(5)
owl1 = Owl(True, 20)
owl1.set_age(3)
owl1.set_name('Sofa')
fish1 = Salmon(True)
fish2 = Salmon(False)
print(owl1)
owl1.feed(fish1)
owl1.feed(fish2)

print(dog1)
print(cat1)
print(owl1)
