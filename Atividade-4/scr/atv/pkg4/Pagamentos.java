
package atv.pkg4;


public class Pagamentos {
    
   String nomeCliente;
   String dataPagamento;
   float valorTotal;
   
    public Pagamentos(String nomeCliente, String dataPagamento, float valorTotal){
        this.nomeCliente = nomeCliente;
        this.dataPagamento = dataPagamento;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void mostrarDados(){
        System.out.println("---- Dados do Pagamento ----");
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Data do pagamento: "+ dataPagamento);
        System.out.println("Valor pago: "+ valorTotal);       
        
    }
  
    
    
}
