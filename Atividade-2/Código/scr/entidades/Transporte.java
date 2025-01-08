package entidades;

public class Transporte {

    private String tipo;
    private float valor;

    public Transporte(String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;

    }

    //Getters 
    public String getTipo() {
        return this.tipo;
    }

    public float getValor() {
        return this.valor;
    }

    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
