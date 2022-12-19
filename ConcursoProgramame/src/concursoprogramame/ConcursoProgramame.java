/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concursoprogramame;

import java.util.ArrayList;

/**
 *
 * @author gema
 */
public class ConcursoProgramame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < 100; i++) {
            lista.add(i);//lista[i]=i;
        }
        lista.add(10);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));//lista[i]
        }
        ArrayList<String> listaNombres = new ArrayList();
        listaNombres.add("Alvaro");
        listaNombres.add("Ines");
        listaNombres.add("Gema");
        System.out.println(listaNombres.get(2));
        System.out.println(Character.isDigit(65)); //48->0, 65->'A'
        
        char[] chars = listaNombres.get(1).toCharArray();
        boolean encontrado=false;
        
        for (int i = 0; i < chars.length&&encontrado==false; i++) {
            if (chars[i]=='a')
                encontrado=true;
            
        }
        if (encontrado)
            System.out.println("Hay a");
    }

}
