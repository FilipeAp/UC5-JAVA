package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        float pi = 3.14159265359f;
        float raio;

        Scanner valorRaio = new Scanner (System.in);

        System.out.println("Digite um valor para o raio:");
        raio = valorRaio.nextFloat();

        System.out.println("Área do círculo = " + pi*(raio*raio) + "\nPerímetro do círculo = " + 2*pi*raio);

    }


}
