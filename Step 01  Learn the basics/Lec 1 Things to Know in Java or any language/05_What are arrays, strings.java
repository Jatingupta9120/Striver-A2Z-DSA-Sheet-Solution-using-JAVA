//String in Java
// string is a sequence in java of character used for text
// they are immutable and once they are created they are unable to change .cannot be able to change.We can manipulate th string using various methods
//For example:
 class news {
    public static void main(String[] args) {
        // Declare and initialize a string variable
        String s="jatim";
        // Get the length of the string
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            // Access individual characters of the string using the charAt method
            System.out.println(s.charAt(i));
        }
        // Access individual characters of the string using the charAt method
        System.out.println(s.charAt(1));
    }
}
/* 
 * Arrays in Java is a collection of elements in same type of data stored in a contiguous memory Location .they are fixed in size and accessed using indices
 * Each element in an array is identified by an index, which starts at 0.

For example:
*/
class Array{
    public static void main(String[] args) {
        // Declare an array of integers with a length of 4
        int arr[]=new int[4];

        // Assign values to the elements of the array
        arr[3]=10;
        // Access the elements of an array using the square brackets operator
        int a=arr[1];
        System.out.println(a);
    }
}