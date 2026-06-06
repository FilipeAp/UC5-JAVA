package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        float nota1;
        float nota2;
        float nota3;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = entradas.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = entradas.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 = entradas.nextFloat();

        float media = ((nota1*2)+(nota2*3)+(nota3*5))/10;

        System.out.println("A média do aluno é: " + media);
    }
}
