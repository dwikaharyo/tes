/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Contoh1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Eduardus");
        list.add("Hardika");
        list.add("Sandy");
        list.add("Atmaja");
        list.add(1);
	 System.out.println(list);
        System.out.println("2 : " + list.get(2));
        
        System.out.println("0 : " + list.get(0));

    }
}
