package classes;

public class Calculo {
    
    public void executaCalculo(int num1, char operador, int num2) {
        double resultado;
        int auxDivisao;

        switch(operador) {
            case '+' :
                resultado = num1 + num2;
                System.out.println("\nResultado: " + resultado);
                break;
            case '-' :
                resultado = num1 - num2;
                System.out.println("\nResultado: " + resultado);
                break;
            case '*' :
                resultado = num1 * num2;
                System.out.println("\nResultado: " + resultado);
                break;
            case '/' :
                resultado = num1 / num2;
                auxDivisao = num1 % num2;
                System.out.println("\nResultado: " + resultado
                    + " Resto: " + auxDivisao);
                break;
            default:
                System.out.println("\nOperação Inválida!");
        }
    } 
}
