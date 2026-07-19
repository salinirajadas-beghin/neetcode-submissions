class Solution {
    public int[] twoSum(int[] nums, int target) {
    if(2<= nums.length && nums.length<= 1000) {
      int[] result = new int[2];
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
        int value = target-nums[i] ;
        if(!map.containsKey(value)) {
           map.put(nums[i], i);
        }  else {
            result[0] = map.get(value);
            result[1]= i;
        }
       }
        return result;
    }
    return null;
    }
}
