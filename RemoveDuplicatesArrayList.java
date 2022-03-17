/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicatesarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class RemoveDuplicatesArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> removeDup = new ArrayList<>();

        System.out.println("Enter 10 integers ");

        while (removeDup.size() < 10) {
            removeDup.add(scan.nextInt());
        }
        removeDuplicate(removeDup);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        
        int j=0;
        
        ArrayList<Integer> list1 = new ArrayList<>();

        for (Integer integer : list) {
            if(!list1.contains(integer)){
                list1.add(integer);
            }
            
        }
        System.out.println("the new list is "+list1); 
    }

}
