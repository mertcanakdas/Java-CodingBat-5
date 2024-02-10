package codingbat_5;     // Dizideki çift elemanların sayısını söyleyen metot

import java.util.Arrays;
import java.util.Random;

public class CodingBat_5 {

    public static int[] nums() {
        Random rn = new Random();
        
        int nums[] = new int[rn.nextInt(10) + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rn.nextInt(100) + 1;
        }
        Arrays.toString(nums);
        return nums;
    }

    public static int countEvens(int[] nums) {
        int count = 0;
       
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countEvens(nums()));
        System.out.println("sa");
        
        
    }

}
