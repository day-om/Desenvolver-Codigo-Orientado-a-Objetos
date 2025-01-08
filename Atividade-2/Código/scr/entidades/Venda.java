
package entidades;


public class Venda {
    private String nomeCliente;
    private String formadePagamento;
    private Pacotedeviagem pacotedeviagem;
    private Hospedagem hospedagem;
    
    public Venda(String nomeCliente, String formadePagamento,Pacotedeviagem pacotedeviagem, Hospedagem hospedagem){
        this.nomeCliente = nomeCliente;
        this.formadePagamento = formadePagamento;
        this.pacotedeviagem = pacotedeviagem;
        this.hospedagem = hospedagem;
    }
    public Venda(String nomeCliente, String formadePagamento){
        this.nomeCliente = nomeCliente;
        this.formadePagamento = formadePagamento;
        
    }
    public String getNomecliente(){
        return nomeCliente;
    }
    public String getFormadepagamento(){
        return formadePagamento;
    }
    public Pacotedeviagem getPacotedeviagem(){
        return pacotedeviagem;
    }
    public void setNomecliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setFormadepagamento(String formadePagamento){
        this.formadePagamento = formadePagamento;
    }
    public void setPacotedeviagem(Pacotedeviagem pacotedeviagem){
        this.pacotedeviagem = pacotedeviagem;
    }
 
    public float converterValores(float totalVenda, float cotacao){
        return totalVenda * cotacao;
       
    }
    public void mostrarInformacoes(float margemLucro, float taxasAdicionais,float cotacao){
        float totalDolar = pacotedeviagem.calcularPacotes(margemLucro, taxasAdicionais);
        float totalReais = converterValores(totalDolar,cotacao);
        
        System.out.println("Cliente: "+ nomeCliente + "!");
        System.out.println("Forma de pagamento: "+ formadePagamento);
        System.out.println("Destino: "+ pacotedeviagem.getDestino());
        System.out.println("Transporte: "+ pacotedeviagem.getTransporte().getTipo());
        System.out.println("Hospedagem: "+ pacotedeviagem.getHospedagem().getDescricao());
        System.out.println("Valor da diária: "+ hospedagem.getValorDiaria());
        System.out.println("Valor em dólar: " + totalDolar);
        System.out.println("Valor em reais: " + totalReais);   
        
        
        
        
       }

    
    
}
