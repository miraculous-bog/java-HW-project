package CW3;

public class t2_1 {
    public static void main(String[] args) {

        int operand1 = 0xD0;
        int operand2 = 0xA1;

        System.out.println("Operand 1: " + operand1 + ", Operand 2: " + operand2);

        int andResult = operand1 & operand2;
        int orResult = operand1 | operand2;
        int xorResult = operand1 ^ operand2;
        int complementResult = ~operand1;
        int rightShiftResult = operand1 >> operand2;
        int leftShiftResult = operand1 << operand2;
        int unsignedRightShiftResult = operand1 >>> operand2;

        System.out.println("Result of AND: " + Integer.toBinaryString(andResult));
        System.out.println("Result of OR:  " + Integer.toBinaryString(orResult));
        System.out.println("Result of XOR: " + Integer.toBinaryString(xorResult));
        System.out.println("Result of complementation: " + Integer.toBinaryString(complementResult));
        System.out.println("Result of >>:  " + Integer.toBinaryString(rightShiftResult));
        System.out.println("Result of <<:  " + Integer.toBinaryString(leftShiftResult));
        System.out.println("Result of >>>: " + Integer.toBinaryString(unsignedRightShiftResult));
    }
}
