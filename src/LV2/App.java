package LV2;

import java.util.Scanner;

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



            result = calc.calculate(num1, num2, operator);
            System.out.println(result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String repeat = sc.next();
            if (repeat.equals("exit")) {
                break;
            }
        }

    }
}