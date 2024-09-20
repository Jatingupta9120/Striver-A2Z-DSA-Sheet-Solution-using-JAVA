// here is the bubble sort in which it means if will check whether arr[j]>arr[i] then it will perform swap  
public class Sorting{
    public static void bubbleSort(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,3,1,4,2};
        bubbleSort(arr);
        PrintArr(arr);
    }
}
// A sample Java program to sort an array
// in descending order using Arrays.sort().
