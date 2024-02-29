package Lesson_09.Ex004;

import Lesson_09.Ex004.ExBeverage.*;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Milk("Сгущёнка"));
        latte.addComponent(new Beans ("Зерно"));

        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
