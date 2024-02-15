package lab3_var3_8;


public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano(5);
        System.out.println(piano);

        Key[] keys = new Key[3];
        keys[0] = new Key("lol");
        keys[1] = new Key("kek");
        keys[2] = new Key("cheburek");
        piano.setKeys(keys);
        System.out.println(piano);

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
