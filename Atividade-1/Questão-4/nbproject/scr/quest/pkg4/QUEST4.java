
package quest.pkg4;

import java.util.Scanner;


public class QUEST4 {

    
    public static void main(String[] args) {
        int opcao = 0, i = 0, j;
    String [] nome = new String [15];
    String nomePesquisa;
    boolean encontrado = false;
    
    Scanner entrada = new Scanner (System.in);    
        while(opcao != 3){
        System.out.println("----- MENU ----- ");
        System.out.println("Digite o número correspondente a uma das opções: "
                + " 1 - Cadastrar | 2 - Pesquisar | 3 - Sair ");
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                if(i<3){
                     System.out.println("Nome do hóspede: ");
                     nome[i] = entrada.next();
                     System.out.println("Hóspede cadastrado com sucesso! ");
                     i++;
                }
                else{
                    System.out.println("Máximo de cadastros atingidos!");
                }             
            break;
            case 2:
                for(i=0;i<3;i++){
                     System.out.println("Hóspede a pesquisar: ");
                     nomePesquisa = entrada.next();  
                     for(i=0;i<3;i++){
                         if (nomePesquisa.equals(nome[i])){
                             j = i+1;
                             System.out.println("Hóspede "+ nomePesquisa+ " encontrado no índice "+j+ " .");
                             encontrado = true;
                         }
                         if(encontrado == false && i==2){
                             System.out.println("Hóspede não encontrado! ");
                         }
                     }
                }
            break;
            case 3:
                System.out.println("Saindo do sistema! ");
            break;
            default: 
                System.out.println("Opção inválida! ");
        
        }
        } 
    }
    
}
