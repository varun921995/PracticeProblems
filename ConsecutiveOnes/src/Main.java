public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums,k));

    }

    public static int longestOnes(int[] nums, int k) {
        int numberOfZeroes = 0;
        int i  = 0;
        int count=0;
        int j = 0;

        while(j < nums.length){
           if(nums[j] == 0){
               numberOfZeroes++;
           }
           while(numberOfZeroes>k){
               if(nums[i] == 0){
                   numberOfZeroes--;
               }
               i++;
           }
            count = Math.max(count,j-i+1);
           j++;
        }

        return  count;
    }
}