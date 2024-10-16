package CalculatorWithNewFunction;

public class BadRangeInputException extends Exception {
    public BadRangeInputException(String Range) {
        super("잘못된 입력입니다! " + Range + "범위 내의 수를 입력해주세요!");
    }
}
