
/**
 * Write a description of class MergeSorterArray here.
 *
 * @author APCS-A at Hathaway Brown
 * @version 2022-04
 */



public class MergeSorterArray implements Sorter
{
    private int[] nums;
    private int SIZE = 16;
    
    public MergeSorterArray(int n)
    {
        nums = new int[SIZE];
        fill();
    }
    
    // Fill with numbers, then mix them up.
    public void fill()
    {
        for (int i = 0; i < SIZE; i++)
        {
            nums[i] = i;
        }
        for (int i = 0; i < 6 * SIZE; i++)
        {
            int n1 = (int)(Math.random() * SIZE);
            int n2 = (int)(Math.random() * SIZE);
            
            int temp = nums[n1];
            nums[n1] = nums[n2];
            nums[n2] = temp;            
        }
        
        // Print the created and messed-up array
        System.out.print("[" + nums[0]);
        for (int i = 1; i < SIZE; i++)
        {
            System.out.print(", " + nums[i]);
        }
        System.out.println("]");
    }
    
    
    // Fill in the given style
    public void fill(int fillType)
    {
        
    }
    
    // Sort the ArrayList using a Merge Sort
    public void sort()
    {
        mergeSort(nums, 0, SIZE - 1);
    }
    
    
    public void mergeSort (int[] nums, int start, int end)
    {
        int middle = (start + end) / 2;
        
        if (start == end)
        {
            return;
        }
        
        mergeSort (nums, start, middle);
        mergeSort (nums, middle + 1, end);
        
        //merge (nums, start, middle, end);
    }
    
    
    // Sort the ArrayList using a Merge Sort and write 
    // some info while doing it.
    public void sortWithAnalytics()
    {
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        double elapsedSec = elapsedTime / 1000.0;
        System.out.println("Total time: " + elapsedSec + " seconds.");
        System.out.println("Total comparisons: " + comparisons + ".");
    }
}
