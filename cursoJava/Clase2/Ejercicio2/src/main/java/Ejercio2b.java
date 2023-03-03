
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luciana
 */
public class Ejercio2b {
    public static void main(String[] args){
        
        int HORABASE = 16;
        int HORAEXTRA = 20;
        int BASE = 40;
        
        String inputNum = JOptionPane.showInputDialog("Ingrese cantidad de horas trabajadas: ");
        
        int horas = Integer.parseInt(inputNum);
        int total;
        
        if(horas > BASE) {
            total = BASE * HORABASE + (horas - BASE) * HORAEXTRA;
        }else{
            total = horas * HORABASE;
        }
        
        System.out.println("Salario semanal $" + total);
    }
}