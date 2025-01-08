
package quest.pkg3;

import java.util.Scanner;


public class QUEST3 {

  
    public static void main(String[] args) {
       
     float valorDiaria, totalDiaria, valorMeia;
     int idade, quantGratuidade = 0, quantMeia = 0, quantInteira = 0;
     String nome,continuar;
      
    Scanner entrada = new Scanner (System.in);
     
         System.out.println("----- FICHA DE HOSPEDAGEM -----");
         System.out.println("Insira o valor padrão da diária: ");
         valorDiaria = entrada.nextFloat();
         valorMeia = valorDiaria / 2;
        
         do{
             System.out.println("Nome do hóspede: ");
             nome = entrada.next();
             System.out.println("Idade: ");
             idade = entrada.nextInt();
             
             if(idade < 4){
                 System.out.println(nome+ " possui gratuidade!");
                 quantGratuidade++;
             }
             if (idade >= 80){
                 System.out.println(nome+" paga meia!");
                 quantMeia++;
             }
             if (idade >4 && idade < 80){
                 quantInteira++;
                         
             }
             System.out.println("Deseja continuar? (S/N):");
             continuar = entrada.next();
             totalDiaria = quantGratuidade * 0 + quantMeia * valorMeia + quantInteira * valorDiaria;             
             
         }while(continuar.equalsIgnoreCase("S"));
        
         System.out.println("Valor total de hospedagem: R$ "+ totalDiaria + ".");
         System.out.println(quantGratuidade +" gratuidade(s)!" + quantMeia + " Meia(s)!");
     }
    }
    

