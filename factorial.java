import java.util.Scanner;
public class factorial {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+n +" is " +fact);
        
    }
}
