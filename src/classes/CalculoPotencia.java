package classes;

public class CalculoPotencia {
    public void executaCalculo(int num1, int num2) {
        double resultado;
        
        resultado = Math.pow(num1, num2);
        System.out.println("\nResultado: " + resultado);
    }
}
