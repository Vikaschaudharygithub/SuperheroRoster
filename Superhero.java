class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    // Constructor
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Display method
    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("------------------------");
    }

    // Getter for sorting
    public int getPowerLevel() {
        return powerLevel;
    }
}
