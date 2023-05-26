import java.util.Scanner;

public class insertion {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        
        System.out.println("After sorting array becomes: ");
        for(int i =0;i<size;i++)
        {
            System.out.println(" "+a[i]);
        }
    }
    
}
