package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        float deposito;
        float juros;
        float montante = 0;

        Scanner entradas = new Scanner (System.in);

        System.out.println("Insira o quanto será depositado mensalmente:");
        deposito = entradas.nextFloat();

        System.out.println("Insira a taxa de juros mensal:");
        juros = entradas.nextFloat();

        for(int i = 0; i < 12; i++){
            montante = montante * (1 + juros) + deposito;
        }
        System.out.println("O montante final em 12 meses será de: " + montante);
    }
}
