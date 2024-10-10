package CalculatorForWeek3Hw;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> memory = new ArrayList<>();
//    AddOperation addOperation = new AddOperation();
//    DivideOperation divideOperation = new DivideOperation();
//    SubstractOperation substractOperation = new SubstractOperation();
//    MultiplyOperation multiplyOperation = new MultiplyOperation();
    private AbstractOperation operation;

    public void Setter(AbstractOperation operation) {
        this.operation = operation;
    }
//    public Calculator(AbstractOperation operation) {
//        this.operation = operation;
//    }
    public Calculator() {

    }



    public List<Double> getter(){
        return this.memory;
    }
    public void Setter(int index, double value){
        this.memory.set(index, value);
    }

    public double calculate(int a, int b) {
        double result;
        result = operation.operate(a, b);

        memory.add(result);
        System.out.println(memory.toString());
        return result;
    }



}
