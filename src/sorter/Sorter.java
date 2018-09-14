/**
 * Sorter Class
 */
package sorter;
import java.util.*;

public class Sorter
{
    /**
     * Sequential Sort
     * @param numList 
     * @return numList = sorted
     */
    public ArrayList<Integer> SequentialSort(ArrayList<Integer> numList)
    {
        for (int i = 0; i < numList.size()-1; i++ )
        {
            int minimum = i;
            
            for (int j = i + 1; j < numList.size(); j++)
            {
                if(numList.get(j) < numList.get(minimum))
                {
                    minimum = j;
                }
            }
            
            if (minimum != i)
            {
                int temp = numList.get(i);
                numList.set(i, numList.get(minimum));
                numList.set(minimum, temp);
            }
        }
        return numList;
    }
}
