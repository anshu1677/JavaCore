import java.util.Scanner;

/**
 * Created by amudaliar on 1/3/2017.
 */
public class LinearSearch {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr1 = new int[10];
        int search,i,flag;

        System.out.println("Enter 10 Integers:");
        for(i=0;i<10;i++)
        arr1[i] = input.nextInt();

        System.out.println("Enter the Number to be searched");
        search = input.nextInt();

        for(i=0;i<10;i++)
        {
            if(arr1[i]==search)
                break;
            else
            {
                continue;
            }
        }

        System.out.printf("Arr[%d] = %d",i,arr1[i]);
    }
}
