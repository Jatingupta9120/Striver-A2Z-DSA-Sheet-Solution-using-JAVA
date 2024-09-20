class SearchSorted{

    //Search Sorted
    public static boolean SearchSorted(int mat[][],int key){
        int row=0;
        int col=mat.length-1;
        while(row<mat.length&&col>=0){
                if(mat[row][col]==key){
                    return true;
                }else if(key<mat[row][col]){
                    col--;
                }else{
                    row--;
                }
    }
        
        return false;

    }

    //diagonal sum
    public static int diagonalSum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //pd
            sum+=mat[i][i];
            //sd
            if(i!=mat.length)
            sum+=mat[i][mat.length-i-1];
        }
        return sum;
    }
    public static int countSeven(int mat[][],int key){
        int ct=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==key){
                    ct++;
                }
            }
        }
        return ct;
    }

    public static int calSum(int mat[][]){
        int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[1][j];
            }
        
        return sum;
    }

    public static void printMatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int mat[][]={{
            1,2,3,4
        },{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=16;
        System.out.println(SearchSorted(mat,key));
        int row=0;
        int col=mat.length;
        int transpose[][]=new int[row][col];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                transpose[j][i]=mat[i][j];
            }
        }
        printMatrix(mat);
    }}