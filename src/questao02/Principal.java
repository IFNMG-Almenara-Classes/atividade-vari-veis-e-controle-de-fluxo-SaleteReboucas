package questao02;

import java.util.Scanner;                                                    
                                                                                                                                                                                                                                             
public class Principal {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       System.out.println("Digite seu peso: ");
       float peso = entrada.nextFloat();
       
       System.out.println("Digite sua altura: ");
       float altura = entrada.nextFloat();

       float imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f ", imc);

       if(imc < 18.5){
        System.out.println("Magreza!");
       }else if(imc <= 24.9){
         System.out.println("Saudável!");
       }else if(imc <= 29.9){
         System.out.println("Sobrepeso!");
       }else if(imc <= 34.9){
         System.out.println("Obesidade Grau I!");
       }else if(imc <= 39.9){
         System.out.println("Obesidade Grau II (severa)!");
       }else{
         System.out.println("Obesidade Grau III (mórbida)!");
       }
       entrada.close();              
    }
}