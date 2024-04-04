import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        // cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // solicita ao usuário que digite seu nome
        System.out.println("Digite seu nome: ");

        // Lê o nome digitado pelo usuário e armazena em uma variável
        String nome = scanner.nextLine();

        // Mostra uma mensagem com o nome digitado pelo usuário
        System.out.println("Olá " + nome + "!");

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}