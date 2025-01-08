
package atv.pkg3;


public abstract class Funcionarios {
    private final String nome;
    private final String cpf;
    private final String endereco;
    private final String telefone;
    private final String setor;

    public Funcionarios(String nome, String cpf, String endereco,String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }
    
    public abstract float calcularSalario();  
    
    public abstract float aumento(float percentual);

    void add(Funcionarios assalariado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     
      
    
    
}
