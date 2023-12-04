public class t1_8 {
	/**
 * This is an example class that demonstrates Javadoc comments.
 */
    /**
     * This method adds two integers and returns the result.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Main method to demonstrate Javadoc comments.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Call the add method and print the result
        int result = add(3, 7);
        System.out.println("Result: " + result);
    }
}
