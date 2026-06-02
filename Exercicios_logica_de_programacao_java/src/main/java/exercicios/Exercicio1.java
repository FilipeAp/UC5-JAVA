package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextInt();

        int soma = numero1 + numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int subtracacao = numero1 - numero2;

        System.out.println("O resultado da soma dos números é: " + soma);
        System.out.println("O resultado da multiplicação dos números é: " + multiplicacao);
        System.out.println("O resultado da divisão dos números é: " + divisao);
        System.out.println("O resultado da subtração dos números é: " + subtracacao);
    }
}

