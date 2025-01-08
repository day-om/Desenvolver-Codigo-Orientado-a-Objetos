
package quest.pkg1;

import java.util.Scanner;


public class QUEST1 {

   
    public static void main(String[] args) {
           int quantidade;
      Scanner entrada = new Scanner (System.in);
      System.out.println("----- Auditório adequado -----");
      System.out.println("Digite a quantidade de convidados:");
        quantidade = entrada.nextInt();
           if ( quantidade > 350 || quantidade < 0) {
          System.out.println("Número de convidados inválido!");
        }  
          if ( quantidade >= 1 && quantidade <= 150) {
          System.out.println("Use o auditório Alfa!");
        }  
          if ( quantidade >= 151 && quantidade <= 220) {
              int adicionar;
              adicionar = quantidade - 150;
          System.out.println("Use o auditório Alfa e inclua "+ adicionar +" cadeiras!");
        }  
          if ( quantidade >= 221 && quantidade <= 350) {
          System.out.println("Use o auditório Beta!");
        }  
    }
    
}
