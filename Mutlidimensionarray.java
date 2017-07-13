/**
 * Created by amudaliar on 11/24/2016.
 */
public class Mutlidimensionarray {

    public static void main(String [] args)
    {
        int a[][] = new int[4][4];
        //int b[][] = new int[10][10];

        set(a);
        get(a);

    }

    public static void set(int x[][])
    {
        int z=0;
          for(int row=0;row<x.length;row++)
            for(int col=0;col<x.length;col++)
                x[row][col]=++z;
    }

    public static void get(int x[][])
    {
     for (int row=0;row<x.length;row++) {
         for (int col =row; col < x.length; col++) {
             System.out.printf("\t%d", x[row][col]);
         }
         System.out.printf("\n");
     }
    }
}
