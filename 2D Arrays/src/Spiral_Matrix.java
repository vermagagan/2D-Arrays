public class Spiral_Matrix
{
    public static void spiralMatrix(int [][] a)
    {
        int sc=0,sr=0,er=a.length-1,ec=a[0].length-1;
        while(sc <= ec && sr <= er)
        {
            //Top left corner to top right corner
            for(int i=sc; i<=ec; i++)
                System.out.print(a[sr][i]+" ");


            //Top right corner to bottom right corner
            for(int i=sr+1; i<=er; i++)
                System.out.print(a[i][ec]+" ");


            //Bottom right corner to bottom left corner
            for(int i=ec-1; i>=sc; i--)
            {
                if(sc==ec)
                    break;
                System.out.print(a[er][i]+" ");
            }

            //Bottom right corner to top left corner
            for(int i=er-1; i>=sr+1; i--)
                System.out.print(a[i][sc]+" ");
            sr++; er--;
            sc++; ec--;
        }
    }
    public static void main(String[] args)
    {
        int a=1;
        int arr [][] = new int [4][4];
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                arr[i][j] = a;
                a++;
            }
        }
        spiralMatrix(arr);
    }
}
