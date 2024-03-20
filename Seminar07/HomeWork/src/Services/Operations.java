package Services;

import Controller.ComplexCalc;
import Data.ComplexNum;

public class Operations {
    private ComplexCalc calc;
    private ComplexNum x;
    private ComplexNum y;
    private ComplexNum result;

    public void setCalc(ComplexCalc calc) {
        this.calc = calc;
    }

    public void setX(ComplexNum x) {
        this.x = x;
    }

    public void setY(ComplexNum y) {
        this.y = y;
    }

    public ComplexNum getResult() {
        return result;
    }

    public void oper(int what) {
        switch (what) {
            case '1', '+' -> {
                result = calc.add(x, y);
            }
            case '2' -> {
                result = calc.mult(x, y);
            }
            case '3' -> {
                result = calc.div(x, y);
            }
        }
    }
}
