class Solution{
    public static void printStart(int n){
         // Iterate over each row
        for(int i=0;i<=n;i++){
                // Iterate over each column in the current row
                for(int j=0;j<=n;j++){
                     // Print an star(*) followed by a space
                    System.out.print("*");
                }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStart(3);
    }
}
// console.log(jnkdnsnv);