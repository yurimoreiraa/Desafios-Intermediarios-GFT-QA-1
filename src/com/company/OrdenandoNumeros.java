package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> Ehpar = new ArrayList<>();
        List<Integer> EhImpar = new ArrayList<>();

        int quantNumeros;
        int numero;

        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            numero = scan.nextInt();

            if (numero % 2 == 0 ) {
                Ehpar.add(numero);
            } else EhImpar.add(numero);
            count++;
        } while(count < quantNumeros);

        Collections.sort(Ehpar);
        Collections.sort(EhImpar);

        for (Integer integer : Ehpar) {
            System.out.println(integer);
        }
        for (int i = EhImpar.size(); i > 0; i--){
            System.out.println(EhImpar.get(i-1));
        }
    }
}
