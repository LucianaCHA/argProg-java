/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculadora1;

/**
 *
 * @author luciana
 */
public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        boolean resultadoMultiplicar = calculadora.multiplicar(80, 3) == 240;

        boolean resultadoSumarDividir = calculadora.dividir(
            calculadora.sumar(150,180)
            , 3) == 110;

        boolean resultadorestaMultiplica = calculadora.multiplicar(
            calculadora.restar(90,50)
            , 15) != 605;
        
        boolean resultadoSumarMultiplica = calculadora.multiplicar(
                calculadora.restar(70,40)
                , 25) != 2700;

        System.out.println("El resultado de multiplicar 80 por 3 da 240 ? " + resultadoMultiplicar +
        "\n El resultado de sumar 150 y 180, dividido por 3, da 110 ? " + resultadoSumarDividir +
        "\n El resultado de restar 90 y 50, multiplicado por 15, no da 605 ? " + resultadorestaMultiplica +
        "\n El resultado de sumar 70 y 40, multiplicado por 25, no da 2700 ? " + resultadoSumarMultiplica);
        
    }

    public double sumar(double unNumero, double otroNumero){
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero){
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero){
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero){
        return unNumero / otroNumero;
    }
}
