class NumArray {

    private final HashMap<Integer, Integer> prefixsum;

    public NumArray(int[] nums) {
        prefixsum = new HashMap<>();

        int sum = 0;
        prefixsum.put(-1, 0);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixsum.put(i, sum);
        }
    }

    public int sumRange(int i, int j) {
        return prefixsum.get(j) - prefixsum.get(i - 1);
    }
}
