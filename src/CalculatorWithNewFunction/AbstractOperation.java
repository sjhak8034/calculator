package CalculatorWithNewFunction;

public abstract class AbstractOperation <t extends Number, u extends Number> extends Calculator {

    abstract double operate(t a, u b);
}
