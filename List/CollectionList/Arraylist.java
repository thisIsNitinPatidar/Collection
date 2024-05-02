package CollectionList;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList();
        al.add("ajay");
        al.add("pooja");
        al.add("minku");
        al.add("sneha");
        al.add("payal");
        al.add("vaishu");
        System.out.println(al);//[ajay, pooja, minku, sneha, payal, vaishu]
        System.out.println(al.get(al.size() - 2));//payal
        al.remove("pooja");
        System.out.println(al);//ajay, minku, sneha, payal, vaishu]
        System.out.println(al.size());//5
        System.out.println(al.contains("payal"));//true(present)
        System.out.println(al.contains("pooja"));//false(absent)
        al.remove(1);
        System.out.println(al);//[ajay, sneha, payal, vaishu]
       // al.clear();
       //  System.out.println(al);//[]
        ArrayList<String> a2 = new ArrayList();
        a2.add("megha");
        a2.add("radhika");
        a2.add("pragya");
        a2.add("akash");
         a2.add("payu");
          a2.add("ronu");
          System.out.println("a2:"+a2);
          al.addAll(a2);
          System.out.println("al:"+al);
          al.removeAll(a2);
          System.out.println("al:"+al);

    }
}
