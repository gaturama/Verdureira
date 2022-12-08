import java.util.ArrayList;

public class Movimentacao extends Local{

    public int id;
    public String data;
    public String tipo;
    public int quantidade;
    public Produto produto;
    public Local local;

    public static ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

    public Movimentacao(
        int id,
        String data,
        String tipo,
        int quantidade,
        Produto produto,
        Local local
    ){
        this.id = this.getNextId();
        this.data = data;
        this.tipo = tipo;
        this.quantidade = quantidade;

        movimentacoes.add(this);
        
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getQuantidade (){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo
    }
        
    public static Movimentacao verificarId(int id) throws Exception {
        for (Movimentacao movimentacao: movimentacoes) {
             if (movimentacao.id == id) {
                return movimentacao;
            }
        }
        throw new Exception("Movimentação não existe");
    }
    public static void removeMovimentacao(int id) throws Exception{
        Movimentacao movimentacao = getMovimentacao(id);
        movimentacoes.remove(movimentacao);
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n"
            + "Data: " + data + "\n"
            + "Tipo: " + tipo + "\n"
            + "Quantidade: " + quantidade + "\n"
            + "Produto: " + this.idProduto + "\n"
            + "Local: " + this.idLocal + "\n";
}
