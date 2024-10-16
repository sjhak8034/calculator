package CalculatorWithNewFunction;

import java.util.Scanner;

public class CalculatorApp {
    private static final Parser parser = new Parser();
    static Scanner sc = new Scanner(System.in);
    public static boolean start() throws BadInputException {
        /* Calculator 인스턴스 생성 */



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
    public static void checkMemory(){
        System.out.println(parser.checkMemory()); }
    public static void modifyMemory()throws BadInputException{
        System.out.println("몇번째 저장공간을 변경하시겠습니까?");
        String num = sc.nextLine();
        System.out.println("몇으로 바꾸시겠습니까?");
        String value = sc.nextLine();
        parser.modifyMemory(num,value);}

}