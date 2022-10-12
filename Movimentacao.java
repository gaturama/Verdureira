import java.util.ArrayList;

public class Movimentacao{

    public int id;
    public String data;
    public String produto;
    public String local;
    public String tipo;
    public int quantidade;
    public ArrayList<Produto> produtos;

    public static ArrayList<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

    public Movimentacao(
        int id,
        String data,
        String produto,
        String local,
        String tipo,
        String quantidade
    ){
        this.id = this.getNextId();
        this.data = data;
        this.local = local;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.produtos = new ArrayList<>();

        movimentacoes.add(this);
    
    }
    private int getNextId() {
        int id = 0;

         for(Movimentacao movimentacao : movimentacoes){
            if(movimentacao.id > id){
                id = movimentacao.id;
            }
         }
         return id + 1;
    }
}