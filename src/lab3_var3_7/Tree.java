package lab3_var3_7;

import java.util.Objects;
import java.util.Random;


public class Tree {

    private int leafCount;
    private Leaf[] leaves;


    public Tree(){
        bloom();
    }

    public Tree(int leafCount){
        this.leafCount = leafCount;
        this.leaves = new Leaf[leafCount];
        for (int i = 0; i < this.leafCount; i++) {
            this.leaves[i] = new Leaf("blooms");
        }
    }

    public Leaf[] getLeaves() {
        return leaves;
    }

    public void setLeaves(Leaf[] newLeaves) {
        this.leafCount = newLeaves.length;
        this.leaves = newLeaves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree tree)) return false;

        Leaf[] firstLeaves = getLeaves();
        Leaf[] secondLeaves = tree.getLeaves();
        if (firstLeaves.length != secondLeaves.length) return false;

        boolean flag = true;
        int i = 0;
        while (flag && i < leafCount) {
            if (!firstLeaves[i].equals(secondLeaves[i])) flag = false;
            i = i + 1;
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash((Object) getLeaves());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Tree: {\n");
        for (Leaf leaf : getLeaves()) {
            result.append("\t").append(leaf.toString()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

    public void bloom() {
        Random random = new Random();
        this.leafCount = random.nextInt(10);
        this.leaves = new Leaf[this.leafCount];
        for (int i = 0; i < this.leafCount; i++) {
            this.leaves[i] = new Leaf("blooms");
        }
    }

    public void frost() {
        for (Leaf leaf : this.leaves) {
            leaf.setState("covered with frost");
        }
    }

    public void turnYellow() {
        for (Leaf leaf : this.leaves) {
            leaf.setState("turned yellow");
        }
    }

    public void fall() {
        this.leaves = new Leaf[0];
    }
}
