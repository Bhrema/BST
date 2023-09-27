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
    public void DeletaNode(int posicao) {
        root = DeletaNode(posicao, root);
    }
   public Node DeletaNode(int posicao, Node node) {
        if (node == null) {
            return null;
        }
        if (posicao < node.numero) {
            node.esquerda = DeletaNode(posicao, node.esquerda);
        } else if (posicao > node.numero) {
            node.direita = DeletaNode(posicao, node.direita);
        }

        else if (node.esquerda == null && node.direita == null) {
            node = null;
        }

        else if (node.esquerda == null) {
            node = node.direita;
        } else if (node.direita == null) {
            node = node.esquerda;
        }
        /**TODO Aqui é preciso ainda verificar quando a deleção é feita em um nó com dois filhos
            1) Criar um método que receba um node
            2) Verificar os filhos e encontrar o menor deles
            3) Guarda a informação do menor
            4) invoca o método de delete passando os novos paramentros: valor e o nó em questão

        */
    return node;
   }
}