class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(map.get(target - nums[i]) != null && i != map.get(target - nums[i])){
                int[] arr = {i, map.get(target - nums[i])};
                return arr;
            }
        }
    return null;
    }
}
