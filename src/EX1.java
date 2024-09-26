import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        // 1. Créer et initialiser une liste « countries_list » avec 5 éléments
        List<String> countries_list = new ArrayList<>();
        countries_list.add("USA");
        countries_list.add("China");
        countries_list.add("Japan");
        countries_list.add("Germany");
        countries_list.add("France");

        // 2. Afficher le nombre d’éléments de la liste
        System.out.println("Nombre d'éléments dans la liste : " + countries_list.size());

        // 3. Afficher la liste avec la méthode displayList
        System.out.println("Liste des pays :");
        displayList(countries_list);

        // 4. Modifier la valeur à la position « 3 » par « Tunisia »
        countries_list.set(3, "Tunisia");
        System.out.println("\nListe après modification (remplacement de Germany par Tunisia) :");
        displayList(countries_list);

        // 5. Trier la liste par ordre alphabétique
        Collections.sort(countries_list);
        System.out.println("\nListe triée par ordre alphabétique :");
        displayList(countries_list);

        // 6. Vider la liste
        countries_list.clear();
        System.out.println("\nListe après l'avoir vidée :");
        displayList(countries_list);
    }

    // 3. Méthode pour afficher la liste
    private static void displayList(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("La liste est vide.");
        } else {
            for (String country : list) {
                System.out.println("- " + country);
            }
        }
    }
}
