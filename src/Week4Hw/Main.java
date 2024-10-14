package Week4Hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        String repeat;
        Scanner sc = new Scanner(System.in);
        while (!calculateEnded) {


            try {
                calculateEnded = !CalculatorApp.start();
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            } finally {

                System.out.println("계산을 계속 하시겠습니까? (exit 입력시 종료)");
                repeat = sc.nextLine();
                ;
                if (repeat.equals("exit")) {
                    calculateEnded = true;
                }

            }
        }
    }

}
