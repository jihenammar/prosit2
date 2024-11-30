public class ZooManagement {
    public static void main(String[] args) {
        // Création d'un objet Animal (lion) avec le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d'un objet Zoo (myZoo) avec le constructeur paramétré
        Zoo myZoo = new Zoo("My Zoo", "Paris", 20);

        // Ajouter l'animal lion au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations
        lion.displayAnimalInfo();
        myZoo.displayZooInfo();
    }
}
