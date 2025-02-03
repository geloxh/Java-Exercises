package PBL4;

import java.util.*;

public class Arrays 
{
    public static void main(String[] args) 
    {
        int number, elements;
        Scanner input = new Scanner(System.in);

        System.out.println("Input the Number of Elements in the Array: ");
        number = input.nextInt();
        int[] a = new int[number];
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Input the Elements: ");
        for (int i = 0; i < number; i++)
        {
            elements = 0;
            a[i] = input.nextInt();
            for(int j = 0; j < i; j++)
            {
                if(a[j] == a[i])
                {
                    elements = 1;
                    break;
                }
            }
            if(elements != 1)
                array.add(a[i]);
        }
        System.out.println("The New Length of the Array is : " + array.size());
        System.out.println("The Revised Array Without Repeated Elements : ");
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + "\t");
        input.close();
    }
}
