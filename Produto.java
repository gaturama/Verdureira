import java.util.ArrayList;

public class Produto {

    public int id;
    public String descricao;
    public String tamanho;
    public String cor;
    public String fabricante;
    
    public static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto (
        int id,
        String descricao,
        String tamanho,
        String cor, 
        String fabricante
    ) {
        this.id = this.getNextId();
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.fabricante = fabricante;

        produtos.add(this);
        local.produtos.add(this);
    }
    private int getNextId(){
        int id = 0;

        for(Produto produto : produtos){
            if(produto.id > id) {
                id = produto.id;
            }
        }

        return id + 1;
    }
    
}
