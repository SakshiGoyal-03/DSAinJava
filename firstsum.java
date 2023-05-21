import java.util.Scanner;
public class firstsum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = printSum(a);
        System.out.println("Sum of first "+a +" natural number is "+res);
    }
    static int printSum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+printSum(n-1);
    }
}
