/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataloader;

import java.util.ArrayList;
import java.util.*;


public class UserInputLoader implements DataLoader
{
    private String dataInput;
    private ArrayList<String> inputList;
    private ArrayList<Integer> numberList;

    @Override
    public String dataLoader()
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Please Enter integers seperated by spaces: ");
        dataInput = scan.nextLine();
        
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
