//Two Sum (Input Array Is Sorted)
public class Main
{
	class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0, rp = numbers.length-1;
        while(lp <= rp){
            if(numbers[lp] + numbers[rp] > target){
                rp--;
            }
            else if(numbers[lp] + numbers[rp] < target){
                lp++;
            }
            else{
               return new int[] {lp+1,rp+1};
           }
        }
        return new int[] {};
    }
}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
