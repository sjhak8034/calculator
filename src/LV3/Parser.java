package LV3;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^-?[0-9]+(\\.[0-9]+)?$";

    private final ArithmeticCalculator calculator = new ArithmeticCalculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {

        boolean check = !Pattern.matches(NUMBER_REG, firstInput);
        boolean checkDouble = firstInput.contains(".");
        if (check) {
            throw new BadInputException("수");
        }
        if (checkDouble) {
            calculator.setFirstNumber(Double.parseDouble(firstInput));
        } else {
            calculator.setFirstNumber(Integer.parseInt(firstInput));
        }
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {

        boolean check = !Pattern.matches(NUMBER_REG, secondInput);
        boolean checkDouble = secondInput.contains(".");
        if (check) {
            throw new BadInputException("수");
        }
        if (checkDouble) {
            calculator.setSecondNumber(Double.parseDouble(secondInput));
        } else {
            calculator.setSecondNumber(Integer.parseInt(secondInput));
        }
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        boolean check = !Pattern.matches(OPERATION_REG, operationInput);
        if (check) {
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

    public void modifyMemory(String num,String value)throws BadInputException{
        boolean checkIndex = !Pattern.matches(NUMBER_REG, num);
        boolean checkValue = !Pattern.matches(NUMBER_REG, value);
        if (checkIndex || checkValue) {
            throw new BadInputException("수");
        }
        try{
            calculator.setter(Integer.parseInt(num),Double.parseDouble(value));
        }catch (BadRangeInputException e){
            System.out.println(e.getMessage());
        }
       }
}