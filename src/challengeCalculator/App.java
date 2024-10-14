package challengeCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /* Calculator 인스턴스 생성 */
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        GetInput getInput = new GetInput();
        double result = 0;
        /* 반복문 시작 */
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");

            String tempNum1 = sc.nextLine();
            Number num1 = getInput.get(tempNum1);


            System.out.print("두 번째 숫자를 입력하세요:");

            String tempNum2 = sc.nextLine();
            Number num2 = getInput.get(tempNum2);


            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            switch (operator) {
                case '+':

                    calc.setter(new AddOperation());

                    result = calc.calculate(num1, num2);
                    System.out.println(result);
                    break;
                case '-':

                    calc.setter(new SubtractOperation());
                    result = calc.calculate(num1, num2);
                    System.out.println(result);
                    break;
                case '*':

                    calc.setter(new MultiplyOperation());
                    result = calc.calculate(num1, num2);
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


                    calc.setter(new DivideOperation());
                    result = calc.calculate(num1, num2);
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