package challengeCalculator;

public class SubtractOperation<t extends Number, u extends Number> extends AbstractOperation<t,u> {
    @Override
    public double operate(t a, u b) {

        return a.doubleValue() - b.doubleValue();

    }
}

