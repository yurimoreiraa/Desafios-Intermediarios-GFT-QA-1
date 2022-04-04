package com.company;

import java.util.Scanner;

public class CloneDasSombras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int qtdTecnica = 0;
            int ninja = 1;
            int numero = sc.nextInt();

            while (ninja < numero) {
                qtdTecnica++;
                ninja = ninja * 2;
            }
            System.out.println(qtdTecnica);
        } while (sc.hasNextInt());
        sc.close();
    }
}
