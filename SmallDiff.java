package PBL4; 

import java.util.*; // Importing the utility package for Scanner

public class SmallDiff // Class declaration
{
    public static void main(String[] args) // Main method
    {
        Scanner input = new Scanner(System.in); // Creating a Scanner object for input
        int n, i;
        System.out.println("Input the Number of Elements in the Array : "); // Prompting user for number of elements
        n = input.nextInt(); // Reading the number of elements
        int[] a = new int[n]; // Initializing the array with the given size
        System.out.println("Input the Elements : "); // Prompting user to input elements
        for (i = 0; i < n; i++)
            a[i] = input.nextInt(); // Reading array elements
        System.out.println("The Required Index is : " + gap(a, n)); // Calling the gap method and printing the result
        input.close(); // Closing the Scanner object
    }

    public static int gap(int[] a, int n) // Method to find the smallest difference between neighboring elements
    {
        int min, pos, i;
        min = Math.abs(a[1] - a[0]); // Initializing min with the absolute difference of the first two elements
        pos = 0; // Initializing position
        for (i = 1; i < n - 1; i++) // Looping through the array to find the smallest difference
        {
            if (min > Math.abs(a[i] - a[i + 1])) // Checking if the current difference is smaller than the min
            {
                min = Math.abs(a[i] - a[i + 1]); // Updating min
                pos = i; // Updating position
            }
        }
        System.out.println("The Neighboring Elements with the least Distance are : " + a[pos] + " " + a[pos + 1]); // Printing the neighboring elements with the smallest difference
        return(pos); // Returning the position of the first element of the pair with the smallest difference
    }
}
