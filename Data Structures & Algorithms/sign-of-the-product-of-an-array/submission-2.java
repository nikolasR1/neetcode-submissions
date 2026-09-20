class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;

        for (int i = 0; i < nums.length; i++){
            pro *= sigFunc(nums[i]);
        }
        return pro ;
    }
    private int sigFunc(int n ){
        if (n == 0){
            return 0; 
        }else if (n < 0){
            return -1;
        }else{
            return 1;
        }
    }
}