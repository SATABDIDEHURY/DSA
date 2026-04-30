class Solution {

    // https://leetcode.com/problems/two-sum/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> listMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i< nums.length; i++){
            if(listMap.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = listMap.get(target - nums[i]);                
            }
            listMap.put(nums[i], i);
            
        }
        
        return result;
    }
}