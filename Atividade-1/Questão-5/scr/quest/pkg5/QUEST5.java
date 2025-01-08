
package quest.pkg5;

import java.util.Scanner;


public class QUEST5 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
         char[][] quartos = new char[4][3];
         for (int i=0;i<4;i++){
             for(int j=0; j<3;j++){
                 quartos[i][j] = ' ';
             }
         }
         String continua;
         do{
            System.out.print("Informe o andar (1-4): ");
            int andar = entrada.nextInt()- 1;
            System.out.print("Informe o quarto (1-3): ");
            int quarto = entrada.nextInt()- 1;
             
            if(andar>=0 && andar<4 && quarto>=0 && quarto<3){
                 quartos[andar][quarto] = 'X';}
            else{
                 System.out.println("Número do andar ou quarto inválido!");
             }
             System.out.println("Deseja continuar? (S/N)");
             continua = entrada.next();             
         }while(continua.equalsIgnoreCase("s"));
         
         System.out.println("\n Tabela de Vagas ");
         for(int i=3;i>=0;i--){
             System.out.print("Andar "+ (i+1)+ ": ");
             for(int j=0;j<3;j++){
                 System.out.print("["+ quartos[i][j]+"]");
             }
             System.out.println();
         
     }
    }
    
}
