// 238. Product of Array Except Self
import java.util.*;
public class ProductOfArray
{
	public int[] productExceptSelf(int[] nums) {
       
        int[] res = new int[nums.length];
        int prefix = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i] * prefix;
            prefix = res[i];
        }
        int postfix = 1;
        for(int j = nums.length-1; j >= 0; j--){
            if(j==0){
                res[j] = 1 * postfix;
                continue;
            }
            res[j] = res[j-1] * postfix; 
            postfix = nums[j] * postfix;  
            
                                       
        }
        
        return res;  
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
