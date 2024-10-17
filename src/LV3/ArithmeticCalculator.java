package LV3;

import java.util.ArrayList;

public class ArithmeticCalculator <t extends Number, u extends Number>  {
    private t firstNumber;
    private u secondNumber;
    private static ArrayList<Double>memory = new ArrayList<>();

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
    public static ArrayList<Double> getter(){

        return memory;
    }
    public static void setter(int num,double value) throws BadRangeInputException {
        if (num>memory.size()-1){
            throw new BadRangeInputException("0~"+(memory.size()-1));
        }
        memory.set(num,value);
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        memory.add(answer);
        ArrayList<Double> upperCase = new ArrayList<>();

        return answer;
    }


}
