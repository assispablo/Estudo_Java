public class Aeroporto {
    private String codigoAreporto;
    private String nome;
    private String cidade;

    public Aeroporto(String codigoAeroporto, String nome, String cidade) {
        this.codigoAreporto = codigoAeroporto;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getCodigoAreporto() {
        return codigoAreporto;
    }

    public void setCodigoAreporto(String codigoAreporto) {
        this.codigoAreporto = codigoAreporto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}