class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int current;
        for(int i = 0; i < nums.length; i++) {
            current = nums[i];
            if(seen.containsKey(target - current)) {
                return new int[] {seen.get(target - current), i};
            }
            seen.put(current, i);
        }
        return null;
    }
}
