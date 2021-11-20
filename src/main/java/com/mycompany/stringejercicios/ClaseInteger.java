/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringejercicios;

/**
 *
 * @author alex
 */
public class ClaseInteger 
{
    public static void main (String[] args)
    {
        int w;
        Integer e = new Integer(100);
        Integer r = new Integer(200);
        Integer y = new Integer(1000);
        String numero="12345";
        String octal="03731";
        String hexadeximal="0x7C9";
        w = 12;
        
        System.out.println(
        Integer.bitCount(w)+" "+
        Integer.toBinaryString(w)+" "+
        Integer.compare(w, y)+" "+
        e.compareTo(r)+" "+
        Integer.decode(numero)+" "+
        Integer.decode(octal)+" "+
        Integer.decode(hexadeximal)+" "+
        y.equals(e)
                
        );
    }
    
}
