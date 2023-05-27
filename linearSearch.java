import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the array :  ");
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be search:  ");
        int key = sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==key)
            {
                flag =1;
                System.out.println("Element is found at index "+i);
            }
        }
        if(flag==0)
        {
            System.out.println("Element is not found in the array ");
        }
    }
}
