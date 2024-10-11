package challengeCalculator.CalculatorForWeek3Hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        getInput getInput = new getInput();
        double result = 0;
        /* 반복문 시작 */
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");

            String tempNum1 = sc.nextLine();
            Object num1 = getInput.get(tempNum1);


            System.out.print("두 번째 숫자를 입력하세요:");

            String tempNum2 = sc.nextLine();
            Object num2 = getInput.get(tempNum2);


            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            switch (operator) {
                case '+':

                    calc.Setter(new AddOperation());

                    if (num1 instanceof Double && num2 instanceof Double) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Double && num2 instanceof Integer) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Integer) num2).intValue());
                    } else if (num1 instanceof Integer && num2 instanceof Double) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Integer && num2 instanceof Integer) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Integer) num2).intValue());
                    }
                    System.out.println(result);
                    break;
                case '-':

                    calc.Setter(new SubtractOperation());
                    if (num1 instanceof Double && num2 instanceof Double) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Double && num2 instanceof Integer) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Integer) num2).intValue());
                    } else if (num1 instanceof Integer && num2 instanceof Double) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Integer && num2 instanceof Integer) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Integer) num2).intValue());
                    }
                    System.out.println(result);
                    break;
                case '*':

                    calc.Setter(new MultiplyOperation());
                    if (num1 instanceof Double && num2 instanceof Double) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Double && num2 instanceof Integer) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Integer) num2).intValue());
                    } else if (num1 instanceof Integer && num2 instanceof Double) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Integer && num2 instanceof Integer) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Integer) num2).intValue());
                    }
                    System.out.println(result);
                    break;
                case '/':
                    if (num2 instanceof Double) {
                        if (((Double) num2).doubleValue() == 0) {
                            System.out.println("분모에 0이 입력될 수 없습니다.");
                            break;
                        }
                    } else if (num2 instanceof Integer) {
                        if (((Integer) num2).doubleValue() == 0) {
                            System.out.println("분모에 0이 입력될 수 없습니다.");
                            break;
                        }
                    }


                    calc.Setter(new DivideOperation());
                    if (num1 instanceof Double && num2 instanceof Double) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Double && num2 instanceof Integer) {
                        result = calc.calculate(((Double) num1).doubleValue(), ((Integer) num2).intValue());
                    } else if (num1 instanceof Integer && num2 instanceof Double) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Double) num2).doubleValue());
                    } else if (num1 instanceof Integer && num2 instanceof Integer) {
                        result = calc.calculate(((Integer) num1).intValue(), ((Integer) num2).intValue());
                    }
                    System.out.println(result);
                    break;
            }
        

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.nextLine();
            if (repeat.equals("exit")) {
                break;
            }
        }

    }
}