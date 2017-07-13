import java.security.SecureRandom;

/**
 * Created by amudaliar on 12/23/2016.
 */
public class RandomNo {

    public static void main(String [] args)
    {
        int [] arr= new int [7];
        SecureRandom randomNumber = new SecureRandom();

        int val;


        System.out.printf("Number   Frequency\n");
        for(int i=1;i<=50000;i++) {
            //val = randomNumber.nextInt(5);
            ++arr[1+randomNumber.nextInt(6)];
        }
        for(int i=1;i<=6;i++)
        System.out.printf("\n%d\t\t\t%d", i,arr[i]);

    }
}
