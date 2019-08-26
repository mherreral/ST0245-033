package lab2;

/**
 *
 * @author manuh
 */
public class Arrays3 {

    public int maxSpan(int[] nums) {
        int span = 0;
        int auxi;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    auxi = j - i + 1;
                    span = Math.max(auxi, span);
                }
            }
        }

        return span;
    }

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int auxi = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = auxi;
                    }
                }
            }
        }
        return nums;
    }

}
