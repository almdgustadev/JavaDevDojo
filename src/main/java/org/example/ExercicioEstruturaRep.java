package org.example;

import java.util.Scanner;

public class ExercicioEstruturaRep {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        /* for(int i = 0; i <=1000000;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        } */

        /*int num = 60;
        for (int i = 0; i <= num; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        } */

        //Deixando os codigos em comentarios para não criar várias classes para cada exercício,
        //vou separando os exercícios em conteúdo.

        double valorParcela;
        double valorCarro;
        System.out.println("Digite o valor do carro: ");
        valorCarro = input.nextDouble();

        for (int i = 1; i < valorCarro; i++) {
            valorParcela = valorCarro/i;
            if (valorParcela<1000){
                break;
            }
            System.out.println("VALOR DA PARCELA EM " + i + "X = R$" + String.format("%.2f",valorParcela));
        }
    }
}
