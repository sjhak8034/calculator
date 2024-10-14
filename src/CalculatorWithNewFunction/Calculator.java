package CalculatorWithNewFunction;

import java.util.ArrayList;
import java.util.List;

public class Calculator <t extends Number, u extends Number> {
    private List<Double> memory = new ArrayList<>();

    private AbstractOperation operation;

    public void setter(AbstractOperation operation) {
        this.operation = operation;
    }


    public Calculator() {

    }


     public List<Double> getter() {

        return this.memory;
    }

    public void setter(int index, double value) {
        this.memory.set(index, value);
    }

    public double calculate(t a, u b) {
        double result;
        result = operation.operate(a, b);

        memory.add(result);

        return result;
    }


}
