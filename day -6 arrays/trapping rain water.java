public class Solution {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1, maxleft = 0, maxright = 0, water = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                maxleft = Math.max(maxleft, height[i]);
                water += maxleft - height[i];
                i++;
            } else {
                maxright = Math.max(maxright, height[j]);
                water += maxright - height[j];
                j--;
            }
        }
        return water;
    }
}
