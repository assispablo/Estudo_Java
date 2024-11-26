public class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;

    public Voo(String codigo, int totalAssentos) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
    }

    public void reservaAssento () {
        if (assentosOcupados < totalAssentos) {
            assentosOcupados++;
        }
        else {
            throw new RuntimeException ("Não há assentos disponíveis.");
        }
    }

    public int getAssentosDisponiveis() {
        return totalAssentos - assentosOcupados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(int totalAssentos) {
        this.totalAssentos = totalAssentos;
    }
    
}
