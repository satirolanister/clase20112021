/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringejercicios;

/**
 *
 * @author alex
 */
public class ClaseMath 
{
 public static void main (String[] args)
 {
     double potencia;
     double euler;
     double npi;
     double seno90;
     double raizCuadrada;
     double ramdom;
     double menor;
     double mayor;
     
     potencia = Math.pow(3, 3);
     euler = Math.E;
     npi = Math.PI;
     seno90 =  Math.sin(90);
     raizCuadrada =  Math.sqrt(16);
     ramdom = Math.random();
     menor = Math.min(13, 69);
     mayor = Math.max(13, 69);
     
     System.out.println("potencia 3 "+potencia+" euler "+euler+" pi "+npi+
             " seno 90 "+seno90+" raiz cuadrada "+raizCuadrada+" ramdom "+ramdom+" menor "+menor+" mayor "+mayor );
 }    
}
