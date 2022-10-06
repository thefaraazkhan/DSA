public class Main

//heap sort 

{
// 1st time ever -> arr[] = [0,9,1,6] -> heapsize = 3 , i=1 , left=2, right=3, largest=2

//called heapify with ([0,9,1,6] , heapsize = 3, i=2  > left = 4, right = 5, largest = 2

// calling heapsort with [0,9,1,6] n=3, --> got back [0,6,1,9]

// called heapify with (i=1) [0,1,6,9] heapsize=1, left=2, right=3, largest=1

//****************************************************************************


    public static void heapify(int arr[], int heapSize, int i){ 

        int left = 2 * i;
        int right = 2 * i + 1;
        int largest = i;
        
        if(left <= heapSize &&  arr[left] > arr[largest]){
            largest = left;
        }
        
        if(right <= heapSize &&  arr[right] > arr[largest]){
            largest = right;
        }
        
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapify(arr, heapSize, largest);
        }
    }
    
    public static void buildHeap(int arr[] , int n){
        for(int i=n; i>0; i--){
            heapify(arr, n, i);
        }
    }
    
// 1st iteration returned [0,6,1,9] // i updated to 2  
// called heapify with [0,6,1,9] and heapsize = 2, left = 2, right = 3, largest = 1
// 2nd iteration (i=2) [0,1,6,9]
// called heapify with (i=1) [0,1,6,9]
    
    public static void heapSort(int arr[] , int n){
    
        for(int i = n; i > 1; i--){
            int temp = arr[i]; 
            arr[i] = arr[1];
            arr[1] = temp;
            
            heapify(arr, i - 1, 1);
        }
        
    }
    
	public static void main(String[] args) {
	    int arr[] = { 0,9,8,7,6,5,4,3,2,1};
	    
	    buildHeap(arr, arr.length-1);
	    
	    heapSort(arr, arr.length-1);
	    
	    for(int num : arr){
	        System.out.println(num + " ");
	    }
	    
	    
	    
	    
	}
}



