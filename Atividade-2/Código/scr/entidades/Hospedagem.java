package entidades;

public class Hospedagem {

    private String descricao;
    private float valorDiaria;

    public Hospedagem(String descricao, float valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
