package CalculatorWithNewFunction;

import java.util.ArrayList;

public class ArithmeticCalculator <t extends Number, u extends Number>  {
    private t firstNumber;
    private u secondNumber;
    private ArrayList<Double>memory = new ArrayList<>();

    private AbstractOperation operation;

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }
    public void setFirstNumber(t firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(u secondNumber) {
        this.secondNumber = secondNumber;
    }
    public ArithmeticCalculator() {

    }
    public String getter(){
        return this.memory.toString();
    }
    public void setter(int num,double value) throws BadRangeInputException {
        if (num>this.memory.size()-1){
            throw new BadRangeInputException("0~"+(memory.size()-1));
        }
        this.memory.set(num,value);
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        this.memory.add(answer);

        return answer;
    }


}
