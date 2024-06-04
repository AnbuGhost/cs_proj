// go to the link below for the credit and gem prices per rarity
// https://brawlstars.fandom.com/wiki/Credits

class Brawler {
    private String name;
    private String rarity;
    private int gemCost;
    private int creditsCost;
    
    public Brawler(String name, String rarity, int gemCost, int creditsCost) {
        this.name = name;
        this.rarity = rarity;
        this.gemCost = gemCost;
        this.creditsCost = creditsCost;
    }
    
    // basic description of attack
    public void Attack() {
        System.out.println("Launch 1 projectile/attack per auto");
    }
    
    public String getName() {
        return name;
    }
    
    public String getRarity() {
        return rarity;
    }
    
    public String getPrice() {
        return gemCost + " gems or " + creditsCost + " credits";
    }
    
    public String toString() {
        return name + " is a " + rarity + " Brawler that costs " + getPrice();
    }
}

class Brawler_Mythic extends Brawler {
    public Brawler_Mythic(String name) {
        super(name, "Mythic", 349, 1900);
    }
}

class Buzz extends Brawler_Mythic {
    public Buzz() {
        super("Buzz");
    }
    
    @Override
    // buzz attacks 4 times per auto so you override the base method
    public void Attack() {
        System.out.println("Launch 4 attacks per auto");
    }
}

public class MyClass {
    public static void main(String args[]) {
        Buzz b = new Buzz();
        System.out.println(b);
        System.out.println(b.getName());
        System.out.println(b.getRarity());
        System.out.println(b.getPrice());
        b.Attack();
    }
}