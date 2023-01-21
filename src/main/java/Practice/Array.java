package Practice;

public class Array {
    public static void main(String[] args) {
        int[] arr = {555, 321,  555, 1771};
        System.out.println(countNum(arr));


                
    }

    public static int countNum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]  == nums[i]){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
