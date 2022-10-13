import java.util.Scanner;

public class Verdureira {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

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
            }catch (Exception e){
                opcao = 9;
            }
        }while (opcao != 0);
        scanner.close();

    }

    public static void cadastrarFabricante(Scanner scanner){
        try{
            System.out.println("Digite o ID do Fabricante: ");
            int idFabricante = scanner.nextInt();
            System.out.println("Digite o nome do Fabricante: ");
            String nome = scanner.next();

            Fabricante fabricante = new Fabricante(idFabricante, nome);
            System.out.println(
                "Id: " + fabricante.id + "\n"
                + "Nome: " + fabricante.nome + "\n"
            );
        }catch (Exception e) {
            System.out.println("Erro ao cadastrar o Fabricante!");
        }
    }

    public static void listarFabricante() {
        for (Fabricante fabricante : Fabricante.fabricantes){
            System.out.println(
                "Id: " + fabricante.id + "\n"
                + "Nome: " + fabricante.nome + "\n"
            );
        }
    }

    public static void cadastrarProduto(Scanner scanner){
       try{
        System.out.println("Digite o ID do Produto: ");
        int idProduto = scanner.nextInt();
        System.out.println("Digite a descrição do Produto: ");
        String descricao = scanner.next();
        System.out.println("Digite qual é o tamanho do Produto: ");
        String tamanho = scanner.next();
        System.out.println("Digite qual é a cor do Produto: ");
        String cor = scanner.next();
        System.out.println("Digite qual é o fabricante do Produto:");
        String fabricante = scanner.next();
       
        Produto produto = new Produto(idProduto, descricao, tamanho, cor, fabricante);
        System.out.println(
                "Id: " + produto.id + "\n"
                + "Descrição: " + produto.descricao + "\n"
                + "Cor: " + produto.cor + "\n"
                + "Fabricante: " + produto.fabricantes + "\n"
            );
        }catch (Exception e){
            System.out.println("Erro ao cadastrar o Produto!");
        }
       }

       public static void listarProduto(){
        for(Produto produto : Produto.produtos){
            System.out.println(
                "Id: " + produto.id + "\n"
                + "Descrição: " + produto.descricao + "\n"
                + "Cor: " + produto.cor + "\n"
                + "Fabricante: " + produto.fabricantes + "\n"
            );
        }
       }

       public static void cadastrarLocal(Scanner scanner){
        try{
            System.out.println("Digite o ID do Local de Estoque: ");
            int idLocal = scanner.nextInt();
            System.out.println("Digite os detalhes do Local de Estoque: ");
            String detalhes= scanner.next();
            System.out.println("Digite qual produto tem no Local de Estoque: ");
            String produto = scanner.next();
            System.out.println("Digite qual a quantidade de produtos no Local de Estoque: ");
            int quantidade = scanner.nextInt();

         Local local = new Local(idLocal, detalhes, produto, quantidade);
         System.out.println(
            "Id: " + local.id + "\n"
            + "Detalhes: " + local.detalhes + "\n"
            + "Produto: " + local.produto + "\n"
            + "Quantidade: " + local.quantidade + "\n"
        );
        }catch(Exception e){
            System.out.println("Erro ao cadastrar o Local de Estoque!");
        }
       }

       public static void listarLocal(){
        for(Local local : Local.locais){
            System.out.println(
                "Id: " + local.id + "\n"
                + "Detalhes: " + local.detalhes + "\n"
                + "Produto: " + local.produto + "\n"
                + "Quantidade: " + local.quantidade + "\n"
            );
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

                Movimentacao movimentacao = new Movimentacao(idMovimentacao, data, produto, local, tipo, tipo, idProduto);
                System.out.println(
                    "Id: " + movimentacao.id +"\n"
                    + "Data: " + movimentacao.data + "\n"
                    + "Produto: " + movimentacao.produto + "\n"
                    + "Local: " + movimentacao.local + "\n"
                    + "Tipo: " + movimentacao.tipo + "\n"
                    + "Quantidade: " + movimentacao.quantidade + "\n"
                );
                
            }
            
        }catch (Exception e){
            System.out.println("Erro ao cadastrar a Movimentação");
        }
        }

       public static void listarMovimentacao(){
        for(Movimentacao movimentacao : Movimentacao.movimentacoes){
            System.out.println(
                "Id: " + movimentacao.id +"\n"
                + "Data: " + movimentacao.data + "\n"
                + "Produto: " + movimentacao.produto + "\n"
                + "Local: " + movimentacao.local + "\n"
                + "Tipo: " + movimentacao.tipo + "\n"
            );
        }
    }
}
    

