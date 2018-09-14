/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainactivity;
import java.io.*;
import java.util.*;
import dataloader.*;
import sorter.*;

/**
 *
 * @author Payton Parrott
 */
public class MainActivity
{   
    public static void main(String[] args)
    {
       DataLoader userInput = new UserInputLoader();
       DataLoader fileLoader = new FileDataLoader();
       Sorter sorter = new Sorter();
       
       ArrayList<Integer> input = fileLoader.convertArrayInt(fileLoader.convertArray(fileLoader.dataLoader()));
       
       for (int i : fileLoader.convertArrayInt(fileLoader.convertArray(fileLoader.dataLoader())))
       {
           System.out.print(i + " ");
           System.out.println(" ");
       }
       
       for (int i : sorter.sort(input))
       {
           System.out.print(i + " ");
       }
       
       
    }
}
