
package atv.pkg3;

public class Assalariado extends Funcionarios {
    private float salario;
    

    Assalariado(String nome, String cpf, String endereco, String telefone, String setor, float salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

        
    @Override
    public float calcularSalario(){
       return salario;
    }
    
    @Override
    public float aumento(float percentual){
       return salario +=  salario * (percentual /100);
    }
   
}
