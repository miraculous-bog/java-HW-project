package CW5;

public class t1_1 {
    public static void main(String args[]) {

        String[] wordsArray = new String[5];
        wordsArray[0] = "The";
        wordsArray[1] = "quick";
        wordsArray[2] = "brown";
        wordsArray[3] = "fox";
        wordsArray[4] = "jumps";
        
        System.out.println("Words in the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(wordsArray[i] + ", ");
        }
        
        System.out.println("\n\nIndexed words:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": " + wordsArray[i] + "\n");
        }
    }
}
