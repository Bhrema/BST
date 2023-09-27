public class Node {
    int numero;
    Node esquerda;
    Node direita;
    Node pai;
    public Node(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
