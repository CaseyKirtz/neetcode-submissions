class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> remember = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(remember.contains(nums[i])) {
                return true;
            } else {
                remember.add(nums[i]);
            }
        }
        return false;
    }
}