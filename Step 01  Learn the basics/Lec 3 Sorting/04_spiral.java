class Spiral{
    public static void Spiral(int mat[][]){
        int sr=0;
        int sc=0;
        int er=mat.length-1;
        int ec=mat[0].length-1;

        while(sr<=er&&sc<=ec){
            //top

            for(int j=sc;j<=ec;j++){
                System.out.println(mat[sr][j]+" ");
            }

            //right

            for(int j=sr+1;j<=er;j++){
                System.out.println(mat[sr][j]+" ");
            }

            //bottom

            for(int j=ec-1;j>=sc;j--){
                if(sc==ec)return;
                System.out.println(mat[er][j]+" ");
            }

            //left

            for(int j=er-1;j>=sr+1;j--){
                System.out.println(mat[j][sc]+" ");
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[] args) {
        int mat[][]={{
            1,2,3,4
        },{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    }
}