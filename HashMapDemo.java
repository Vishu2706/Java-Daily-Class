package com.collection;

import java.util.HashMap;
import javax.swing.text.html.HTMLDocument;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101, "jaimin");
        hm.put(909,"Vatsal");
        hm.put(778,"Rutvik");
        hm.put(565,"Jigar");
        hm.put(565,"Badal");

        System.out.println(hm);
        System.out.println(hm.get(565));
        hm.replace(101,"Jaimin Prajapati");
        System.out.println(hm);
        Set set = hm.entrySet();
           Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}