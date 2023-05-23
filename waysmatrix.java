import java.util.Scanner;
public class waysmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows in a matrix: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns in a matrix: ");
        int n = sc.nextInt();
        int ways = countWays(m,n);
        System.out.println("Number of ways in a matrix is "+ways);
    
    }
    static int countWays(int m,int n)
    {
        if(m==1||n==1)
        {
            return 1;
        }
        return countWays(m-1,n)+countWays(m,n-1);
    }
    
}
