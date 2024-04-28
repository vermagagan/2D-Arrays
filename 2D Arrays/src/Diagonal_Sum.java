//TIME COMPLEXITY -----> O(n),  SPACE COMPLEXITY  -----> O(3)
public class Diagonal_Sum
{
    public static void diagonalMatrix(int arr[][])
    {
        int sum = 0, j=arr[0].length-1;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i][i] + arr[i][j];
            j--;
        }
        if((arr.length)%2 != 0)
        {
            int a = (arr.length-1)/2;
            sum -= arr[a][a];
        }
        System.out.println("Diagonal Sum: "+(sum));

    }
    public static void main(String[] args)
    {
        int a=1;
        int arr [][] = new int [7][7];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                arr[i][j] = a;
                a++;
            }
        }
        diagonalMatrix(arr);
    }
}
