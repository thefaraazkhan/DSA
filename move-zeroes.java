class Solution {
    public void moveZeroes(int[] nums) {
     int p1 = 0;
     int p2 = 1;
     while(p2 < nums.length){
         if(nums[p1] != 0){
             p1++;
             p2++;
             continue;
         }
         if(nums[p2] != 0){
             int temp = nums[p1];
             nums[p1] = nums[p2];
             nums[p2] = temp;
             p1 += 1;
         } 
         p2++;
     }
   
        
    /*
    Brute Force
    for(int i = 0; i < nums.length; i++) {
         for(int j = 0; j < nums.length-1; j++){
             if(nums[j] == 0){
             int temp = nums[j+1];
             nums[j+1] = nums[j];
             nums[j] = temp;
          } 
         }
       }    
    */    
    }
}