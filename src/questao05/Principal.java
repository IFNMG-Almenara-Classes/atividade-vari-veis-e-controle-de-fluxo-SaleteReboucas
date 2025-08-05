package questao05;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        double maiorPreco = 0.50;
        double menorPreco = 0.30;
        int duzia = 12;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite a quantidade de laranjas compradas: ");
       int quantidade = entrada.nextInt();

       double precoUnitario;

       if(quantidade < duzia){
        precoUnitario = maiorPreco;
       }else{
        precoUnitario = menorPreco;
       }
       double valorTotal = quantidade * precoUnitario;
       System.out.println("\nResumo da compra: ");
       System.out.println("Quantidade: " + quantidade + " laranjas");
       System.out.println("Preço unitário: R$ " + precoUnitario);
       System.out.printf("Total a pagar: R$ %.2f ", valorTotal);
       
       entrada.close();
    }
   }