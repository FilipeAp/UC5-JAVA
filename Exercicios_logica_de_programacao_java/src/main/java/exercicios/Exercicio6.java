package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        int numero1;
        int numero2;
        int armazena;

        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        numero1 = numeros.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        numero2 = numeros.nextInt();

        armazena = numero1;
        numero1 = numero2;
        numero2 = armazena;

        System.out.println("Trocando os valores das variáveis temos a primeira variável com: " + numero1 + "\nE a segunda variável com: " + numero2);
    }
}
