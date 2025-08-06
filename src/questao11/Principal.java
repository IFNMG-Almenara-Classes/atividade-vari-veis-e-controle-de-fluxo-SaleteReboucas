package questao11;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo: ");
       int numero = entrada.nextInt();

       for(int i = 0; i < numero; i++){             
        if(i %2 == 0){
        System.out.println(i);
        
       }       
    }
    entrada.close();
}
}
