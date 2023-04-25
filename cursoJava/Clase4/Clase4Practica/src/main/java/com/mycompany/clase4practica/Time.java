/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4practica;

/**
 *
 * @author luciana
 */
public class Time {
  public static void main(String[] args) {

      int sec = 0;
      int min = 0;
      int hour = 0;

      while (hour < 24) {
          while (min < 60) {
              while (sec < 60) {
                String time = FormatTime(hour) + ":" + FormatTime(min) + ":" + FormatTime(sec);
                  System.out.println(time);
                  sec++;
              }
              sec = 0;
              min++;
          }
          min = 0;
          hour++;
      }    
}

// metodo para convertir 0 en 00
public static String FormatTime(int number){
    String formated;

    if(number < 10){
        formated = "0" + number;
    }else{
        formated = number + "";
    }
    return formated;
}

}