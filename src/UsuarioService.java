import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioService {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarUsuarios(Scanner scanner){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(proximoId++, nome, email, senha);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    public void listarUsuarios(){
        if (usuarios.isEmpty()){
            System.out.println("Nenhum usuário cadastrado!");
        } else {
            for (Usuario u : usuarios){
                System.out.println(u);
            }
        }
    }
    public void atualizarUsuario(Scanner scanner) {
        System.out.println("Digite o ID do usuário que deseja atualizar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Usuario usuario = encontrarUsuarioPorID(id);
        if (usuario != null) {
            System.out.println("Novo nome: ");
            scanner.nextLine();
            System.out.println("Novo email: ");
            scanner.nextLine();
            System.out.println("Nova senha: ");
            scanner.nextLine();
        } else {
            System.out.println("Usuário não encontrado!");
        }

        }
    public void removerUsuario(Scanner scanner){
        System.out.println("Digite o ID do usuário que deseja remover: ");
        int id = Integer.parseInt(scanner.nextLine());

        Usuario usario = encontrarUsuarioPorID(id);
        if (usuarios != null){
            usuarios.remove(usario);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Usuário não encontrado");
        }
    }

    private Usuario encontrarUsuarioPorID(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
    return null;
    }
}
