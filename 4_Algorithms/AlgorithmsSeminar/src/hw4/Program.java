package hw4;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554430", "Пётр");
        res = hashMap.put("+79005554430", "Борис");
        res = hashMap.put("+79005554431", "Сергей");
        res = hashMap.put("+79005554432", "Татьяна");
        res = hashMap.put("+79005554434", "Иван");
        res = hashMap.put("+79005554435", "Анжела");
        res = hashMap.put("+79005554436", "Маша");
        res = hashMap.put("+79005554437", "Антон");
        res = hashMap.put("+79005554438", "Ярослав");
        res = hashMap.put("+79005554439", "Ведеслав");


        //res = hashMap.get("+79005554436");
        
        //hashMap.remove("+79005554438");
        
        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}