import java.util.ArrayList;

public class Fabricante {
    
    public int id;
    public String nome;
    public ArrayList<Produto> produtos;

    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(
        int id, 
        String nome
    ) {
        this.id = id;
        this.nome = nome;
        this.produtos = new ArrayList<Produto>();

        fabricantes.add(this);
    }

    public static Fabricante verificarId(int id) throws Exception {
        for(Fabricante fabricante : fabricantes) {
            if (fabricante.id == id) {
                return fabricante;
            }
        }
        throw new Exception ("Este fabricante não existe");
        }

    private int getNextId() {
        int id = 0;

        for(Fabricante fabricante : fabricantes) {
            if( fabricante.id > id) {
                id = fabricante.id;
            }
        }

        return id + 1;
    }
}
