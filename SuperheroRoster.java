public class SuperheroRoster {

    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        // 2. Print each hero's details using a loop
        System.out.println("=== Superhero Roster ===");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println("------------------------");
        }

        // 3. Call the searchHero method to find a specific hero by name
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Hulk");

        // 4. Calculate and display the average power level
        double average = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + average);

        // 5. Create and use Superhero objects
        System.out.println("\n=== Superheroes as Objects ===");
        Superhero[] heroes = new Superhero[3];
        for (int i = 0; i < heroNames.length; i++) {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            heroes[i].displayHero();
        }

        // 6. (Optional) Sort heroes by power level (descending)
        System.out.println("\n=== Sorted Heroes by Power Level ===");
        sortHeroesByPower(heroes);
        for (Superhero hero : heroes) {
            hero.displayHero();
        }
    }

    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("\nHero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nHero '" + target + "' not found.");
        }
    }

    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }

    // Bonus: Method to sort Superhero objects by power level in descending order
    public static void sortHeroesByPower(Superhero[] heroes) {
        for (int i = 0; i < heroes.length - 1; i++) {
            for (int j = i + 1; j < heroes.length; j++) {
                if (heroes[j].getPowerLevel() > heroes[i].getPowerLevel()) {
                    Superhero temp = heroes[i];
                    heroes[i] = heroes[j];
                    heroes[j] = temp;
                }
            }
        }
    }
}
