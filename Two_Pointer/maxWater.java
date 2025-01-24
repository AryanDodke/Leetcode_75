package Two_Pointer;

public class maxWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int water = right - left;
            int ht = Math.min(height[left], height[right]);
            int currentWater = water * ht;
            maxWater = Math.max(maxWater, currentWater);

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }
}
