import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans  = findPower(a,b);
        System.out.println("Answer is  "+ans);
    }
    static int findPower(int a , int b)
    {
        if(b==0)
        {
            return 1;
        }
        return a*findPower(a,b-1);
    }
}
