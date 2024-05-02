

package com.mycompany.vector;
import java.util.*;

public class vector 
{

    public static void main(String[] args) 
    {
        Vector<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(3);
        
         v1.add(7);
         v1.add(5);
         v1.add(9);
         v1.addElement(1);//legacy method
         v1.add(8);
         v1.addElement(4);
         System.out.println(v1);
         v1.remove(5);
         v1.removeElement(7);
         System.out.println(v1);
         System.out.println(v1.capacity());
         v1.trimToSize();
         System.out.println(v1.capacity());
         Iterator itr = v1.iterator();
         System.out.println("Element of vector");
         while(itr.hasNext())
         {
             System.out.println(itr.next());
         }
    }
}
