package edu.izabella.segundasemana;

public class MinhaClasse {

    // MAIN:
    // classe que contém o método main, ela vai ser o ponto de entrada do programa,
    // onde se inicializa o programa.

    public static void main(String[] args) {

        // Classe System: classe que contém métodos e atributos relacionados ao sistema.
        System.out.println("Olá, mundo!");
        // É como se dissesse ao computador, eu estou falando ao sistema, "System, me da
        // uma saída (out), cujo vai ser uma impressão (print). Imprima um texto (Olá,
        // mundo!) para mim."

        //////////////////////

        // VARIAVEIS: camelCase para nomes de variaveis, podem o valor ser redefinido,
        // menos se for colocado em "final". OBS: se a variavel for toda em maiusculo,
        // pressupoe que ela é "final".

        int ano = 2024;
        ano = 2025; // redefinção da variavel ano
        System.out.println(ano);

        final String BR = "Brasil";
        // BR = "Brazil"; //da erro, pois é final.
        System.out.println(BR);

        //////////////////////

        // DECLARAÇÃO DE VARIÁVEIS E MÉTODOS:

        // int anoFabricacao = 2022;

        // boolean verdadeira = true;

        // anoFabricacao = 2024;

        String nome = "Izabella";

        String sobrenome = "Prandino de Lucca";

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return "Resultado do método:" + nome.concat(" ").concat(sobrenome);
        // concat = concatena
    }

}