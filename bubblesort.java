//Bubble Sort

public class Main
{
    public static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++ )
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        arrayPrint(arr);
    }
    
    public static void arrayPrint(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    // 5 1 25 4
    // 1 5 4 25 -> itr1 i=0
    // 1 4 5 25 -> itr i=1
    
	public static void main(String[] args) {
		int array[] = {5,1,25,4,3,2};
		bubbleSort(array);
		
	}
}

