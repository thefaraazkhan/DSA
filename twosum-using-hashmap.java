/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        int required = target - nums[i];
        if(map.get(required) != null){
          return new int[] {i,map.get(required)};
        }else{
          map.put(nums[i],i);
        }
      }
      return new int[] {};
    } 
}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
