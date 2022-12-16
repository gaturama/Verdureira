import java.util.Scanner;

public class Verdureira {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("SEJA BEM VINDO A VERDUREIRA COLHEITA FELIZ");

        do{
            System.out.println("==========================================");
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - Cadastro do Fabricante: ");
            System.out.println("2 - Listar Fabricante: ");
            System.err.println("3 - Cadastrar Produto: ");
            System.out.println("4 - Listar Produto: ");
            System.out.println("5 - Cadastrar o Local de Estoque: ");
            System.out.println("6 - Listar Local de Estoque: ");
            System.out.println("7 - Cadastrar Movimentação do Estoque: ");
            System.out.println("8 - Listar Movimentação de Estoque:  ");
            System.out.println("==========================================");
        
        try{
            opcao = scanner.nextInt();
        }catch (Exception e){
            opcao = 0;
        }
            
            switch (opcao) {
                case 1:
                    cadastrarFabricante(scanner);
                    break;
                case 2: 
                    listarFabricante();
                    break;    
                case 3:
                    cadastrarProduto(scanner);
                    break;
                case 4:
                    listarProduto();
                    break;
                case 5: 
                    cadastrarLocal(scanner);
                    break;
                case 6:
                    listarLocal();
                    break;    
                case 7:
                    cadastrarMovimentacao(scanner);
                    break;
                case 8:
                    listarMovimentacao();
                    break;    
                
                default:
                    System.out.println("Opção Inválida");
            }
        }while (opcao != 0);
        scanner.close();

    }

    public static void cadastrarFabricante(Scanner scanner){
        try{
            System.out.println("Digite o ID do Fabricante: ");
            int id = scanner.nextInt();
            System.out.println("Digite o nome do Fabricante: ");
            String nome = scanner.next();
            System.out.println("Digite o ID do produto fornecido: ");
            int idProduto = scanner.nextInt();

           new Fabricante(id, nome, idProduto);
        }catch (Exception e) {
            System.out.println("Erro ao cadastrar o Fabricante!");
        }
    }

    public static void listarFabricante() {
        System.out.println("Listar Fabricante");
        for (Fabricante fabricante : Fabricante.fabricantes){
         System.out.println(fabricante);
         
        }
    }

    public static void cadastrarProduto(Scanner scanner){
       try{
        System.out.println("Digite o ID do Produto: ");
        int idProduto = scanner.nextInt();
        System.out.println("Digite a descrição do Produto: ");
        String descricao = scanner.next();
        System.out.println("Digite o tamanho do Produto: ");
        String tamanho = scanner.next();
        System.out.println("Digite a cor do Produto: ");
        String cor = scanner.next();
        System.out.println("Digite o ID do fabricante: ");
        int idfabricante = scanner.nextInt();
       
            new Produto(idProduto, descricao, tamanho, cor, null);
        }catch (Exception e){
            System.out.println("Erro ao cadastrar o Produto!");
        }
     }

       public static void listarProduto(){
           System.out.println("Listar Produto");
        for(Produto produto : Produto.produtos){
            System.out.println(produto);
           
        }
     }

       public static void cadastrarLocal(Scanner scanner){
        try{
            System.out.println("Digite o ID do Local de Estoque: ");
            int idLocal = scanner.nextInt();
            System.out.println("Digite os detalhes do Local de Estoque: ");
            String detalhes= scanner.next();
            System.out.println("Digite qual produto tem no Local de Estoque: ");
            int idproduto = scanner.nextInt();
            System.out.println("Digite qual a quantidade de produtos no Local de Estoque: ");
            int quantidade = scanner.nextInt();

            new Local(idLocal, detalhes, idproduto, quantidade);
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o Local de Estoque!");
        }
     }

       public static void listarLocal(){
        System.out.println("Listar local");   
        for(Local local : Local.locais){
        System.out.println(local);            
        }
     }

       public static void cadastrarMovimentacao(Scanner scanner){
        try{
            System.out.println("Digite o ID da Movimentação: ");
            int idMovimentacao = scanner.nextInt();
            System.out.println("Digite a data da Movimentação: ");
            String data = scanner.next();
            System.out.println("Digite o produto da Movimentação: ");
            String produto = scanner.next();
            System.out.println("Digite o local da Movimentação: ");
            String local = scanner.next();
            
            System.out.println("Digite o tipo da Movimentação: ");
            String tipo = scanner.next();

            for(int i = 0; i < tipo; i++){
                switch(tipo){
                    case "E":
                        tipo = "Entrada";
                        break;
                    case "S":
                        tipo = "Saída";
                        break;

            System.out.println("Digite a quantidade de Movimentações: "); 
            int quantidade = scanner.nextInt();
                    default:
                    throw new Exception("Movimentação Inválida!!");        
                }
                System.out.println("Digite o ID do Produto: ");
                int idProduto = scanner.nextInt();

             new Movimentacao(idMovimentacao, data, tipo, i, idProduto, i);
        }catch (Exception e){
            System.out.println("Erro ao cadastrar a Movimentação");
        }
    }

       public static void listarMovimentacao(){
           System.out.println("Listar Movimentação");
        for(Movimentacao movimentacao : Movimentacao.movimentacoes){
            System.out.println(movimentacao);
        }
    }
}
    

