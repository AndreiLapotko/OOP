/*
* В данном случае, нарушается LSP, так как наследующий класс Ostrich изменяет ожидаемое поведение метода fly() базового класса Bird.*/
class Bird {
    public void fly() {
// Реализация полета птицы
    }
}

class Ostrich extends Bird {

}
