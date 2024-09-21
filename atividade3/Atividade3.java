/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // minha info
        String meuNome = "ryan";
        int minhaIdade = 19;
        dtouble meuPeso = 50.0;
        double minhaAltura = 1.74;
        Sring meuEsporteFavorito = "basquete";
        String minhaMusicaFavorita = "day in paris";
        String meuJogoFavorito = "midnight club: los angeles";
        
        // Info da pessoa comparada
        System.out.print("Digite seu nome: ");
        String nomePessoa = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idadePessoa = scanner.nextInt();
        
        System.out.print("Digite seu peso (kg): ");
        double pesoPessoa = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double alturaPessoa = scanner.nextDouble();
        
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite sua série favorita: ");
        String EsporteFavoritoPessoa = scanner.nextLine();
        
        System.out.print("Digite sua música favorita: ");
        String musicaFavoritaPessoa = scanner.nextLine();
        
        System.out.print("Digite seu jogo favorito: ");
        String jogoFavoritoPessoa = scanner.nextLine();
        
        // Contador de igualdade
        int contagemIguais = 0;

        // Comparações
        if (nomePessoa.equals(meuNome)) {
            System.out.println("Pessoa com nome igual");
            contagemIguais++;
        } else {
            System.out.println("Pessoa com o nome diferente");
        }

        if (idadePessoa == minhaIdade) {
            System.out.println("Idade igual");
            contagemIguais++;
        } else {
            System.out.println("Idade diferente");
        }

        if (pesoPessoa == meuPeso) {
            System.out.println("Peso igual");
            contagemIguais++;
        } else {
            System.out.println("Peso diferente");
        }

        if (alturaPessoa == minhaAltura) {
            System.out.println("Altura igual");
            contagemIguais++;
        } else {
            System.out.println("Altura diferente");
        }

        if (EsporteFavoritoPessoa.equals(meuEsporteFavorito)) {
            System.out.println("Série favorita igual");
            contagemIguais++;
        } else {
            System.out.println("Série favorita diferente");
        }

        if (musicaFavoritaPessoa.equals(minhaMusicaFavorita)) {
            System.out.println("Música favorita igual");
            contagemIguais++;
        } else {
            System.out.println("Música favorita diferente");
        }

        if (jogoFavoritoPessoa.equals(meuJogoFavorito)) {
            System.out.println("Jogo favorito igual");
            contagemIguais++;
        } else {
            System.out.println("Jogo favorito diferente");
        }

        if (contagemIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        }

        scanner.close();
    }
}
