
public class Main
{
	class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int[] result = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
          result[i] = max;
          if(arr[i] > max){
              max = arr[i];
          }
       } return result;     
    } 
}

// for(int i = 0; i < arr.length; i++){
//            if(i == arr.length - 1) {
//                arr[i] = - 1;
//                break;
//            }
//             int max = arr[i+1];
//            for(int j = i+1; j < arr.length; j++){
              
//                if(arr[j] > max){
//                    max = arr[j];
//                }
//                    arr[i] = max;
//            } 
//         }
//         return arr;

	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
