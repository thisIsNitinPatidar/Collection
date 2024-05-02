

package com.mycompany.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;


public class Linkedlist 
{

   public static void main(String[] args) 
    {
         LinkedList<String> list = new LinkedList<>(); 
  
        list.add("monika"); 
        list.add("payal"); 
        list.add(1, "palak"); 
        list.add("shweta");
        list.add("aryan");
        System.out.println(list); 
        System.out.println(list.getFirst());
        list.remove("payal");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("pooja"));
        System.out.println(list.contains("monika"));
//        list.clear();
//        System.out.println(list);
        System.out.println(list.indexOf("shweta"));
        System.out.println(list.lastIndexOf("aryan"));
    }
    
}
