import java.util.Scanner;
public class JosephusProblem {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of n and k : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = josephus(n,k);
        System.out.println("Answer of Josephus Problem is "+res);
    }
    static int josephus(int n , int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
}
