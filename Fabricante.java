import java.util.ArrayList;

public class Fabricante {
    
    public int id;
    public String nome;
    public ArrayList<Verdureira> verdureira;

    public static ArrayList<Verdureira> verdureira = new ArrayList<Verdureira>();

    public Fabricante(
        int id, 
        String nome
    ) {
        this.id = id;
        this.nome = nome;
        this.verdureira = new ArrayList<Verdureira>();

        verdureira.add(this);
    }
}
