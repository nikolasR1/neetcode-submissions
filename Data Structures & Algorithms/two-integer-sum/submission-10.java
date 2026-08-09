class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            count.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(count.containsKey(diff) && count.get(diff) != i){
                return new int[] {i, count.get(diff)};
            }
            
            
        }
        return new int[] {};
    }
}
