class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = l + 1;
        int[] res = new int[2];

        while(l < r && r < numbers.length) {
            int sum = numbers[l] + numbers[r];
            if(sum == target) {
                res[0] = l + 1;
                res[1] = r + 1;
            }
            r++;
            if(r == numbers.length) {
                l++; r = l + 1;
            }
        }

        return res;
    }
}
