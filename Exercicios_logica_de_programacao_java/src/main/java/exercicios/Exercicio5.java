package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        float salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário base do funcionário:");
        salario = entrada.nextFloat();

        System.out.println("O salário líquido do funcionário é de: R$" + salario*1.05);
    }
}
