import java.util.ArrayList;

public class Local {
    
    public int id;
    public String detalhes;
    public int idproduto;
    public int quantidade;
    public Produto produto;

    public static ArrayList<Local> locais = new ArrayList<Local>();

    public Local(
        int id, 
        String detalhes,
        int quantidade,
        Produto produto
    ){
        this.id = this.getNextId();
        this.detalhes = detalhes;
        this.quantidade = quantidade;
        this.produtos = produto;

        locais.add(this);
    }
    
    public int getId(){
        return id;
    }
    public void setId (int id){
        this.id = id;
    }
    public String getDetalhes(){
        return detalhes;
    }
    public void setDetalhes(String detalhes){
        this.detalhes = detalhes
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
     public static Local verificarId(int id) throws Exception{
        for(Local local : locais){
            if(local.id == id) {
                return local;
            }
        }
        throw new Exception("Local não existe");
     }   

     public static void removeLocal (int id) throws Exception{
         Local local = getLocal(id);
         locais.remove(local);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Detalhes: " + detalhes + "\n"
            + "Quantidade: " + quantidade + "\n"
            + "Produto: " + this.produto + "\n";
    }
}
