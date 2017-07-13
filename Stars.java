/**
 * Created by amudaliar on 1/3/2017.
 */
public class Stars {

    public static void main(String [] args)
    {
        int counter=0;

        for(int i = 1 ; i <= 10 ; i++)
        {
            for (int j = 1 ; j <= i; j++)
            {
                ++counter;
                System.out.printf("\t%d",counter);
            }
            System.out.println();
        }
    }
}
