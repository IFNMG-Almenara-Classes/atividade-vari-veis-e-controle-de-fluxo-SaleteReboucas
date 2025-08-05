package questao07;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite a medida do lado 1: ");
       int lado1 = entrada.nextInt();
       System.out.println("Digite a medida do lado 2: ");
       int lado2 = entrada.nextInt();
       System.out.println("Digite a medida do lado 3: ");
       int lado3 = entrada.nextInt();

       if(lado1 == lado2 && lado1 == lado3){
        System.out.println("Equilátero!");
       }else if(lado1 == lado2 && lado1 != lado3){
         System.out.println("Isósceles!");       
       }else if(lado1 != lado2 && lado1 != lado3){
        System.out.println("Escaleno!");
       }else{
        System.out.println("Não é um triângulo!");
       }
       entrada.close();
     } 
}
