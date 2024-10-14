package Week4Hw;

import java.util.Scanner;

public class CalculatorApp {
    public static boolean start() throws BadInputException {
        /* Calculator 인스턴스 생성 */
        Parser parser = new Parser();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요!");
        String firstInput = sc.nextLine();
        parser.parseFirstNum(firstInput);



        System.out.println("연산자를 입력해주세요!");
        String operator = sc.nextLine();
        parser.parseOperator(operator);

        System.out.println("두번째 숫자를 입력해주세요!");
        String secondInput = sc.nextLine();
        parser.parseSecondNum(secondInput);

        System.out.println("연산 결과 : " + parser.executeCalculator());
        return true;



    }
}