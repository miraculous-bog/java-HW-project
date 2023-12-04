package CW4;

public class t3_5 {
    public static void main(String[] args) {
        int[] nums = new int[args.length];

        if (args.length == 0) {
            System.out.println("Не введено чисел для обчислення медіани.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        double median;
        int middle = nums.length / 2;

        if (nums.length % 2 == 0) {
            median = (nums[middle - 1] + nums[middle]) / 2.0;
        } else {
            median = nums[middle];
        }

        System.out.println("Медіана: " + median);
    }
}
