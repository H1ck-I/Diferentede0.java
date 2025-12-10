import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inicial: ");
        var numero = sc.nextInt();

        var verificacao = true;
        
        System.out.println();
        
        while(verificacao){

        System.out.print("Informe um número para divisão: ");
        
        var divisao = sc.nextInt();
        
        System.out.println();
        
        if(divisao<numero){
            System.out.printf("informe um numero maior que %s para efetuar a divisão.",numero);
           System.out.println(); 
           continue;
         
        }
       
        
        var resultado = divisao % numero;
        
        System.out.printf("%s %% %s = %s ",divisao,numero,resultado);
        
        if (resultado !=0){
            System.out.printf("resultado diferente de zero. ");
            break;
        }
        }        
            
        
            sc.close();
        }
    }

