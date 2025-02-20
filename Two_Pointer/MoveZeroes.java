package Two_Pointer;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
