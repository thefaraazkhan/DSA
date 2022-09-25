import java.util.*;
public class IsAnagram
{
    public boolean isAnagram(String s, String t) {
       char[] sArr = s.toCharArray();
       char[] tArr = t.toCharArray();
       if(sArr.length != tArr.length){
            return false;
        }
        Arrays.sort(sArr); 
        Arrays.sort(tArr);
        
       // System.out.println(s.length);
       for(int i = 0; i < sArr.length; i++){
           if(sArr[i] != tArr[i] ){
               return false;
           }
         }
     return true;   
    }


	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
