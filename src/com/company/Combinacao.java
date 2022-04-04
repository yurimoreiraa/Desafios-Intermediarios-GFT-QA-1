package com.company;

import java.util.Scanner;

public class Combinacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            StringBuilder resultado = new StringBuilder();
            String a = leitor.next();
            String b = leitor.next();
            int letras = a.length();

            if (letras < b.length()) {
                letras = b.length();
            }
            for (int j=0; j < letras ; j++) {
                String lA = "";
                String lB = "";
                if (j < a.length()) {
                    lA = String.valueOf( a.charAt(j));
                }
                if (j < b.length()) {
                    lB = String.valueOf( b.charAt(j));
                }
                resultado.append(lA).append(lB);
            }
            System.out.println(resultado);
        }
        leitor.close();
    }
}