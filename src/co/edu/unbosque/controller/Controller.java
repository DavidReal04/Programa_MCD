package co.edu.unbosque.controller;

import co.edu.unbosque.model.AlgoritmoEuclidiano;
import co.edu.unbosque.model.CalculoDivisores;
import co.edu.unbosque.model.FactoresPrimos;
import co.edu.unbosque.view.ViewConsola;

import java.util.InputMismatchException;

public class Controller {

    private final ViewConsola vista;
    private final CalculoDivisores calcDivisores;
    private final FactoresPrimos factPrimos;
    private final AlgoritmoEuclidiano euclides;
    private int num1;
    private int num2;

    public Controller() {
        vista = new ViewConsola();
        euclides = new AlgoritmoEuclidiano();
        calcDivisores = new CalculoDivisores();
        factPrimos = new FactoresPrimos();
        funcionar();
    }

    private void funcionar() {

        vista.mostrarMensaje("Cálculo del Máximo Común Divisor" +
                "\n1. Cálculo de divisores\n2. Descomposición en factores primos\n3. Algoritmo de Euclides"+
                "\nIngrese el número del método que quiera usar:");

        int opcion= 0;
        try {
            opcion = vista.leerNum();
            switch (opcion){
                case 1:
                    pedirNumeros();
                    vista.mostrarMensaje("Cálculo de divisores \nEl máximo común divisor de " + num1 + " y " + num2 + " es "
                            + calcDivisores.calcularMCD(num1, num2));
                    break;
                case 2:
                    pedirNumeros();
                    vista.mostrarMensaje("Descomposición en factores primos \nEl máximo común divisor de " + num1 + " y " + num2 + " es "
                            + factPrimos.calcularMCD(num1, num2));
                    break;
                case 3:
                    pedirNumeros();
                    vista.mostrarMensaje("Algoritmo de Euclides \nEl máximo común divisor de " + num1 + " y " + num2 + " es "
                            + euclides.calcularMCD(num1, num2));
                    break;
                default:
                    vista.mostrarMensaje("Opción Inválida\nHasta Pronto");
                    break;
            }
        } catch (InputMismatchException e) {
            vista.mostrarMensaje("Opción Inválida\nHasta Pronto");
        }

    }

    public void pedirNumeros(){
        vista.mostrarMensaje("Ingrese el primer número entero positivo");
        do {
            num1=vista.leerNum();
        } while (num1<=1);
        vista.mostrarMensaje("Ingrese el segúndo número entero positivo");
        do {
            num2=vista.leerNum();
        } while (num2<=1);
        if(num1 < num2) {
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
    }

}
