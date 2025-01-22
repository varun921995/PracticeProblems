import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] input = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(input)));
    }

    public static int[] moveZeroes(int[] nums) {
            int[] nonZeros = Arrays.stream(nums).filter(n -> n != 0 ).toArray();
            int[] zeros = Arrays.stream(nums).filter(n -> n == 0 ).toArray();
        mergeArray(nums, nonZeros,zeros);
        return nums;
    }

    public static void mergeArray(int[] nums, int[] nonZeros, int[] zeros){
        for (int i = 0; i < nonZeros.length; i++) {
            nums[i] = nonZeros[i];
        }
        for(int j = 0; j < zeros.length;j++){
            nums[j+ nonZeros.length] = zeros[j];
        }
     }
}