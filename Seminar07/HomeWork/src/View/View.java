package View;

import Data.ComplexNum;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public ComplexNum getValue(String title) {
        System.out.printf("%s\n", title);
        System.out.print("Реальная часть: ");
        double real = in.nextDouble();
        System.out.print("Мнимая часть: ");
        double imag = in.nextDouble();
        return new ComplexNum(real, imag);
    }

    public void print(ComplexNum data, String title) {
        System.out.print(title + " " + data + "\n");
    }

    void showMenu() {
        System.out.println("Выберите действие из списка:");
        System.out.println(" 1. Сложение");
        System.out.println(" 2. Умножение");
        System.out.println(" 3. Деление");
        System.out.print("Выбор (q - выход): ");
    }

    boolean isValid(int ch) {
        return !(ch < '1' | ch > '3' & ch != 'q');
    }
}
