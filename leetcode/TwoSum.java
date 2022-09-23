import java.util.*;
public class TwoSum
{
	public static int[] twosum(int target, int nums[]){
  HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        int required = target - nums[i];
        if(map.get(required) != null){
          return new int[] {map.get(required),i};
        }else{
          map.put(nums[i],i);
        }
      }
      return new int[] {};
     
  }
    public static void main(String[] args) {
      
      int[] nums = {1,7,2,15};
      int target = 9;
      int answer[] = twosum(target,nums);
      System.out.print("{");
      for(int i : answer){
        System.out.print( i + ",");
      }System.out.print("}");

    }
  }
	
	
