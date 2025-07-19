import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU: ");
            System.out.println("1- Cadastrar usúarios: ");
            System.out.println("2- Listas usuários: ");
            System.out.println("3- Atualizar usuários: ");
            System.out.println("4- Remover usuários: ");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao){
                case 1 -> usuarioService.adicionarUsuarios(scanner);
                case 2 -> usuarioService.listarUsuarios();
                case 3 -> usuarioService.atualizarUsuario(scanner);
                case 4 -> usuarioService.removerUsuario(scanner);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }

}
