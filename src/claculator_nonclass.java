import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class claculator_nonclass {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a;
            int b;
            double result = 0;
            do {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                a = sc.nextInt();
            } while (a < 0);
            do {
                System.out.print("두 번째 숫자를 입력하세요: ");
                b = sc.nextInt();
            } while (b < 0);
            System.out.print("연산기호를 입력하세요: ");
            char operationSymbol = sc.next().charAt(0);
            switch (operationSymbol) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("분모에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        result = (double)a / (double)b;
                    }
                    break;

            }
            System.out.println("결과:" + result);


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            String repeat = sc.next();
            if (repeat.equals("exit")) {
                break;
            }
        }


    }
}