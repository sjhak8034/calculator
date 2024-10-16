package CalculatorForWeek3Hw;

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;
import com.sun.xml.internal.ws.util.ASCIIUtility;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */


        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        double result;
        /* 반복문 시작 */
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    //calc = new Calculator(new AddOperation());
                    calc.Setter(new AddOperation());
                    break;
                case '-':
//                    calc = new Calculator(new SubstractOperation());
                    calc.Setter(new SubtractOperation());
                    break;
                case '*':
//                    calc = new Calculator(new MultiplyOperation());
                    calc.Setter(new MultiplyOperation());
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("분모에 0이 입력될 수 없습니다.");
                        break;
                    } else {
//                        calc = new Calculator(new DivideOperation());
                        calc.Setter(new DivideOperation());
                    }
                    break;
                default:
                    System.out.println(num1 % num2);
                    break;
            }

            result = calc.calculate(num1, num2);


            System.out.println(result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.next();
            if (repeat.equals("exit")) {
                break;
            }
        }

    }
}