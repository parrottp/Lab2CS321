package dataloader;

import java.util.ArrayList;
import java.util.*;

public class UserInputLoader implements DataLoader
{
    /**
     * Data Loader for user input
     * @return dataInput
     */
    @Override
    public String dataLoader()
    {
        String dataInput;
        Scanner scan = new Scanner(System.in);        
        System.out.println("Please Enter integers seperated by spaces: ");
        dataInput = scan.nextLine();
        
        return dataInput;
    }
     /**
     * Converts string input into ArrayList<String>
     * @param s input String
     * @return inputList
     */
    @Override
    public ArrayList<String> convertArray(String s)
    {
        ArrayList<String> inputList;
        inputList = new ArrayList<>(Arrays.asList(s.split(" ")));
        return inputList;
    }
    /**
     * Converts ArrayList<String> to ArrayList<Integer>
     * @param sList input ArrayList
     * @return numberList
     */
    @Override
    public ArrayList<Integer> convertArrayInt(ArrayList<String> sList)
    {
        ArrayList<Integer> numberList;
        numberList = new ArrayList<>();
        
        sList.forEach((s) -> {
            try
            {
                numberList.add(Integer.parseInt(s));
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("Parsing failed! " + s + " can not be an integer");
            }
        });
       
        return numberList;    
    }
}
