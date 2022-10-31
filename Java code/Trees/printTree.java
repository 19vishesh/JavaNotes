public class printTree {
    static class Trunk {
        Trunk prev;
        String str;

        public Trunk(Trunk prev, String str) {
            this.prev = prev;
            this.str = str;
        }
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public Node buildTree(Integer nodes[]) {
        idx++;
        //System.out.print(idx+" ");
        // System.out.print(nodes[idx]+" ");
        if (idx >= nodes.length) {
            return null;
        }

        if (null == nodes[idx]) {
            return null;
        }
        
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void showTrunks(Trunk p) {
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);
    }

    public static void printTree(Node root, Trunk prev, boolean isLeft) {
        if (root == null) {
            return;
        }

        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);

        printTree(root.right, trunk, true);

        if (prev == null) {
            trunk.str = "———";
        } else if (isLeft) {
            trunk.str = ".———";
            prev_str = "   |";
        } else {
            trunk.str = "`———";
            prev.str = prev_str;
        }

        showTrunks(trunk);
        System.out.println(" " + root.data);

        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";

        printTree(root.left, trunk, false);
    }

    public static void main(String[] args) {
        printTree tree = new printTree();
        Integer nodes[] = { 1,2,3,4,5,null,6};
        // Integer nodes[]={1, 2, 4, null, null, 5, null, null, 3, null, 6, null, null};
                // System.out.println(nodes.length);
        Node root = tree.buildTree(nodes);
        
        printTree(root, null, false);
       
    }

}