/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade2 {

    public static void main(String[] args) {
    //ENTRADA
        Scanner scanner = new Scanner(System.in);
        int idade;
        int salário;
        int altura;
        int peso;
        int Sobrenome;
        int gênero;


        System.out.println("progama de comparação maoir de 21 anos de idade");
        System.out.println("digite a idade");
        idade=scanner.nextInt();
        System.out.println("progama de comparação do salário");
        System.out.println("digite o valor do salário");
        salário=scanner.nextInt();
        System.out.println("progama de comparação da altura");
        System.out.println("digite sua altura");
        altura=scanner.nextInt();
        System.out.println("progama de comparação do peso");
        System.out.println("digite seu peso");
        peso=scanner.nextInt();
        System.out.println("progama de comparação de sobrenome");
        System.out.println("digite seu sobrenome");
        Sobrenome=scanner.nextInt();
        System.out.println("progama de comparação de gênero");
        System.out.println("digite seu gênero");
        gênero=scanner.nextInt();

        //Processamento
        if(idade >= 21){
            System.out.println("maior de 21 anos");
            
        }else{
            System.out.println("menor 21 anos idade");
        }
        if(salário >= 7060){
            System.out.println("cinco vezes maior");
            
        }else{
            System.out.println("menor");
        }
        if(altura >= 175){
            System.out.println("maior que 1,75");
            
        }else{
            System.out.println("menor que 1,75");
        }
        if(peso >= 70){
            System.out.println("maior que 70KG");
            
        }else{
            System.out.println("menor que 70KG");
        }
        if(Sobrenome >= 5){
            System.out.println("sobrenome igual");
            
        }else{
            System.out.println("sobrenome diferente");
        }
        if(gênero >= 3){
            System.out.println("igual a F");
            
        }else{
            System.out.println("diferente");
        }
    }
}