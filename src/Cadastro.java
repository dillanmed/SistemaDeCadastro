import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        boolean executando = true;

        while(executando){
            System.out.println("\nMenu de Cadastro: ");
            System.out.println("1- Cadastrar nomes: ");
            System.out.println("2- Listas nomes: ");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    System.out.println("Digite seu email: ");
                    String email = scanner.next();

                    Pessoa novaPessoa = new Pessoa(nome, idade, email);
                    listaPessoas.add(novaPessoa);
                    System.out.println("Pessoa cadastrada com sucesso");
                    break;

                case 2:
                    if(listaPessoas.isEmpty()){
                        System.out.println("Nenhuma Pessoa cadastrada");
                    } else {
                        System.out.println("\nPessoas cadastradas: ");
                        for (Pessoa p : listaPessoas) {
                            p.exibirDados();
                        }

                    }
                    break;
                case 3:
                    executando = false;
                    System.out.println("Encerrando o sistema");
                    break;

                default:
                    System.out.println("Opção inváçida, tente novamente!");
                    break;

            }
        }
        scanner.close();





    }
}
