package Schema;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ankit on 22/7/17.
 */

public class Metal {
    private String name;
    private int quantity;
    private int credits;

    private static HashMap<String,Metal> metalMap = new HashMap<String,Metal>();
    public Metal(String name, int quantity, int credits) {
        this.name = name;
        this.quantity = quantity;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCredits() {
        return credits;
    }

    public static Metal addNewMetal(String name,int quantity,int credits) {
        return metalMap.put(name, new Metal(name, quantity, credits));
    }

    public static Metal getMetal(String name){
        return metalMap.get(name);
    }
}
