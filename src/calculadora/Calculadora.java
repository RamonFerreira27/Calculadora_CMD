package calculadora; 

import classes.Calculo;
import classes.CalculoPotencia;

public class Calculadora {

    public static void main(String[] args) {
        int num1, num2;
        String aux;
        char op;
        
        try {
            if(args[1].equals("**")) {
                CalculoPotencia cal = new CalculoPotencia();
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[2]);
                cal.executaCalculo(num1, num2);
            }
            else {
                Calculo cal = new Calculo();
                num1 = Integer.parseInt(args[0]);
                aux = args[1];
                op = aux.charAt(0);
                num2 = Integer.parseInt(args[2]);
                cal.executaCalculo(num1, op, num2);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("\nO Asterisco (*) é um metacaractere utilizado "
                    + "pelo terminal. \nPor favor, refaça a operação escrevendo "
                    + "o mesmo entre aspas duplas.");
        }
    }
}
