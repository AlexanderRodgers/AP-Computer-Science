public class Pokemon {
    private String name;
    private String type;
    private int level;

    public Pokemon(String n, String t, int l) {
        name = n;
        type = t;
        level = l;
    }

    public String toString() {
        return name + " Type: " + type + " Level: " + level;
    }

}