import java.util.*;
public class ContainsDuplicate
{
	
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet();
        for(int i = 0; i < nums.length; i++){
        if(!set.add(nums[i])){
            return true;
        }
        }
        return false; 
    }

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
