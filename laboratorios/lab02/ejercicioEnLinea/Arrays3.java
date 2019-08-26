package Array;

public class Array3 {

    // Constructor
    Array3() {
    }

    // Exercise 1
    public int maxSpan(int[] nums)
    { return (nums.length > 0 && nums[0] != nums[nums.length - 1]) ? nums.length - 1 : nums.length ;}

    // Exercise 2
    public int[] fix34(int[] nums) {
        int aux;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++)
                    if (nums[j] == 3) {
                        aux = nums[i];
                        nums[i] = nums[j + 1];
                        nums[j + 1] = aux;
                    }
            }
        return nums;
    }

    // Exercise 3
    public int[] fix45a(int[] nums) {
        int aux;
        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (nums[i] == 5 && nums[j] == 4) {
                    aux = nums[j + 1];
                    nums[j + 1] = nums[i];
                    nums[i] = aux;
                }
        return nums;
    }

    // Exercise 4
    public boolean canBalance(int[] nums) {
        int totala = 0, totalb = 0;
        for (int a : nums) { totala += a ;}
        for (int num : nums) {
            totalb += num;
            if (totalb == (totala - totalb)) return true;
        }
        return false;
    }

    // Exercise 5
    public boolean linearIn(int[] outer, int[] inner) {
        int aux = 0;
        for (int out : outer) {
            if (aux < inner.length && out == inner[aux]) aux++;
        }
        return aux == inner.length;
    }


} // NO TOCARR!!!!!!

