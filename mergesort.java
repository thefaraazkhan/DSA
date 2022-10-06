/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/



public class Main
{
    //merge sort 
    
    
     // 5 4 1 2 9  length = 5  mid = 2  leftArr = 2  rightArr = 3 
     
     // first mergeSort(array)
     //mid 4
     //leftArr = 5 4
     //rightArr = 1 2 9
     
     // got [4,5] in left from second mergeSort();
     // called fifth mergeSort(right);
     // got [1,2,9] in right from fifth mergeSort();
     
     // called merge();
     // merge(left = [4, 5] , right = [1,2,9], arr=[5,4,1,2,9])
     
     // arr = [1, 2, 4, 5, 9]
     
     
     
     
     
     
     // 5 4 length = 2  mid = 1  leftArr = 1  rightArr = 1
     
     // second mergeSort(left); 
     //mid 2
     //leftArr = 5
     //rightArr = 4
     
     // got 5 in return from third call
     // got 4 in return from fourth call
     
     
     // called merge();
     
     // merge(left = [5] , right = [4], arr = [5,4])
     
     // arr = 4 5
     
     // merge return [4,5] to second mergeSort();
     
     
     // **********************************************
     
     // 5  length = 1  mid =   leftArr =   rightArr = 
     
     // third mergeSort(left);
     //returned 5 to second call
     
     
     
     // 4 length = 1  mid =   leftArr =   rightArr = 
     
     //fourth mergeSort(right);
     // returned 4 to second call
     
     // ************************************************
     
     
     
     // 1 2 9  length = 3  mid = 1  leftArr = 1  rightArr = 2
     // fifth mergeSort(right);
     
     //mid 2
     // leftArr = 1
     // rightArr = 2 9
     
     // called sixth mergeSort(left);
     // got 1 from sixth mergeSort in left();
     // called seveth mergeSort(right);
     // got [2,9] from seveth mergeSort()
    
     // called merge();
     // merge(left = [1], right = [2,9], arr = [1, 2 , 9])
     
     // arr = [1 , 2, 9 ]  
     
     // return [1 , 2, 9 ] to 
     
     
     
     // 1  length = 1  mid =   leftArr =   rightArr = 
     // sixth mergeSort(left);
     // returned 1 to fifth mergeSort();
     
     
     
     // 2 9  length = 2  mid = 1  leftArr =  1 rightArr = 1
     // seveth mergeSort(right);
     
     // mid 2
     //leftArr = 2
     //rightArr = 9
     
     //called eight mergeSort(left)
     // got 2 from eight mergeSort in left();
     // called ninth mergeSort(right);
     // got 9 from ninth mergeSort();
     
     
    // called merge();
     
    // merge(left = [2] , right = [9], arr = [2,9])
     
    // arr = 2 , 9
    
    
    // return [2,9] to 
    
    
    
    // ********************************************************** 
     
     
     // 2  length = 1 mid =   leftArr =   rightArr = 
     // eigth mergeSort(left);
     
     // return 2 to seveth mergeSort();
     
     
     // 9  length = 1 mid =   leftArr =   rightArr = 
     // ninth mergeSort(right);
     
     // return 9 to seveth mergeSort();
     
     
     // **************************************************************
    
    public static int[] mergeSort(int arr[]){
        
        if(arr.length < 2){
            return arr;
        }
        
        int mid = arr.length / 2;
        
        
        
        int leftArr[] = new int[mid]; 
        int rightArr[] = new int[arr.length - mid];
        
        for(int i = 0; i < leftArr.length; i++){
            leftArr[i] = arr[i];    
        }
        
        for(int i = 0; i < rightArr.length; i++){
            rightArr[i] = arr[mid];
            mid++;
        }
        
        
        int lArr[] =  mergeSort(leftArr);
        int rArr[] =  mergeSort(rightArr);
        
        return merge(lArr, rArr, arr);
    }
    
   
    
    public static int[] merge(int left[], int right[], int arr[]){
        int lPointer = 0;
        int rPointer = 0;
        int mPointer = 0;    
            
        while(mPointer < arr.length && lPointer < left.length && rPointer < right.length){
            
            if(left[lPointer] < right[rPointer]){
                arr[mPointer] = left[lPointer];
                lPointer++;
            }else{
                arr[mPointer] = right[rPointer];
                rPointer++;
            }
            
            mPointer++;
        }
        
        while(lPointer < left.length){
           arr[mPointer] = left[lPointer];
           mPointer++;
           lPointer++;
        }
        
        while(rPointer < right.length){
            arr[mPointer] = right[rPointer];
            mPointer++;
            rPointer++;
        }
        
        return arr;
    }
    
     
    
	public static void main(String[] args) {
	    

	    
	    
	    int array[] = { 5, 4, 1, 2, 9, 28, 52 , 105};
	    
	    int sortedArr[] = mergeSort(array);
	    
	    
	    for(int num : sortedArr){
	        System.out.println(num);
	    }
	}
}

