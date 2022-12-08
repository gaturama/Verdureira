import java.util.ArrayList;

public class Produto {

    public int id;
    public String descricao;
    public String tamanho;
    public String cor;
    Fabricante fabricante
    
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto (
        int id,
        String descricao,
        String tamanho,
        String cor, 
        Fabricante fabricante
    ) {
        this.id = this.getNextId();
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;

        produtos.add(this);
       }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }        
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    
    public static Produto verificarId(int id) throws Exception{
        for(Produto produto : produtos){
            if(produto.id == id){
                return produto;
            }
        }
        throw new Exception("Produto não existe");
    }
    public static removeProduto(int id) throws Exception{
        Produto produto = getProduto(id);
        produtos.remove(produto);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Descrição: " + descricao + "\n"
            + "Tamanho: " + tamanho + "\n"
            + "Cor: " + cor + "\n"
            + "Fabricante: " + this.idFabricante + "\n";
    }
}
