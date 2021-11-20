/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringejercicios;

import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;




/**
 *
 * @author alex
 */
public class Documentos 
{
    JFrame ventana;
    JTextArea notas;
    File archivoAbierto;
        
    public static void main(String[] args)
    {
        Documentos documento =  new Documentos();
    }
    public Documentos()
    {
        ventana = new JFrame("Bloc notas");
        
        JMenuBar menu =  new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu ayuda =  new JMenu("ayuda");
        
        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem abrir = new JMenuItem("Abrir...");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        JMenuItem acercaDe = new JMenuItem("Acerca de...");
        
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(salir);
        ayuda.add(acercaDe);
        
        menu.add(archivo);
        menu.add(ayuda);
        
       ventana.setJMenuBar(menu);

         
        notas = new JTextArea();
        JScrollPane scrollNotas = new JScrollPane(notas);
        ventana.add(scrollNotas);
        
        nuevo.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                notas.setText("");
            }
        });
        
        abrir.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e)
            {
                abrirArchivo();
            }
        });
        guardar.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e)
            {
                guardarArchivo();
            }
        });
        salir.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        
        ventana.setSize(1366, 728);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void abrirArchivo()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
            if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(ventana)) {
            File archivo = fileChooser.getSelectedFile();
            FileReader lector = null;
            try {
                lector = new FileReader(archivo);
                BufferedReader bfReader = new BufferedReader(lector);

                String lineaFichero;
                StringBuilder contenidoFichero = new StringBuilder();

                // Recupera el contenido del fichero
                while ((lineaFichero = bfReader.readLine()) != null) {
                    contenidoFichero.append(lineaFichero);
                    contenidoFichero.append("\n");
                }

                // Pone el contenido del fichero en el area de texto
                notas.setText(contenidoFichero.toString());

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    lector.close();
                } catch (IOException ex) {
                    Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void guardarArchivo()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(ventana)) {
            File archivo = fileChooser.getSelectedFile();
            FileWriter escritor = null;
            try {
                escritor = new FileWriter(archivo);
                escritor.write(notas.getText());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(Documentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}

