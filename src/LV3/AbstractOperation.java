package LV3;

public abstract class AbstractOperation <t extends Number, u extends Number> extends ArithmeticCalculator {

    abstract double operate(t a, u b);
}
