//TIME COMPLEXITY -----> O(n)
public class Search_in_Sorted_2D
{
    public static void Search(int arr[][], int target)
    {
        int row=0,a=0, col=arr[0].length-1;
        while(row < arr.length && col >= 0)
        {
            if(arr[row][col] == target)
            {
                System.out.print("Number found at :"+"("+row+","+col+" )");
                a=1;
                break;
            }
            else if(target < arr[row][col])
                col--;
            else
                row++;
        }
        if(a == 0)
        System.out.println("Number not found");
    }
    public static void main(String[] args)
    {
        int a=1,target = 17;
        int arr [][] = new int [4][4];
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                arr[i][j] = a;
                a++;
            }
        }
        Search(arr,target);
    }
}
