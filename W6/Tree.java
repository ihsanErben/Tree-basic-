package W6;

import java.util.Scanner;

public class Tree {
    
    Node root;
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node tmp = root;
            Node parent = root;
            while (tmp != null) {
                parent = tmp;
                if (data > tmp.data) {
                    tmp = tmp.right;
                } else if (data < tmp.data) {
                    tmp = tmp.left;
                }
            }
            if (data > parent.data) {
                parent.right = newNode;
            } else if (data < parent.data) {
                parent.left = newNode;
            }
        }
    }
    
    public Node search(Node root, int data) {
        if (root == null) {
            return null;
        } else {
            if (data < root.data) {
                return search(root.left, data);
            } else if (data > root.data) {
                return search(root.right, data);
            } else if (data == root.data) {
                return root;
            }
        }
        return null;
    }
    
    public Node searchMin() {
        Node tmp = root;
        if (root == null) {
            return null;
        } else {
            while (tmp.left != null) {
                tmp = tmp.left;
            }
        }
        return tmp;
    }
    
    public void deleteMin() {
        Node tmp = root;
        Node parent = root;
        while (tmp.left != null) {
            parent = tmp;
            tmp = tmp.left;
        }
        parent.left = null;
    }
    
    public void preOrder(Node x) {
        if (x != null) {
            System.out.print(x.data + ", ");
            preOrder(x.left);
            preOrder(x.right);
        }
    }
    
    public void inOrder(Node x) {
        if (x != null) {
            inOrder(x.left);
            System.out.print(x.data + ", ");
            inOrder(x.right);
        }
    }
    
    public void postOrder(Node x) {
        if (x != null) {
            postOrder(x.left);
            postOrder(x.right);
            System.out.print(x.data + ", ");
        }
    }
    
    public boolean isEmpty() {
        return (root == null);
    }
    
    public Node cloneTree(Node root) {
        if (root == null) {
            return null;
        } else {
            Node newNode = new Node(root.data);
            newNode.left = cloneTree(root.left);
            newNode.right = cloneTree(root.right);
            return newNode;
        }
    }
    
    public void addRandom() {
        int a = (int) (Math.random() * 100);
        add(a);
        preOrder(root);
        System.out.println("");
    }
}
