
/**
 * Performs a binary search recursively.
 *
 * @author APCS-A at Hathaway Brown
 * @version 2022-04
 */

import java.util.Scanner;

public class RecursiveBinarySearch
{
    public static final int COUNT = 16;
    
    public static int binarySearch (int[] nums, int n)
    {
        return binarySearch (nums, n, 0, COUNT - 1);
    }
    
    public static int binarySearch (int[] nums, int n, int low, int high)
    {
        int middle = (low + high) / 2;
        System.out.println (low + "  " + middle + "  " + high);
        
        // Not found at all!
        if (low > high)
        {
            return -1;
        }
        
        // Found it!
        if (n == nums[middle])
        {
            return middle;
        }
        
        // Too high
        if (n < nums[middle])
        {
            return binarySearch(nums, n, low, middle - 1);
        }
        // Too low
        else
        {
            return binarySearch(nums, n, middle + 1, high);
        }
    }
    
    public static void main (String[] args)
    {
        // declare and fill an array of random integers, in increasing order
        int[] numbers = new int[COUNT];
        int n = 1 + (int)(Math.random() * 6);
        for (int i = 0; i < COUNT; i++)
        {
            numbers[i] = n;
            n += 1 + (int)(Math.random() * 6);
        }
        
        // Print the list
        System.out.print("[");
        for (int i = 0; i < COUNT - 1; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[COUNT - 1] + "]");
        
        
        // Search the array for a variety of values
        Scanner kbd = new Scanner (System.in);
        
        System.out.println("Enter numbers to search for. Enter 0 to quit.");
        int target = kbd.nextInt();
        while (target != 0)
        {
            // Search for target
            int index = binarySearch(numbers, target);
            if (index == -1)
            {
                System.out.println(target + " not found in the array.");
            }
            else
            {
                System.out.println(target + " found in the array at index " + index);
            }
            
            // Get next target
            System.out.print("Next number: ");
            target = kbd.nextInt();
        }
        
        
        kbd.close();
    }
}
