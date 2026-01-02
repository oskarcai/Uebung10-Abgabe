package p2;

public class P2_main {
    public static void main(String[] args) {
        String2 string = new String2("Hallo Welt");
        System.out.println(string);

        string.addPrefix("Guten Morgen und ");
        System.out.println(string);

        string.addPostfix("!!!");
        System.out.println(string);
    }
}
