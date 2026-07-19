class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length>0 && nums.length<=1000000) {
 HashMap<Integer,Integer> valueIndexMap = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++) {
            if(valueIndexMap.containsKey(nums[i])) {
                return true;
            } else {
                valueIndexMap.put(nums[i],i);
            }
        } return false;
        } else {
            return false;
        }
    }
}