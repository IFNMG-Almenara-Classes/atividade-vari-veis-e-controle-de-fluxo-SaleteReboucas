package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite o primeiro número inteiro: ");
       int numero1 = entrada.nextInt();
       System.out.println("Digite o segundo número inteiro: ");
       int numero2 = entrada.nextInt();
       System.out.println("Digite o terceiro número inteiro: ");
       int numero3 = entrada.nextInt();
       
       if(numero1 > numero2 && numero1 > numero3){
        System.out.printf("O maior número é: %d\n ", numero1);        
       }else if(numero2 > numero1 && numero2 > numero3){
        System.out.printf("O maior número é: %d\n ", numero2);
       }else if(numero3 > numero1 && numero3 > numero2){
        System.out.printf("O maior número é: %d\n ", numero3);
       }else{
        System.out.printf("Os números são iguais\n");
       }
       entrada.close();    
}
}
