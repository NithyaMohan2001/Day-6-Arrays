class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int[] one = genSorted(Arrays.copyOfRange(nums, 0, nums.length / 2 + 1));
        int[] two = genSorted(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        int i = 0, j = two.length - 1, ans = Integer.MAX_VALUE;
        while (i < one.length && j >= 0 && ans > 0) { // two pointers
            int val = one[i] + two[j];
            ans = Math.min(Math.abs(val - goal), ans);
            if (val > goal) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

    private int[] genSorted(int[] arr) { // gen sum
        int[] res = new int[1 << arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[1 << i] = arr[i];
        }
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i & -i] + res[i & (i - 1)];
        }
        Arrays.sort(res);
        return res;
    }
}
