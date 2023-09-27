import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BuscaBinaria BB = new BuscaBinaria();
        System.out.println("Entre com um numero na árvore: ");
        //TODO fazer um while pra ficar perguntando até digitar 'f'
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        BB.InsereNode(numero);
        System.out.println("\nTree: " + BB);
    }
}