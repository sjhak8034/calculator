package LV2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    private List<Double> memory = new ArrayList<>();





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
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("분모에 0이 입력될 수 없습니다.");
                    break;
                } else {
                    result = (double) a / (double) b;
                }
                break;

        }
        memory.add(result);
        return result;
    }



}
