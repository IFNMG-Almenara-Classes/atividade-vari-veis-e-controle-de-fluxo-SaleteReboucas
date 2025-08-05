package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System .out.println("Digite a senha: ");

        int senha = entrada.nextInt();
        int senhaCorreta = 1234;

        if(senha == senhaCorreta){
            System.out.println("ACESSO PERMITIDO ");
       }else{
         System.out.println("ACESSO NEGADO ");
       }
       entrada.close();
        }
    }

