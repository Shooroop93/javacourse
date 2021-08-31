package day18;

public class Task3 {
    public static void main(String[] args) {

        Node root = new Node(30);

        int[] numbers = {35, 356, 14, 315, 1, 674, 45, 477, 124, 66, 11, 0};

        for( int num : numbers){
            addNode(num,root);
        }

        dfs(root);

    }

    private static void addNode (int value,Node root) {

        if(root == null){
            throw new IllegalArgumentException("Корневой узел null");
        }

        Node nextNode = root;
        Node current = null;

        while (nextNode != null) {
            current = nextNode;

            if (value < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }

        if ( value < current.getValue()) {
            current.setLeft(new Node(value));
        }else{
            current.setRight(new Node(value));
        }

    }

    private static void dfs (Node node) {

        if (node == null) {
            return;
        }

        dfs(node.getLeft());
        System.out.println(node.getValue() + " ");
        dfs(node.getRight());

    }

    public static class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }


    }
}