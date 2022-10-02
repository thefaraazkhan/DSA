
public class Main
{
	public int minEatingSpeed(int[] piles, int h) {
       int len = piles.length;
       int max = piles[0];  
       for(int i=1; i < len; i++){
           if(piles[i] > max){
               max = piles[i];
           }
       }
        
       int start = 1;
       int end = max;
       int mid = (start + end)  / 2;
       int k = max;
        
       while(start <= end){
           long sumOfHours = 0;
           for(int banana : piles){
              sumOfHours = sumOfHours + (int)Math.ceil((double)banana / (double)mid); 
           }
          if(sumOfHours <= h){
              k = mid;  
          }
           
          if(sumOfHours <= h){
             end = mid - 1;
          } 
          else{
              start = mid + 1;
          } 
          mid = (start + end)  / 2;
       }
     return k;   
    } 
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

