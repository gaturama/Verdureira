import java.util.ArrayList;

public class Local {
    
    public int id;
    public String detalhes;
    public int idproduto;
    public int quantidade;
    public ArrayList<Produto> produtos;

    public static ArrayList<Local> locais = new ArrayList<Local>();

    public Local(
        int id, 
        String detalhes,
        int idproduto,
        int quantidade
    ){
        this.id = this.getNextId();
        this.detalhes = detalhes;
        this.idproduto = idproduto;
        this.quantidade = quantidade;
        this.produtos = new ArrayList<>();

        locais.add(this);
    }
     public static Local verificarId(int id) throws Exception{
        for(Local local : locais){
            if(local.id == id) {
                return local;
            }
        }
        throw new Exception("Local não existe");
     }   

    private int getNextId() {
        int id = 0;

         for(Local local : locais){
            if(local.id > id){
                id = local.id;
            }
         }

         return id + 1;
    }
}
