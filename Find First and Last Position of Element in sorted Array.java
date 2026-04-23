class Solution {

  // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
  
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0 || nums[0]>target){
            return new int[]{-1,-1};
        }

        int start = firstIndex(nums,target);
        int end = lastIndex(nums,target);

        return new int[]{start,end};        
    }

    public int firstIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                index = mid;
                end = mid-1;
            }
            else if(arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return index;
    }

    public int lastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                index = mid;
                start = mid+1;
            }
            else if(arr[mid] < target) start = mid+1;
            else end = mid-1;
        }
        return index;
    }
}
