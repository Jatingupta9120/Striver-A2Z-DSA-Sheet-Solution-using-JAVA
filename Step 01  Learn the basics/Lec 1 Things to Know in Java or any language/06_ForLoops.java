import java.util.Scanner;

class Solution {
    public static int fibo(int n){
        if(n==1||n==2)return 1;
        return fibo(n-1)+fibo(n-2);
    }
    // 2nd Approach: Using Loops - Time Complexity = O(n), Space Complexity = O(1)
    public static int fiboo(int n){
        // Initialize variables to store the first two Fibonacci numbers
        int n1=0;
        int n2=1;
         // Loop from 1 to n to calculate the Fibonacci sequence iteratively
        for(int i=0;i<=n;i++){
            // Calculate the next Fibonacci number
            int c=n1+n2;
            // Update a and b to the next pair of Fibonacci numbers
            n1=n2;
            n2=n1;
        }
        // Return the nth Fibonacci number
        return n1;
    }

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        System.out.println(fiboo(n));
        System.out.println(fibo(n));
	}

}
