public class Main {
    public static void main(String[] args) {
        System.out.println("Leet code : 11. Container With Most Water ");
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int maxResult = 0;
        int left = 0;
        int right = height.length -1 ;

        while(left < right){
            maxResult = Math.max(Math.min(height[left],height[right]) * (right - left), maxResult);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxResult;
    }

}