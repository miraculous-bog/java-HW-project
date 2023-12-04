package CW2;

import java.util.function.Function;

public class t4_6 {

    static double tanh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    static double bent(double x) {
        return (Math.sqrt(x * x + 1) - 1) / 2 + x;
    }

    static double calculateDerivative(Function<Double, Double> function, double x, double h) {
        return (function.apply(x + h) - function.apply(x)) / h;
    }

    public static void main(String[] args) {
        double x = 2.0;
        double h = 1e-6;

        // Function a) f(x) = tanh(x)
        double tanhDerivative = calculateDerivative(t4_6::tanh, x, h);
        System.out.println("Derivative of tanh(x) at x = " + x + ": " + tanhDerivative);

        // Function b) f(x) = bent(x)
        double bentDerivative = calculateDerivative(t4_6::bent, x, h);
        System.out.println("Derivative of bent(x) at x = " + x + ": " + bentDerivative);
    }
}
