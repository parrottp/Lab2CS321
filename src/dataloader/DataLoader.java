package dataloader;
import java.util.*;

public interface DataLoader
{
    /**
     * Loads data from different sources
     * @return dataInput
     */
    public String dataLoader();
    /**
     * Converts string input into ArrayList<String>
     * @param s input String
     * @return inputList
     */
    public ArrayList<String> convertArray(String s);
    /**
     * Converts ArrayList<String> to ArrayList<Integer>
     * @param sList input ArrayList
     * @return numberList
     */
    public ArrayList<Integer> convertArrayInt(ArrayList<String> sList);
}
