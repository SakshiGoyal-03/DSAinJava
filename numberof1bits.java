import java.util.Scanner;
public class numberof1bits {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        while(a!=0)
        {
            a = a&(a-1);
            count++;
        }
        System.out.println("Number of 1 bits in a number is " +count );
        
    }
}
