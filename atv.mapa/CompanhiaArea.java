import java.util.ArrayList;

public class CompanhiaArea {
    private String nome;
    private ArrayList<Voo> voos;

    public CompanhiaArea(String nome) {
        this.nome = nome;
        this.voos = new ArrayList<> ();
    }
    
    public void adicionarVoo (Voo voo) {
        voos.add(voo);
    }

    public String getNome () {
        return nome;
    }

    public ArrayList<Voo> getVoos () {
        return voos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }
}
