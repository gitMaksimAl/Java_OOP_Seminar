# Vending Machine

* Класс __VendingMachine__ был разбит на модули, в соответствии с моделью __MVC__.
* Каждый модуль имеет зону своей ответственности в соответствии с первым принципом __SOLID__, и работает с моделью Product, вне зависимости от типа продукта.
* В программе реализованы два вида контейнеров для хранения продуктов(напитков и поштучных продуктов).
* Модуль __Controller__ осуществляет логику взаимодействия между остальными модулями.
* Модули __Panel__ и __Acceptor__ определены публичными в контроллере для взаимодействия с __View__.

---
### TODO

Необходимо реализовать сборщик VendingMachine учитывая __generics__.