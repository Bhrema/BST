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

        return null;
    }

    @Override
    public void InsereNode(int posicao) {
        root = InsereNode(posicao, root);
    }
    public Node InsereNode(int posicao, Node node) {
        if (node == null) {
            return new Node(posicao);
        }

        if (posicao < node.numero) {
            node.esquerda = InsereNode(posicao, node.esquerda);
        } else if (posicao > node.numero) {
            node.direita = InsereNode(posicao, node.direita);
        } else {
            throw new IllegalArgumentException("A árvore já possui esse valor " + posicao);
        }

        return node;
    }

    @Override
    public void DeletaNode(int key) {

    }
}
