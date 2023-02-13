package colectii.List.ex1;
import java.util.ArrayList;
import java.util.List;

/**
 * Create a List and display its result (data should be provided by the user - console):
 * - Purchases to be made. *If an element already exists on the list, then it should not be added.
 * - *Add to the example above the possibility of "deleting" purchased elements
 * - Display only those purchases that start with „m" (e.g. milk)
 * - *View only purchases whose next product on the list starts with „m" (e.g. eggs, if milk was next on the list)
 */
public class Main {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        addItem(shoppingList, "water");
        addItem(shoppingList, "sauce");
        addItem(shoppingList, "milk");
        addItem(shoppingList, "bread");
        addItem(shoppingList, "water");
        addItem(shoppingList, "eggs");
        addItem(shoppingList, "milk");

        displayShoppingList(shoppingList);

        displayAllElementsStartingWith(shoppingList, "m");
        displayAllElementsStartingWith(shoppingList, "s");

        displayElementNextTo(shoppingList, "m");
        displayElementNextTo(shoppingList, "w");
    }

    public static void addItem(List<String> shoppingList, String item) {
        if (!shoppingList.contains(item)) {
            shoppingList.add(item);
        }
    }

    public static void displayShoppingList(List<String> shoppingList) {
        System.out.println("Shopping list : ");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
    }

    public static void displayAllElementsStartingWith(List<String> shoppingList, String prefix) {
        System.out.println("Items with " + prefix);

        for (String item : shoppingList) {
            if (item.startsWith(prefix)) {
                System.out.println("- " + item);
            }
        }
    }

    public static void displayElementNextTo(List<String> shoppingList, String prefix) {
        System.out.println("Items next to : ");
        for (int i = 0; i < shoppingList.size(); i++) {
            if (shoppingList.get(i).startsWith(prefix) && i > 0) {
                System.out.println("- " + shoppingList.get(i - 1));
            }
        }
    }
}