
/**
 * Write a description of class MergeSorterArrayList here.
 *
 * @author APCS-A at Hathaway Brown
 * @version 2022-04
 */

import java.util.ArrayList;

public class MergeSorterArrayList implements Sorter
{
    public static final int SIZE = 16;
    private ArrayList<Integer> nums;
    private int comparisons;
    
    public MergeSorterArrayList(int n)
    {
        nums = new ArrayList<Integer>();
        fill();
    }
    
    // Fill with numbers, then mix them up.
    public void fill()
    {
        for (int i = 0; i < SIZE; i++)
        {
            nums.add(i);
        }
        for (int i = 0; i < 100; i++)
        {
            int n1 = (int)(Math.random() * SIZE);
            int n2 = (int)(Math.random() * SIZE);
            
            int temp = nums.get(n1);
            nums.set(n1, nums.get(n2));
            nums.set(n2, temp);
        }
        
        // Print the created & messed up ArrayList
        System.out.println(nums);
    }
    
    // Fill in the given style
    public void fill(int fillType)
    {
        
    }
    
    // Sort the ArrayList using a Merge Sort
    public void sort()
    {
        mergeSort(nums);
    }
    
    
    public ArrayList<Integer> mergeSort(ArrayList<Integer> nums)
    {
        if (nums.size() <= 1)
        {
            return nums;
        }
        
        // Divide into two lists
        ArrayList<Integer> nums1 = nums;
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        
        int middle = nums.size() / 2;
        while (middle < nums.size())
        {
            nums2.add(nums1.remove(middle));
        }
        
        
        nums1 = mergeSort(nums1);
        nums2 = mergeSort(nums2);
        
        //nums = merge (nums1, nums2);
        return nums;
    }
    
    
    // Sort the ArrayList using a Merge Sort and write 
    // some info while doing it.
    public void sortWithAnalytics()
    {
        long startTime = System.currentTimeMillis();
        comparisons = 0;
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        double elapsedSec = elapsedTime / 1000.0;
        System.out.println("Total time: " + elapsedSec + " seconds.");
        System.out.println("Total comparisons: " + comparisons + ".");
    }
}
