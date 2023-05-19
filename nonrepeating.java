import java.util.Scanner;
public class nonrepeating {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int r = 0;
        for(int i=0;i<n;i++)
        {
            r = r^a[i];
        }
        System.out.println("Non repeating Element is "+r);
        
    }
}
