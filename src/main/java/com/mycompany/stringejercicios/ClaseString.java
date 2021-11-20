/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringejercicios;

/**
 *
 * @author alex
 */
public class ClaseString 
{
    public static void main (String[] args)
    {
        String s1 = "Hola desde java";
        
        String s2;
        s2 = s1;
        
        String s3 = new String();
        
        String s4 = new String(s1);
        
        s3 = s1;
        
        char[] c1 = {'h','o','l','a',' ','a','h','i'};
        String s5 =new String(c1);
                
        String s6;
        
        s6 =  new String(c1,0,4);
                
        double doublea;
        String s7;
        doublea = 1.23456789;
        s7 = String.valueOf(doublea);
        
        System.out.println("S2 "+s2+" s3 "+s3+" s4 "+s4+" s5 "+s5+" s6 "+s6+" s7 "+s7);
        System.out.println("S1 logitud "+s1.length());
        
        
        System.out.println("hola contiene "+"hola".length()+" letras");
        
        
    }
    
}
