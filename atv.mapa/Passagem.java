public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;
    
    public Passagem(Voo voo, String nomePassageiro, double preco) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
    }

    public double calcularPrecoTotal() {
        double taxaEmbarque = 50.0;
        return preco + taxaEmbarque;
    }

    public String getNomePassageiro () {
        return nomePassageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
