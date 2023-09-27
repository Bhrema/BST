public class BuscaBinaria implements ArvoreBinariaInterface {
    protected Node root;

    @Override
    public Node PegaRoot() {
        return root;
    }

    @Override
    public Node BuscaNode(int posicao) {
        return BuscaNode(posicao, root);
    }

    public Node BuscaNode(int posicao, Node root) {
        Node currentNode = root;

        while (currentNode != null) {
            if (posicao == currentNode.numero) {
                return currentNode;
            } else if (posicao < currentNode.numero) {
                currentNode = currentNode.esquerda;
            } else {
                currentNode = currentNode.direita;
            }
        }

        return null; // Retorne null se o nó não for encontrado.
    }

    @Override
    public void InsereNode(int key) {

    }

    @Override
    public void DeletaNode(int key) {

    }
}
