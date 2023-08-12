class BinaryNode {
    int val;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int val) {
        this.val = val;
    }
}

public class NodesAtDistanceK {

    public static void printNodesAtDistanceK(BinaryNode root, int k) {
        if (root == null || k < 0)
            return;

        printNodesAtDistanceKUtil(root, k, 0);
    }

    private static void printNodesAtDistanceKUtil(BinaryNode node, int k, int currentDistance) {
        if (node == null)
            return;

        if (currentDistance == k) {
            System.out.print(node.val + " ");
            return;
        }

        printNodesAtDistanceKUtil(node.left, k, currentDistance + 1);
        printNodesAtDistanceKUtil(node.right, k, currentDistance + 1);
    }

    public static void main(String[] args) {

        BinaryNode root = new BinaryNode(1);
        root.left = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(5);
        root.right.left = new BinaryNode(6);
        root.right.right = new BinaryNode(7);

        int k = 2;
        System.out.println("Nodes at distance " + k + " from the root:");
        printNodesAtDistanceK(root, k);
    }
}
