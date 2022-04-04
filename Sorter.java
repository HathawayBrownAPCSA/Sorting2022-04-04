
/**
 * A generic Sorter.
 * Then make other Sorters that inherit from Sorter.
 *
 * @author APCS-A @ Hathaway Brown
 * @version 2022-04
 */
public interface Sorter
{
    // constants telling what the list should look like to start
    public static final int RANDOM = 0;
    public static final int SORTED = 1;
    public static final int ALMOST_SORTED = 2;
    public static final int REVERSE = 3;
    
    public void fill();
    public void fill(int fillType);
    public void sort();
    public void sortWithAnalytics();
}
