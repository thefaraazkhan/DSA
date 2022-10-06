//Insertion Sort

public class Main
{
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
         int value = arr[i]; 
         int hole = i;
         while(hole > 0 && arr[hole-1] > value){
             arr[hole] = arr[hole-1];  
             hole--;
         }
         arr[hole] = value;
        }
        arrayPrint(arr);
    }
    
    
    // 16 25 | 2 4      {n=4} value=16 hole=1 i=1
    // 2  16 25 | 4      {n=4} value=2 hole=1 i=2
    // 2  4  16  25 |      {n=4} value=4 hole=1 i=3
    
    
    public static void arrayPrint(int arr[]){
        for(int num : arr){
            System.out.println(num);
        }
    }
    
	public static void main(String[] args) {
		int array[] = {55,12,25,64,93,102};
		insertionSort(array);
	}
}




