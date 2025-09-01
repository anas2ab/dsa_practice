class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;
            while(left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left_pointer], nums[right_pointer]));
                    left_pointer++;
                    right_pointer--;
                }
                else if(sum > 0) {
                    right_pointer--;
                } else {
                    left_pointer++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
