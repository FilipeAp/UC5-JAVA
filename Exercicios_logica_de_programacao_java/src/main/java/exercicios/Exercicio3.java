package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        float base;
        float altura;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Insira o valor da base do triângulo:");
        base = entradas.nextFloat();

        System.out.println("Insira o valor da altura do triângulo:");
        altura = entradas.nextFloat();

        if (base > 0 && altura > 0) {
            System.out.println("A área de seu triângulo é de: " + (base * altura) / 2);
        }else{
            System.out.println("Um dos valores é invalido!");
        }
    }
}
