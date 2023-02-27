/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Project1 {

    public static void main(String[] args) {
        
        String input_age = JOptionPane.showInputDialog("Ingrese su edad");
        int age = Integer.parseInt(input_age);
        System.out.println("Ud. tiene " + age + " años");
        Calendar today = Calendar.getInstance();
        int current=today.get(Calendar.YEAR);
        
        int birth_year = current - age; 
        System.out.println("Ud. nació en el año: " + birth_year);
    }
}

