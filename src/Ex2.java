
import java.util.HashSet;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args) {
        // 1. Créer et initialiser un ensemble "countries_set" avec 5 éléments
        Set<String> countries_set = new HashSet<>();
        countries_set.add("USA");
        countries_set.add("China");
        countries_set.add("Japan");
        countries_set.add("Germany");
        countries_set.add("France");

        // 2. Afficher le nombre d’éléments de l’ensemble
        System.out.println("Nombre d'éléments dans l'ensemble : " + countries_set.size());

        // 3. Créer une méthode pour afficher un ensemble
        System.out.println("Contenu de l'ensemble : ");
        displaySet(countries_set);
        // Remarque : L'ordre d'affichage ne correspond pas nécessairement à l'ordre d'insertion.

        // 4. Modifier la valeur "Germany" par "Tunisia"
        if (countries_set.contains("Germany")) {
            countries_set.remove("Germany");
            countries_set.add("Tunisia");
        }

        System.out.println("Contenu de l'ensemble après modification : ");
        displaySet(countries_set);

        // 5. Vider l'ensemble countries_set
        countries_set.clear();
        System.out.println("Ensemble vidé : " + countries_set);
    }

    // Méthode pour afficher un ensemble
    private static void displaySet(Set<String> set) {
        for (String country : set) {
            System.out.println("- " + country);
        }
    }
}

