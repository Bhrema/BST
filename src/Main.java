import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BuscaBinaria BB = new BuscaBinaria();
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("Entre com um numero na árvore: ");
        BB.InsereNode(numero);

    }
}