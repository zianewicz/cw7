import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Items {
    private int id;
    private String name;

    public Items(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("Name: " + name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        // Tworzenie obiektów klasy Item i dodawanie ich do ArrayList
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Laptop"));
        items.add(new Item(2, "Smartphone"));
        items.add(new Item(3, "Tablet"));
        items.add(new Item(4, "Monitor"));
        items.add(new Item(5, "Keyboard"));
        items.add(new Item(6, "Mouse"));
        items.add(new Item(7, "Printer"));
        items.add(new Item(8, "Scanner"));
        items.add(new Item(9, "Webcam"));
        items.add(new Item(10, "Headphones"));

        // Wyłuskiwanie pięciu pierwszych elementów za pomocą subList
        List<Item> firstFiveItems = items.subList(0, 5);

        // Umieszczanie wyłuskanych elementów w kontenerze HashSet
        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);

        // Wyświetlanie zawartości HashSet
        for (Item item : itemSet) {
            System.out.println(item);
        }
    }
}
