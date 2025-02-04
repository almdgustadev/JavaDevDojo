package org.example;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String nome = "Gustavo de Almeida Olivera";
        String endereco = "Rua Antonio das Flores, 190 , Centro";
        double salario = 2000.0;
        String dataRecebimento = "31/03/2025";
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimento);*/

        double salario;
        double valorImposto;
        System.out.println("Digite seu salário para descobrir o total de imposto que deve pagar:");
        salario = input.nextInt();

        if(salario <= 34712){
            valorImposto = salario * (9.70/100);
            System.out.println("O imposto pago deverá ser de 9,70%. Valor de : " + valorImposto);
        } else if (salario <= 68507) {
            valorImposto = salario * (37.35/100);
            System.out.println("O imposto pago deverá ser de 37,35%. Valor de : " + valorImposto);
        }else {
            valorImposto = salario * (49.50/100);
            System.out.println("O imposto pago deverá ser de 49.50%. Valor de : " + valorImposto);
        }
    }
}