
package dataloader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class FileDataLoader implements DataLoader
{  
    /**
     *
     * @return dataInput
     */
    @Override
    public String dataLoader()
    {
         BufferedReader aReader = null;
        
        String dataInput = null;
        try
        {
            aReader = new BufferedReader(new FileReader("data.txt"));
            dataInput = aReader.readLine();
            aReader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return dataInput;
    }
    
    @Override
    public ArrayList<String> convertArray(String s)
    {
        ArrayList<String> inputList;
        inputList = new ArrayList<>(Arrays.asList(s.split(" ")));
        return inputList;
    }
    
    @Override
    public ArrayList<Integer> convertArrayInt(ArrayList<String> sList)
    {
        ArrayList<Integer> numberList;
        numberList = new ArrayList<>();
    
        for (String s : sList)
        {
            try
            {
                numberList.add(Integer.parseInt(s));
            }
            catch(NumberFormatException nfe)
            {
              System.out.println("Parsing failed! " + s + " can not be an integer");
            }
        }
        return numberList;
    }
}
