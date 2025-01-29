/* 

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

*/ // TL Exceeded - for O(n^3)


public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // Update smallest element
            } else if (num <= second) {
                second = num; // Update second smallest element
            } else {
                return true;  // Found a third number that forms a triplet
            }
        }
        return false;
    }
}
