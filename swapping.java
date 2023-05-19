
import java.util.Scanner;
public class swapping {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swapping number becomes a = "+a + " b = "+b);
        
        
    }
}
