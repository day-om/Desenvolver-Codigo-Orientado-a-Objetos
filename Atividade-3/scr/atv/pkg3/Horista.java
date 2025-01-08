
package atv.pkg3;


public class Horista extends Funcionarios {
    private final int horasTrabalhadas;
    private float valorHora;

    
    Horista(String nome, String cpf, String endereco, String telefone, String setor, int horasTrabalhadas, float valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

      

    @Override
    public float calcularSalario(){
       return horasTrabalhadas * valorHora;
    }
    @Override
    public float aumento(float percentual){
    return valorHora += valorHora *(percentual /100);
    }
}
