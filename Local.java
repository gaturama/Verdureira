import java.util.ArrayList;

public class Local {
    
    public int idLocal;
    public String detalhes;
    public int quantidade;
    public int idProduto;

    public static ArrayList<Local> locais = new ArrayList<Local>();

    public Local(
        int idLocal, 
        String detalhes,
        int quantidade,
        int idProduto
    ){
        this.idLocal = idLocal;
        this.detalhes = detalhes;
        this.quantidade = quantidade;
       
        locais.add(this);
    }
    
    public int getIdLocal(){
        return idLocal;
    }
    public void setId (int idLocal){
        this.idLocal = idLocal;
    }
    public String getDetalhes(){
        return detalhes;
    }
    public void setDetalhes(String detalhes){
        this.detalhes = detalhes;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
     public static Local verificarId(int idLocal) throws Exception{
        for(Local local : locais){
            if(local.idLocal == idLocal) {
                return local;
            }
        }
        throw new Exception("Local não existe");
     }   
     public static void removeLocal(int idLocal) throws Exception{
        Local local = getLocal(idLocal);
        locais.remove(local);
     }
    
    @Override
    public String toString(){
        return "ID: " + idLocal + "\n"
            + "Detalhes: " + detalhes + "\n"
            + "Quantidade: " + quantidade + "\n"
            + "Produto: " + this.idProduto + "\n";
    }
}
