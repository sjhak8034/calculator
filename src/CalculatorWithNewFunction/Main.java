package CalculatorWithNewFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        String mode;
        Scanner sc = new Scanner(System.in);
        while (!calculateEnded) {
            try {
                calculateEnded = !CalculatorApp.start();
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            } finally {
                while (true) {
                    System.out.println("계산을 계속 하시겠습니까? (exit 입력시 종료)\n" +
                            " cal : 계산 \n check : 메모리 확인 \n modify : 메모리 수정");
                    mode = sc.nextLine();
                    if (mode.equals("cal")) {
                        break;
                    } else if (mode.equals("check")) {
                        System.out.println(ArithmeticCalculator.getter());
                    } else if (mode.equals("modify")) {
                        try {
                            CalculatorApp.modifyMemory();
                        } catch (BadInputException e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (mode.equals("exit")) {
                        calculateEnded = true;
                        break;
                    }

                }


            }
        }
    }

}
