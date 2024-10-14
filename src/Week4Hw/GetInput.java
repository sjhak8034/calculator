package Week4Hw;

import java.math.BigDecimal;

public class GetInput<t extends Number> {

    public Number get (String input) {
        try {
            BigDecimal number = new BigDecimal(input);
            // 입력 값이 정수인지 소수인지 확인
            if (number.scale() > 0) {

                return number.doubleValue();
            } else {
                return number.intValue();
            }
        } catch (NumberFormatException e) {
            System.out.println("The input is not a valid number.");
            return null;
        }
    }

}
