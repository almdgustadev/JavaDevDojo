package org.example;

import java.util.Scanner;

public class ExercicioSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero do dia correspondente: ");
        int dia = input.nextInt();

        switch (dia){
            case 1,7:
                System.out.println("Fim de semana");
                break;
            case 2,3,4,5,6:
                System.out.println("Útil");
                break;
            default:
                System.out.println("Não existe um dia correspondente a este numero. Tente de 1 a 7!");
                break;
        }

        char sexo = 'F';

        switch (sexo){
            case 'M':
                System.out.println("Homem!");
                break;
            case 'F':
                System.out.println("Mulher!");
                break;
            default:
                System.out.println( "Opção inválida!");
                break;
        }




    }


}
