package PBL4;

import java.util.*;

public class Peak 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, i;
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        System.out.println("Input the Number of Elements in the Array: ");
        n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Input the Elements: ");
        for (i = 0; i < n; i++)
            a[i] = input.nextInt();
        if (a[0] > a[1])
            arrays.add(a[0]);
        for (i = 1; i < n - 1; i++)
        {
            if (a[i] > a[i - 1] && a[i] > a[i + 1])
            {
                arrays.add(a[i]);
                i++;
            }
        }
        if (a[n - 1] > a[n - 2] )
            arrays.add(a[n - 1]);

        System.out.println("The Peak Elements in the Given Array are : ");
        for (i = 0; i < arrays.size(); i++)
            System.out.println(arrays.get(i) + "\t");
        input.close();
    }    
}
