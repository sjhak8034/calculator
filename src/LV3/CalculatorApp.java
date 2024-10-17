package LV3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        Double result = parser.executeCalculator();
        System.out.println("연산 결과 : " + result);
        ArrayList<Double> upperCase = new ArrayList();
        ArrayList<Double> lowerCase = new ArrayList();
        ArrayList<Double> memory = ArithmeticCalculator.getter();

        upperCase = memory.stream().filter(cases -> cases > result).collect(Collectors.toCollection(ArrayList::new));


        if (ArithmeticCalculator.getter() != null) {
            lowerCase.addAll(Cases(ArithmeticCalculator.getter(), (Double cases) -> cases < result));
        }
        System.out.println("저장된 값중 연산 결과보다 큰 값 : " + upperCase );
        System.out.println("저장된 값중 연산 결과보다 작은 값 : " + lowerCase);
        return true;


    }

    public static void modifyMemory() throws BadInputException {
        System.out.println("몇번째 저장공간을 변경하시겠습니까?");
        String num = sc.nextLine();
        System.out.println("몇으로 바꾸시겠습니까?");
        String value = sc.nextLine();
        parser.modifyMemory(num, value);
    }

    public static ArrayList<Double> Cases(ArrayList<Double> memory, Compare<Double> function) {
        ArrayList<Double> cases = new ArrayList<>();
        for (Double e : memory) {
            if (function.test(e)) {
                cases.add(e);
            }
        }

        return cases;
    }

    interface Compare<T> {
        boolean test(T t);
    }
}