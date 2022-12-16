import java.util.ArrayList;

public class Fabricante {
    
    public int id;
    public String nome; 
    public int idProduto;

    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(
        int id, 
        String nome,
        int  idProduto
    ) {
        this.id = id;
        this.nome = nome;

        fabricantes.add(this);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
         this.nome = nome;
    }

    public static Fabricante verificarId(int id) throws Exception {
        for(Fabricante fabricante : fabricantes) {
            if (fabricante.id == id) {
                return fabricante;
            }
        }
        throw new Exception ("Este fabricante não existe");
        }

   public static removeFabricante(int id) throws Exception{
       Fabricante fabricante = getFabricante(id);
       fabricantes.remove(fabricante);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Nome: " + nome + "\n"
            + "Produto: " + this.idProduto + "\n";
    }
}
