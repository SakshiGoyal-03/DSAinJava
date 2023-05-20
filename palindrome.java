import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int temp = num;
    int rev = 0 ;
    while(temp!=0)
    {
        int r = temp%10;
        temp = temp/10;
        rev = rev*10+r;
    }
    if(num==rev)
    {
        System.out.println(+num + " is a palindrome number");
    }
    else{
        System.out.println(+num + " is not a palindrome number");
    }
}
}
