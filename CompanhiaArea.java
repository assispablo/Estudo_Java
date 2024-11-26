import java.util.ArrayList;
import java.ultil.List;

public class CompanhiaArea {
    private String nome;
    private ArrayList<Voo> voos;

    public CompanhiaArea(String nome) {
        this.nome = nome;
        this.voos = new ArrayList<Voo> ();
    }
    
    public void adicionarVoo (Voo voo) {
        voos.add(voo);
    }

    public String getNome () {
        return nome;
    }

    public List<Voo> getVoos () {
        return voos;
    }
}
