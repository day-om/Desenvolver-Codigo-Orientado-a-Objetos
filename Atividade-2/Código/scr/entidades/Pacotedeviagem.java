package entidades;

public class Pacotedeviagem {

    private String destino;
    private int dias;
    private Hospedagem hospedagem;
    private Transporte transporte;

    public Pacotedeviagem(String destino, int dias, Hospedagem hospedagem, Transporte transporte) {
        this.destino = destino;
        this.dias = dias;
        this.hospedagem = hospedagem;
        this.transporte = transporte;

    }
    public Pacotedeviagem(String destino, int dias) {
        this.destino = destino;
        this.dias = dias;
       

    }

    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
    public float calcularHospedagem (){
        return this.dias * this.hospedagem.getValorDiaria();
    }
    
    public float calcularLucro (float margem){
        return calcularHospedagem()* (margem/100);
    }
    public float calcularPacotes(float margemLucro, float taxasAdicionais) {
    if (this.hospedagem == null || this.transporte == null) {
        System.out.println("Hospedagem ou Transporte não definido.");
        return 0;
    }
    float totalHospedagem = calcularHospedagem();
    float valorLucro = calcularLucro(margemLucro);
    return this.transporte.getValor() + totalHospedagem + valorLucro + taxasAdicionais;
}

}
