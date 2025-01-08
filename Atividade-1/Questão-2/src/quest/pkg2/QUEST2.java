
package quest.pkg2;

import java.util.Scanner;

public class QUEST2 {

    
    public static void main(String[] args) {
          String nome1, nome2;
        int idade1,idade2;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o nome do primeiro hóspede: ");
        nome1 = entrada.nextLine();
        System.out.println("Idade do primeiro hóspede: ");
        idade1 = entrada.nextInt();
        System.out.println("Digite o nome do segundo hóspede: ");
        nome2 = entrada.next();
        System.out.println("Idade do segundo hóspede: ");
        idade2 = entrada.nextInt();
      
        if (idade1 > idade2){
            if (idade1 >= 60){
                System.out.println("Quarto A: "+nome1+" com 40% de desconto! Quarto B:" +nome2+"!");
            }
            else{
                System.out.println("Quarto A: "+nome1+"Quarto B:" +nome2+"!");
            }         
        }
        else{
            if(idade2 >= 60){
                System.out.println("Quarto A: "+nome2+" com 40% de desconto! Quarto B:" +nome1+"!");
            }
            else{
                System.out.println("Quarto A: "+nome2+" Quarto B:" +nome1+"!");
            }
        }
    }
    
}
