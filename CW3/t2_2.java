package CW3;

public class t2_2 {
    
    public static void main(String[] args) {

        int decimalValueA = 0x7FFFFFFF; // Має найбільш значущу двійкову позицію
        System.out.println("Decimal a: " + decimalValueA + ", Binary a: " + Integer.toBinaryString(decimalValueA));

        while (decimalValueA != 0){
            decimalValueA = decimalValueA >> 1;
            System.out.println("a: " + Integer.toBinaryString(decimalValueA));
        }

        int binaryValueB = 0b11011011; // Двійкове число
        System.out.println("Decimal b: " + binaryValueB + ", Binary b: " + Integer.toBinaryString(binaryValueB));

        binaryValueB = binaryValueB << 24;
        System.out.println("After <<, Decimal b: " + binaryValueB + ", Binary b: " + Integer.toBinaryString(binaryValueB));

        while (binaryValueB != 0){
            binaryValueB = binaryValueB >>> 1;
            System.out.println("b: " + Integer.toBinaryString(binaryValueB));
        }
    }
}
