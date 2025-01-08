
package atv.pkg3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import atv.pkg3.Funcionarios;
import atv.pkg3.Assalariado;
import atv.pkg3.Horista;

public class ATV3 {
   
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int tipo;
    
   List<Funcionarios> listaFuncionarios = new ArrayList<>();
   
   for(int i=0;i<10;i++){
       do{
         System.out.println("---- Dados do Funcionário ---- ");
         System.out.println("Tipo de funcionário: 1 - Assalariado / 2- Horista ");
         tipo = entrada.nextInt
        ();
         if(tipo != 1 && tipo != 2){
             System.out.println("Insira um tipo de funcionário válido!");
        break;
         }
         else{
         System.out.println("Nome: ");
         String nome = entrada.next();
         System.out.println("CPF: ");
         String cpf = entrada.next();
         System.out.println("Endereço: ");
         String endereco = entrada.next();
         System.out.println("Telefone: ");
         String telefone = entrada.next();
         System.out.println("Setor: ");
         String setor = entrada.next();
         
         if(tipo == 1){
             System.out.println("Valor do salário:");
             float salario = entrada.nextFloat();
             Assalariado assalariado = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
             listaFuncionarios.add(assalariado); 
         }
         else if(tipo == 2){
             System.out.println("Horas trabalhadas: ");
             int horasTrabalhadas = entrada.nextInt();
             System.out.println("Valor da hora: ");
             float valorHora = entrada.nextFloat();
             Horista horista = new Horista(nome, cpf, endereco, telefone, setor,horasTrabalhadas,valorHora);
             listaFuncionarios.add(horista);
         }
         }
       
         
       }while(i<10);
   }
       int menu;
       do{
           System.out.println("----- MENU ----- ");
           System.out.println("Escolha uma das opções: ");
           System.out.println("1 - Visuallizar lista de funcionários ");
           System.out.println("2 - Aplicar aumento.");
           System.out.println("3 - Sair.");
           
           menu = entrada.nextInt();
           
           switch(menu){
               case 1 -> {
                   System.out.println("Lista de funcionários: ");
                   for(Funcionarios f: listaFuncionarios){
                       f.mostrarDados();
                       float salario = f.calcularSalario();
                       System.out.println("Salário: "+ salario);
                       System.out.println("--------------------");
                   }
                   break;
               }
              
               case 2 -> {
                   System.out.println("Porcentagem de aumento: ");
                   float porcentagem = entrada.nextFloat();
                   
                   for(Funcionarios f: listaFuncionarios){
                       f.aumento(porcentagem);
                   }
                   System.out.println("Os salários foram aumentados com sucesso!");
                   break;
               }
               case 4 -> {
                   System.out.println("Saindo do Menu!");
                   break;
               }
               default -> {
                System.out.println("Opção inválida!");
                    break;
               }
           }
           
           
       }while(menu!=4);
        
       
  
   
        
        
    }
    
}
