package Assignment17;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {


    public static Node buildTreeLevelOrder(Scanner sc) {
        System.out.println("Enter root value (-1 for no node):");
        int rootVal = sc.nextInt();
        if (rootVal == -1) return null;

        Node root = new Node(rootVal);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.println("Enter left child of " + current.data + " (-1 for no node):");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new Node(leftVal);
                queue.add(current.left);
            }

            System.out.println("Enter right child of " + current.data + " (-1 for no node):");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new Node(rightVal);
                queue.add(current.right);
            }
        }

        return root;
    }


    public static void printLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.println("Level order traversal:");
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }


    public static int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }


    public static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTreeLevelOrder(sc);

        printLevelOrder(root);

        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafCount);

        int treeHeight = height(root);
        System.out.println("Height of tree: " + treeHeight);

        sc.close();
    }
}

