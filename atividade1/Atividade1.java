/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Informe o valor total da fatura: R$ ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("Informe o percentual de desconto para pagamento antecipado: ");
        double percentualDesconto = scanner.nextDouble();

        System.out.print("Informe o percentual de multa por atraso: ");
        double percentualMulta = scanner.nextDouble();

        // Cálculo do valor total com desconto
        double desconto = valorTotal * (percentualDesconto / 100);
        double valorTotalComDesconto = valorTotal - desconto;

        // Cálculo do valor de cada parcela
        double valorParcela = valorTotalComDesconto / numeroParcelas;

        // Cálculo da multa por atraso
        double multaPorParcela = valorParcela * (percentualMulta / 100);
        
    }
}
