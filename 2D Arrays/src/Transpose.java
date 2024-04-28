//TIME COMPLEXITY ----> O(n^2)
public class Transpose
{
    public static void transpose(int arr[][])
    {
        int row = arr.length,col = arr[0].length;
        int n[][] = new int[col][row];
        for(int i=0; i< n.length; i++)
        {
            for(int j=0; j<n[0].length; j++)
            {
                n[i][j] = arr[j][i];
            }
        }
        for(int i=0; i<n.length; i++)
        {
            for(int j=0; j<n[0].length; j++)
                System.out.print(n[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr [][] = {{2,4,5},{6,7,9}};
        transpose(arr);
    }
}