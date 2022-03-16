package com.dileep;

public class PreOrderTraversal {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int key) {
            this.data = key;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preOrderTrav(root);

    }

    // preOrder = root->left->right
    static void preOrderTrav(Node root) {
        if(root == null) {
            return;
        }

        System.out.println(root.data);

        preOrderTrav(root.left);
        preOrderTrav(root.right);

    }

}


