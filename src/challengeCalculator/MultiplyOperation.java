package challengeCalculator.CalculatorForWeek3Hw;

public class MultiplyOperation<t extends Number, u extends Number> extends AbstractOperation<t,u> {
    @Override
    public double operate(t a, u b) {

        return a.doubleValue() * b.doubleValue();

    }
}
