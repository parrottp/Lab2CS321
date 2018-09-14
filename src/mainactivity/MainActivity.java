/**
 * Main Activity for DataLoader and Sorter
 * 
 * Payton Parrott 
 * 
 * CS321
 */
package mainactivity;
import java.util.*;
import dataloader.*;
import sorter.*;

public class MainActivity
{   
    /**
     * MainActivity
     * @param args Input arguments
     */
    public static void main(String[] args)
    {
        DataLoader userInput = new UserInputLoader();
        DataLoader fileLoader = new FileDataLoader();
        Sorter sorter = new Sorter();
       
        System.out.println("-------------------------------------------------");
        System.out.println("This program sorts integers entered by the\nuser "
               + ",and from 'data.txt'.");
        System.out.println("-------------------------------------------------");
        String user = userInput.dataLoader();
        System.out.println("-------------------------------------------------");
       
        //Converts and stores user input in ArrayList<Integer>
        ArrayList<Integer> storedUserInput = userInput.convertArrayInt(
               userInput.convertArray(user));
        
        //Converts and stores file input in ArrayList<Integer>
        ArrayList<Integer> storedFileInput = fileLoader.convertArrayInt(
                fileLoader.convertArray(fileLoader.dataLoader()));
        
        System.out.println("Unsorted user inputed integers: ");
        
        //prints out unsorted array list
        printArrayListInt(storedUserInput);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted user inputed integers: ");
        
        //Sorts and prints out arraylist
        printArrayListInt(sorter.SequentialSort(storedUserInput));
        
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Unsorted integers from 'data.txt': ");
        
        //prints out unsorted array list
        printArrayListInt(storedFileInput);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted integers from 'data.txt': ");
        
        //Sorts and prints out arraylist 
        printArrayListInt(sorter.SequentialSort(storedFileInput));
        System.out.println("-------------------------------------------------");
    }
    /**
     * Prints Integer ArrayList
     * @param input ArrayList<Integer>
     */
    public static void printArrayListInt(ArrayList<Integer> input)
    {
        for (int i : input)
        {
           System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
