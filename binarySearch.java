import java.util.Scanner;
import java.util.Arrays;
public class binarySearch {
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
        Arrays.sort(a);
        System.out.println("Enter the element to be search:  ");
        int key = sc.nextInt();

        int start=0;
        int end = size-1;
        int flag = 0;
        while(start<=end)
        {
            int mid  = (start+end)/2;
            if(a[mid]==key)
            {
                flag =1;
                System.out.println("Element is found at index: "+mid);
                break;
                
            }
            else if(a[mid]>key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element is not found in the array");
        }
    }
}
