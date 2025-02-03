package PBL3;

import java.util.Scanner;

public class Find 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // Create a Scanner object for input
        int[] arr = new int[10]; // Initialize an array to store up to 10 integers
        int i, n, min, res = 0, check = 0;

        System.out.println("Enter the Number of Elements in the Array: ");
        n = input.nextInt(); // Read the number of elements in the array

        System.out.println("Enter the Numbers: ");
        for (i = 0; i < n; i++)
            arr[i] = input.nextInt(); // Read the elements of the array

        // Determine initial values for min and res based on the first two elements
        if (arr[0] > arr [1])
        {
            min = arr [1];
            res = arr [0];
            check++;
        }
        else if(arr[0] == arr[1])
        {
            min = arr[0];
            for(i = 2; i < n; i++)
                {
                    if(arr[i] != 0)
                    {
                        res = arr[i];
                        check++;
                        break;
                    }
                }
        }
        else
        {
            min = arr[0];
            res = arr[1];
            check++;
        }

        // Check if all numbers are equal
        if(check == 0)
            System.out.println("All Numbers are Equal and there is no Second Smallest Number!!! ");
        else
        {
            // Find the second smallest number in the array
            for (i = 2; i < n; i++)
            {
                if (arr[i] < res && arr[i] > min)
                    res = arr [i];
                else if(arr[i] < min)
                {
                    res = min;
                    min = arr[i];
                }
            }
            System.out.println("The Second Smallest Number in the given array is: " +  res);
        }
    }
}
