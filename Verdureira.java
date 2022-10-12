import java.util.Scanner;

public class Verdureira {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("==========================================");
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - Cadastro do Fabricante: ");
            System.err.println("2 - Cadastrar Produto: ");
            System.out.println("3 - Cadastrar o Local de Estoque: ");
            System.out.println("4 - Cadastrar Movimentação do Estoque: ");
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
                    breal;    
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
            System.out.println("Digite o nome do Fabricante: ");
            String nome = scanner.next();

            new Fabricante(nome);
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
        System.out.println("Digite a descrição do Produto: ");
        String descricao = scanner.next();
        System.out.println("Qual o tamanho do Produto?: ");
        String tamanho = scanner.next();
       }

        }
    }

