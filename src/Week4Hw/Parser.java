package Week4Hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput)throws BadInputException{
       boolean check = !Pattern.matches(NUMBER_REG, firstInput);
        if (check) {
            throw new BadInputException("정수");
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {

        boolean check = !Pattern.matches(NUMBER_REG, secondInput);
        if (check){
            throw new BadInputException("정수");
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        boolean check = !Pattern.matches(OPERATION_REG, operationInput);
        if (check){
            throw new BadInputException("연산자");
        }
        switch (operationInput) {
            case "+":
                calculator.setOperation(new AddOperation());
                break;
            case "-":
                calculator.setOperation(new SubtractOperation());
                break;
            case "*":
                calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}