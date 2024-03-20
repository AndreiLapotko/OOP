package Controller;

import Data.ComplexNum;

public class ComplexCalc {

    public ComplexNum add(ComplexNum x, ComplexNum y) {
        double realResult = x.getReal() + y.getReal();
        double imagResult = x.getImag() + y.getImag();

        return new ComplexNum(realResult, imagResult);
    }

    public ComplexNum mult(ComplexNum x, ComplexNum y) {
        double realResult = x.getReal() * y.getReal() - x.getImag() * y.getImag();
        double imagResult = x.getReal() * y.getImag() + x.getImag() * y.getReal();

        return new ComplexNum(realResult, imagResult);
    }

    public ComplexNum div(ComplexNum x, ComplexNum y) {
        double realResult = ((x.getReal() * y.getReal() + x.getImag() * y.getImag())) / (y.getReal() * y.getReal() + y.getImag() * y.getImag());
        double imagResult = (y.getReal() * x.getImag() - x.getReal() * y.getImag()) / (y.getReal() * y.getReal() + y.getImag() * y.getImag());

        return new ComplexNum(realResult, imagResult);
    }
}
