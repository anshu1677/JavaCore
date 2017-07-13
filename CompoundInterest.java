import java.util.Scanner;

/**
 * Created by amudaliar on 12/19/2016.
 */
class Compound{

    double amount;
    double principal;
    double rate;
    int years;

    void set(double p, double r, int y)
    {
        principal= p;
        rate = r;
        years = (y<1) ? 1 : y;

    }

    double get(int y)
    {
        return (principal* Math.pow(1.0+rate,y));

    }
}


public class CompoundInterest {

    public static void main(String [] args)
    {
    double p,r,amt;
        int i,y;

        Scanner input = new Scanner(System.in);
        Compound ob1 = new Compound();

        System.out.printf("Enter Principal Amount:-");
        p = input.nextDouble();

        System.out.printf("\nEnter Rate:-");
        r = input.nextDouble();

        System.out.printf("\nEnter Years for which Amount needs to be compounded");
        y = input.nextInt();

        ob1.set(p,r,y);
        amt=0;
        for(i=1;i<y;i++)
        {
            System.out.printf("\nAmount = %f, Year=%d",ob1.get(i),i);
            amt += ob1.get(i);
        }
    }
}
