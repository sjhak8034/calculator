import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class claculator_nonclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = -1;
        int b = -1;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
        }while(a<0);
        do{
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
        }while(b<0);



        // 두개의 양의 정수를 받아옴

    }
}