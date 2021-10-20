/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasdelasemana;

import java.awt.event.*;
import javax.swing.*;

public class DiasDeLaSemana extends JFrame implements ActionListener{

    private JTextField camporellenable;
    private JLabel etiqueta1;
    private JButton boton;
    private JTextField tf;
    private JComboBox combo;
    
    public DiasDeLaSemana()
    {
        setLayout(null);
        //Texto 
        etiqueta1 = new JLabel("Los días de la semana son");
        etiqueta1.setBounds(120,40,200,30);
        add(etiqueta1);
                
        //Boton
        
        boton = new JButton("Salir");
        boton.setBounds(140, 200, 100, 30);
        add(boton); 
        boton.addActionListener(this);
        
        //JcomboBox
        //creación del JTextField
        tf = new JTextField(20);
        
        // Creación del JComboBox y añadir los items.
        combo = new JComboBox();
        combo.setBounds(150, 100, 80, 40);
        combo.addItem("Lunes");
        combo.addItem("Martes");
        combo.addItem("Miércoles");
        combo.addItem("Jueves");
        combo.addItem("Viernes");
        combo.addItem("Sábado");
        combo.addItem("Domingo");
        add(combo);
        
        //Accion a realizar cuando el JComboBox cambia el item seleccionado.
        combo.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                tf.setText(combo.getSelectedItem().toString());
            }
        }
        );
           
     }
        
     
    public void actionPerformed(ActionEvent e)
    {
       //Si pulso boton salida salga
        if(e.getSource()==boton)
        {
            System.exit(0);
            
        }
    
        
        
        
    }
    
    
    public static void main(String[] args) {
        DiasDeLaSemana ventana1 = new DiasDeLaSemana();
        ventana1.setBounds(10,10,400,300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
        //v = new JFrame();
        //v.getContentPane().setLayout(new FlowLayout());
        //v.getContentPane().add(combo);
        //v.getContentPane().add(tf);
        //v.pack();
        //v.setVisible(true);
        
        
    }
    
}
