package lab3_var3_8;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        out.println("Random piano with 5 keys");
        Piano piano = new Piano(5);
        System.out.println(piano);

        out.println("\nHandmade piano");
        Key[] keys = new Key[3];
        keys[0] = new Key("lol");
        keys[1] = new Key("kek");
        keys[2] = new Key("cheburek");
        piano.setKeys(keys);
        System.out.println(piano);

        out.println("\nRandom piano");
        piano = new Piano();
        System.out.println(piano);

        for (int i = 0; i < 20; i++) {
            piano.play();
        }
        System.out.println(piano);
        piano.tune();
        System.out.println(piano);

        for (int i = 0; i < 20; i++) {
            piano.pushKey(piano.getKeys().length - 1);
            piano.pushKey(0);
        }
        System.out.println(piano);
    }
}
