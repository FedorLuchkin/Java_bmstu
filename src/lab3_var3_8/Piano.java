package lab3_var3_8;

import java.util.Objects;
import java.util.Random;


public class Piano {
    // out of tune | in tune
    private int keyCount;
    private Key[] keys;

    public Piano() {
        Random random = new Random();
        this.keyCount = random.nextInt(10) + 2;
        this.keys = new Key[this.keyCount];
        this.tune();
    }

    public Piano(int keyCount){
        this.keyCount = keyCount;
        this.keys = new Key[this.keyCount];
        this.tune();
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] newKeys) {
        this.keyCount = newKeys.length;
        this.keys = newKeys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piano piano)) return false;

        Key[] firstKeys = getKeys();
        Key[] secondKeys = piano.getKeys();
        if (firstKeys.length != secondKeys.length) return false;

        boolean flag = true;
        int i = 0;
        while (flag && i < keyCount) {
            if (!firstKeys[i].equals(secondKeys[i])) flag = false;
            i = i + 1;
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash((Object) getKeys());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Piano: {\n");
        for (Key key : getKeys()) {
            result.append("\t").append(key.toString()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

    public void tune() {
        for (int i = 0; i < this.keyCount; i++) {
            this.keys[i] = new Key("in tune");
        }
    }

    public void pushKey(int keyNumber) {
        Random random = new Random();
        if (random.nextBoolean() && random.nextBoolean()) this.keys[keyNumber].setState("out of tune");
    }

    public void play() {
        Random random = new Random();
        int pushCount = random.nextInt(keyCount / 2);
        for (int i = 0; i < pushCount; i++) {
            pushKey(random.nextInt(keyCount));
        }
    }
}
