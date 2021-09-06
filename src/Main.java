import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1;
        float num2;

        try {
            System.out.println("Digite o primeiro número");
            num1 = teclado.nextFloat();
        } catch (Exception ex) {
            teclado = new Scanner(System.in);
            num1 = 0;
            teclado.close();

        }

        try {
            System.out.println("Digite o segundo número");
            num2 = teclado.nextFloat();
        } catch (Exception ex) {
            num2 = 0;
        }
        Calculadora calc = new Calculadora();
        System.out.printf("A soma é: %.2f\n", calc.somar(num1, num2));
        System.out.printf("A subtração é: %.2f\n", calc.subtrair(num1, num2));
        System.out.printf("A multiplicação é: %.2f\n", calc.multiplicar(num1, num2));
        System.out.printf("A divisão é: %.2f\n", calc.dividir(num1, num2));
        System.out.printf("A potencia é: %.2f\n", calc.potencia(num1, num2));
        System.out.printf("A raiz quadrada é: %.2f\n", calc.raizQuadrada(num1));
        teclado.close();
    }

}
