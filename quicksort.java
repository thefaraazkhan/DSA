
public class Main
{
    // [2 5 3 4] -> start = 1, end 3, pivot = 4, pIndex = 4, length = 4
    
    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        
        for(int i = start; i < end; i++){
            // System.out.print(i);
            if(arr[i] <= pivot){
                int temp = arr[pIndex]; // temp = 2
                arr[pIndex] = arr[i]; 
                arr[i] = temp;
                pIndex++;
            }
        }
        int temp = arr[pIndex];
        arr[pIndex] = pivot;
        arr[end] = temp;
        // System.out.print(pIndex + " ");
        return pIndex;
    }
    
    // [2 5 3 4]
    //  0     3
    //pivot = 2, pIndex = 0, i=2
    
    public static int[] quickSort(int arr[], int start, int end){
        if(start < end){
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
        return arr;
    }
    
	public static void main(String[] args) {
		
		int arr[] = {100,12, 55, 3, 94};
		int result[] = quickSort(arr, 0, arr.length-1);
		
		System.out.print("After Sorting: ");
// 		for(int num : arr){
//             System.out.print(num);
//         }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(",");
            }
        }
        
	}
}



