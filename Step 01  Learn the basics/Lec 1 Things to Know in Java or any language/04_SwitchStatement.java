//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1
import java.util.*;
class Solution{
    // Time Complexity = O(1), Space Complexity = O(1)
    static double switchCase(int choice, List<Double> arr){
        // code here
        // Check the user's choice to determine the shape
        switch(choice){
            case 1:// Choice 1: Calculate area of a circle
                return Math.PI*arr.get(0)*arr.get(0);
            case 2:// Choice 1: Calculate area of a circle
                return arr.get(0)*arr.get(1);
        }
        // Default return value if choice is neither 1 nor 2
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        List<Double> arr = new ArrayList<>();
        double result = switchCase(choice, arr);
        System.out.println("Result: " + result);

    }
}