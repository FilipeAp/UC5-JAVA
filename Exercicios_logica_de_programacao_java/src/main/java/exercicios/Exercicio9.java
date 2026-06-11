package exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;

        Scanner dados = new Scanner(System.in);

        System.out.println("Informe a quantidade de anos completos de sua idade:");
        anos = dados.nextInt();

        System.out.println("Informe a quantidade de meses além dos anos completos:");
        meses = dados.nextInt();

        System.out.println("Informe a quantidade de dias além dos meses completos:");
        dias = dados.nextInt();

        
    }
}
