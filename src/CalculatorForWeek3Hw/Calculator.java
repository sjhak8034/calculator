package CalculatorForWeek3Hw;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> memory = new ArrayList<>();
    AddOperation addOperation = new AddOperation();
    DivideOperation divideOperation = new DivideOperation();
    SubstractOperation substractOperation = new SubstractOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();




    public List<Double> getter(){
        return memory;
    }
    public void Setter(int index, double value){
        memory.set(index, value);
    }

    public double calculate(int a, int b, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = addOperation.operate(a,b);
                break;
            case '-':
                result = substractOperation.operate(a,b);
                break;
            case '*':
                result = multiplyOperation.operate(a,b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    break;
                } else {
                    result = divideOperation.operate(a,b);
                }
                break;
            default:
                System.out.println(a%b);
                break;
        }
        memory.add(result);
        return result;
    }



}
