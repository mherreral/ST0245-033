

/**
 *
 * @author mherreral
 */
public class CodingBat2 {
    public boolean groupSum6(int start, int[] nums, int target){
        
    if(start>=nums.length) return target==0;
    if(nums[start] == 6) 
        return groupSum6(start+1, nums, target- nums[start]); 
  return groupSum6(start+1, nums, target)|| groupSum6(start+1, nums, target- nums[start]);
    
    }
    public boolean groupSum5(int start, int[] nums, int target){
    if(start>=nums.length) return target ==0;
    if(nums[start]%5==0){ //
        if(start<nums.length-1 && nums[start+1]==1) 
            return groupSum5(start+2, nums, target-nums[start]);
    }
    else return groupSum5(start+1, nums, target-nums[start]);
    return groupSum5(start+1, nums, target) || 
            groupSum5(start+1, nums, target-nums[start]);
    }
    
    public boolean groupNoAdj(int start, int[] nums, int target){
    if(start>=nums.length) return target ==0;
    return groupNoAdj(start+2, nums, target- nums[start]) ||
    groupNoAdj(start+1, nums, target);
    }
    
    
    
}
