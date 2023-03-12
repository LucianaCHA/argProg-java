/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4practica;

import javax.swing.JOptionPane;

/**
 *6) En la Cámara de n Diputados se levanta una encuesta con todos los integrantes 
 * con el fin de determinar qué porcentaje de ellos está a favor del Tratado de 
 * Libre Comercio, qué porcentaje está en contra y qué porcentaje se abstiene de opinar.
 * @author luciana
 */
public class Survey {
    public static void main(String[] args) {
        float yes = 0;
        float no = 0;
        float abstention = 0;
        float total = 0.0f;
        
        int option = JOptionPane.showConfirmDialog(null, 
                "Ingresar voto", "", JOptionPane.YES_NO_OPTION);

        while(option == JOptionPane.YES_OPTION){
            
            switch(Vote()){
                case 1:
                    yes++;
                    total++;
                    break;
                case 0:
                    
                    no++;
                    total++;
                    break;
                case 2:
                    total++;
                    abstention++;
                default:
                    break;
            }
            
            option = JOptionPane.showConfirmDialog(null, 
                "Ingresar nuevo voto", "", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Resultado de votación"
                + "\n A favor : " + (yes/ total )*100f+ "%"
                + "\n En contra : " +(no/ total)*100f + "%"
                + "\n Abstenciones : " + (abstention/ total)*100f + "%");
        
    }

    public static int Vote(){
       Object[] options = {"Si", "No", "Abstención"};
        int option = JOptionPane.showOptionDialog(null,
                "A favor de la ley de Libre Comercio?",
                "Votación", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        switch (option) {
            case JOptionPane.YES_OPTION:
                return 1;
                
            case JOptionPane.NO_OPTION:
                return 0;
            case JOptionPane.CANCEL_OPTION:
                return 2;
            default:
                return 2;
        }

    
    }
    
}
