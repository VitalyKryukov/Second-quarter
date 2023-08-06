package hw4_v3;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Andrey");
        res = hashMap.put("+79005554432", "Aleksey");
        res = hashMap.put("+79005554432", "Daria");
        res = hashMap.put("+79005554433", "Elena");
        res = hashMap.put("+79005554434", "Kostya");
        res = hashMap.put("+79005554435", "Ivan");
        res = hashMap.put("+79005554436", "Olga");
        res = hashMap.put("+79005554437", "Sonya");
        res = hashMap.put("+79005554438", "Masha");
        res = hashMap.put("+79005554439", "Oleg");

        // Uncomment these lines if you want to test get() and remove() methods
        // res = hashMap.get("+79005554436");
        // hashMap.remove("+79005554438");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }
    }
}
