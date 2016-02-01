/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rich
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // creating a user entry integer
        Integer userNumber = new Integer(0);
        //declare and create 2 arraylists
        MyArrayList<Integer> List1 = new MyArrayList<Integer>();
        MyArrayList<Integer> List2 = new MyArrayList<Integer>();
        //first arraylist with ordered numbers
        List1.add(new Integer(4));
        List1.add(new Integer(6));
        List1.add(new Integer(17));
        List1.add(new Integer(34));
        List1.add(new Integer(55));
        List1.add(new Integer(67));
        //second arraylist with unordered numbers
        List2.add(new Integer(6));
        List2.add(new Integer(1));
        List2.add(new Integer(34));
        List2.add(new Integer(5));
        List2.add(new Integer(57));
        List2.add(new Integer(2));

        //taking a user entered number to compare against the list
        System.out.println("Please enter a search number for both ordred and unordered lists: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        userNumber = Integer.parseInt(br.readLine());
        
        List1.OrderedSequential(userNumber);
        List2.UnorderedSequential(userNumber);
        int pos = List1.OrderedSequential(userNumber)+1;//user doesn't know first index = 0 so adding 1 for clarity
        
        //searching the ordered list for the key element
        System.out.println("***Ordered List Search Results:*** ");
        if(List1.OrderedSequential(userNumber)== -1){
           System.out.println("The number " + userNumber + " was not found in the Ordered List: "); 
           System.out.println("");//just adding blank spaces yuuuupp!
           System.out.println("");//just adding blank spaces yuuuupp!
        }
        else{
            System.out.println("The number " + userNumber + " was found in position: " + pos  + " in the list" ); 
            System.out.println("");//just adding blank spaces yuuuupp!
            System.out.println("");//just adding blank spaces yuuuupp!
        } 
        
        /*
        //searching the unordered list for the key element
        System.out.println("***Unordered List Search Results:*** ");
        if(List2.UnorderedSequential(userNumber)== -1){
           System.out.println("The number " + userNumber + " was not found in the Unordered List: "); 
           System.out.println("");
           System.out.println("");
        }
        else{
            System.out.println("Element " + userNumber + 
                    " was found in position: " + List2.UnorderedSequential(userNumber) +" in the list" ); 
            System.out.println("");
            System.out.println("");
        }
        */
    }   
}
