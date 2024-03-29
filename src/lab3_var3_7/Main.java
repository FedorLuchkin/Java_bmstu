package lab3_var3_7;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        out.println("Random tree with 5 leaves");
        Tree tree = new Tree(5);
        System.out.println(tree);

        out.println("\nHandmade tree");
        Leaf[] leaves = new Leaf[3];
        leaves[0] = new Leaf("lol");
        leaves[1] = new Leaf("kek");
        leaves[2] = new Leaf("cheburek");
        tree.setLeaves(leaves);
        System.out.println(tree);

        out.println("\nRandom tree");
        tree = new Tree();
        System.out.println(tree);

        tree.frost();
        System.out.println(tree);
        tree.turnYellow();
        System.out.println(tree);
        tree.fall();
        System.out.println(tree);
        tree.bloom();
        System.out.println(tree);
    }
}
