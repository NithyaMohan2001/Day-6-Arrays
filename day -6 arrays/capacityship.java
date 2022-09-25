class Solution {
    // binary search(o(n));
    // return -1;
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for (int m : weights) {
            min = Math.max(m, min);
            max += m;
        }
        int retval = 0;
        while (min <= max) {
            int mid = (min + max) / 2;
            int daysreqd = noofdaysneeded(weights, mid);
            if (daysreqd > 0) {
                min = mid + 1;
            } else {
                retval = mid;
                max = mid - 1;
            }
        }
        return retval;
    }

    private int noofdaysneeded(int[] weights, int capacity) {
        int daysreqd = 1;
        int current = 0;

        for (int m : weights) {
            current += m;
            if (current > capacity) {
                daysreqd++;
                current = m;
            }
        }
        return daysreqd;
    }
}
