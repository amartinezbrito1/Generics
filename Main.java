import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();

        // Add some items to the bag
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Cherry");
        bag.add("Date");
        bag.add("Elderberry");

        System.out.println("Bag size: " + bag.getSize()); // Output: Bag size: 5

        // Remove a random item
        String removedItem = bag.remove();
        System.out.println("Removed item: " + removedItem);

        // Remove 2 random items and store them in a new bag
        Bag<String> removedBag = bag.remove(2);
        System.out.println("Removed items in new bag: " + removedBag.empty());

        // Add items from another bag
        Bag<String> otherBag = new Bag<>();
        otherBag.add("Grape");
        otherBag.add("Kiwi");
        bag.add(otherBag);
        System.out.println("Bag size after adding another bag: " + bag.getSize());

        // Empty the bag and get all items in random order
        ArrayList<String> allItems = bag.empty();
        System.out.println("All items in random order: " + allItems);

        // Test removeAndReplace()
        String peekedItem = bag.removeAndReplace();
        System.out.println("Peeked item: " + peekedItem);
        System.out.println("Bag size after peeking: " + bag.getSize());
    }
}