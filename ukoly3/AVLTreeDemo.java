package ukoly3;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }

    int calculateLeftHeight() {
        return (left == null) ? 0 : 1 + Math.max(
            left.calculateLeftHeight(),
            left.calculateRightHeight()
        );
    }

    int calculateRightHeight() {
        return (right == null) ? 0 : 1 + Math.max(
            right.calculateLeftHeight(),
            right.calculateRightHeight()
        );
    }

    int calculateBalanceFactor() {
        return calculateLeftHeight() - calculateRightHeight();
    }
}

class Tree {
    Node root;

    void addNode(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = addNode(node.left, value);
        } else if (value > node.value) {
            node.right = addNode(node.right, value);
        }

        int balance = node.calculateBalanceFactor();

        if (balance > 1 && value < node.left.value) {
            return rotateRight(node);
        }
        if (balance < -1 && value > node.right.value) {
            return rotateLeft(node);
        }
        if (balance > 1 && value > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        return x;
    }

    private Node rotateLeft(Node y) {
        Node x = y.right;
        Node T2 = x.left;

        x.left = y;
        y.right = T2;

        return x;
    }

    @Override
    public String toString() {
        if (root == null) return "Strom je prázdný";

        StringBuilder result = new StringBuilder();
        printTree(root, result, "", true, true);
        return result.toString();
    }

    private void printTree(Node node, StringBuilder result, String prefix, boolean isTail, boolean isRoot) {
        if (node.right != null) {
            printTree(node.right, result, prefix + (isTail ? "    " : "    "), false, false);
        }
        result.append(prefix).append(isRoot ? "" : (isTail ? "\\-- " : "/--")).append(node.value).append("\n");
        if (node.left != null) {
            printTree(node.left, result, prefix + (isTail ? "    " : "    "), true, false);
        }
    }
}

public class AVLTreeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(11);
        tree.addNode(14);
        tree.addNode(140);
        tree.addNode(150);
        tree.addNode(7);
        tree.addNode(2);

        System.out.println(tree);

        tree.addNode(25); 
        System.out.println("Po pridani 25:");
        System.out.println(tree);
    }
}

