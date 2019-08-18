package Laboratorio_1;

public class CodingBatRec2 {

    public boolean groupSum6(int start, int[] nums, int target) {

        if (start >= nums.length) return target == 0;
        return (nums[start] == 6) ?
                groupSum6(start + 1, nums, target - nums[start])
                : groupSum6(start + 1, nums, target)
                || groupSum6(start + 1, nums,target - nums[start]);
    }

    public boolean groupSum5(int start, int[] nums, int target) {

        if (start >= nums.length) return target == 0;
        if (nums[start] % 5 == 0) {
            return (start < nums.length - 1 && nums[start + 1] == 1) ?
                    groupSum5(start + 2, nums,target - nums[start])
                    : groupSum5(start + 1, nums,target - nums[start]);
        }
        return groupSum5(start + 1, nums, target)
                || groupSum5(start + 1, nums,target - nums[start]);
    }


    public boolean groupNoAdj( int start, int[] nums, int target) {
        return (start > nums.length - 1) ?
                target == 0 :
                groupNoAdj(start + 2, nums,target- nums[start])
                || groupNoAdj(start + 1, nums, target);
    }

    public boolean splitArray(int[] nums) { return splitArrayAux(nums, 0, 0, 0) ;}

    private boolean splitArrayAux(int[] nums, int indice, int suma1, int suma2){

        return (indice > nums.length - 1) ? suma1 == suma2
                : splitArrayAux(nums, indice + 1, suma1 + nums[indice], suma2)
                || splitArrayAux(nums, indice + 1, suma1, suma2 + nums[indice]);
    }


    public boolean splitOdd10(int[] nums) { return splitOdd10Aux( nums,0, 0, 0) ;}

    private boolean splitOdd10Aux(int[] nums, int start, int suma1, int suma2) {

        return (start > nums.length - 1) ? suma1 % 10 == 0 && suma2 % 2 == 1
                || suma1 % 2 == 1 && suma2 % 10 == 0
                : splitOdd10Aux( nums,start + 1, suma1 + nums[start], suma2)
                || splitOdd10Aux( nums,start + 1, suma1, suma2 + nums[start]);
    }


}

