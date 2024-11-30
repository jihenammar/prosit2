public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // Zoo peut contenir jusqu'à 25 animaux
    }

    // Méthode pour ajouter un animal au zoo
    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
            System.out.println(animal.name + " ajouté au zoo.");
        } else {
            System.out.println("Index hors limites !");
        }
    }

    // Méthode pour afficher les détails du zoo
    public void displayZooInfo() {
        System.out.println("Zoo: " + name + ", Ville: " + city + ", Cages: " + nbrCages);
    }
}
