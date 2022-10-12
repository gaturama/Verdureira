import java.util.ArrayList;

public class Produto {

    public int id;
    public String descricao;
    public String tamanho;
    public String cor;
    public String fabricante;
    public ArrayList<Verdureira> verdureira;
    
    public static ArrayList<Verdureira> verdureira = new ArrayList<Verdureira>();

    public Produto (
        int id,
        String descricao,
        String tamanho,
        String cor, 
        String fabricante
    ) {
        this.id = id;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.fabricante = fabricante;

        verdureira.add(this);
    }

    
}
