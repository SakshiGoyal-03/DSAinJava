import java.util.Scanner;
import java.util.Arrays;
public class SieveOfEratosthenes {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean arr[] = new boolean[a+1];
        
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=a;i++)
        {
             for(int j = 2*i;j<=a;j+=i)
             {
                    arr[j] = false;
             }
        }
        for(int i=0;i<=a;i++)
        {
            if(arr[i]==true)
            {
                System.out.println("  " +i  +"  ");
            }
        }
        
    }
}
