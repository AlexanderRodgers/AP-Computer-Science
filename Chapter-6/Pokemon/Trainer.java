import java.util.ArrayList;

public class Trainer {
    
    private String name;
    private String team;
    private ArrayList<Pokemon> bag = new ArrayList<Pokemon>();
    //private Pokemon[] bag;
    private int numPokemon = 0;
    
    public Trainer(String n, String t) {
        name = n;
        team = t;
        //bag = new Pokemon[2];
    }
    
    public String toString() {
        return name + " Team: " + team;
    }
    
    public String getBag() {
        String temp = "\n\n" + name + "\'s Bag: \n";
        for (Pokemon p : bag) {
            if (p != null)
                temp += p.toString() + "\n";
        }
        
        return temp;
    }
    
    /*
    public void increaseSize() {
        Pokemon[] temp = new Pokemon[bag.length + 2];
        for (int i = 0; i < bag.length; i++) {
            temp[i] = bag[i];
        }
        
        bag = temp;
    }
    */
   
    public void capture(String n, String t, int l) {
        Pokemon p = new Pokemon(n, t, l);
        bag.add(p);
        //bag[numPokemon] = new Pokemon(n, t, l);
        numPokemon++;
    }
}