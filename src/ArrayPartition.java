import java.util.Arrays;

public class ArrayPartition {

    public int getSum(int[] nums){
        Arrays.sort(nums);
        int total = 0;
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            int minValue = Math.min(nums[left], nums[right]);
            total += minValue;
            left += 2;
            right += 2;
        }
        return total;
    }
    public static void main(String[] args) {

        int[] exampleArray = new int[]{6, 2, 6, 5, 1, 2};
        ArrayPartition arrayPartition = new ArrayPartition();

        int total = arrayPartition.getSum(exampleArray);
        System.out.println("Sum of pairs: " + total);
    }
}

