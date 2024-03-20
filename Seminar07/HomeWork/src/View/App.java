package View;

import Controller.ComplexCalc;
import Data.ComplexNum;
import Services.Operations;

import java.io.IOException;

public class App {
    private final View view;
    private final ComplexCalc calc;
    Operations ops;

    public App(View v, Operations op) {
        view = v;
        calc = new ComplexCalc();
        ops = op;
    }

    public void run() throws IOException {
        ComplexNum complex1 = view.getValue("Введите первое комплексное число: ");
        ComplexNum complex2 = view.getValue("Введите второе комплексное число: ");
        ops.setX(complex1);
        ops.setY(complex2);
        ops.setCalc(calc);

        for (; ; ) {
            char choice, ignore;
            do {
                view.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!view.isValid(choice));
            if (choice == 'q') break;
            ops.oper(choice);
            view.print(complex1, "Число X:");
            view.print(complex2, "Число Y:");
            view.print(ops.getResult(), "Результат: ");
        }
    }
}
