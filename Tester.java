
/**
 * A class to test the differnt Sorting algorithms.
 *
 * @author Michael Buescher and APCS-A @ Hathaway Brown
 * @version 2022-04
 */
public class Tester
{
    public static void main (String[] args)
    {
        Sorter mySort = new MergeSorterArrayList(16);
        mySort.fill(Sorter.RANDOM);
        mySort.sort();
    }
}
