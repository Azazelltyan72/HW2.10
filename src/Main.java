import java.util.*;

public class Main {
    public static Map<String, Integer> laptop = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Task 1.1");
        HashMap<String, String> map = new HashMap<>();

        TelephoneDirectory people1 = new TelephoneDirectory("Аня","+79045678902");
        TelephoneDirectory people2 = new TelephoneDirectory("Ангелина","+79045674678");
        TelephoneDirectory people3 = new TelephoneDirectory("Лия","+79023469087");
        TelephoneDirectory people4 = new TelephoneDirectory("Алия","+79011111111");
        TelephoneDirectory people5 = new TelephoneDirectory("Фпрпрп","+79022222222");
        TelephoneDirectory people6 = new TelephoneDirectory("Зтити","+79033333333");
        TelephoneDirectory people7 = new TelephoneDirectory("Рджыжвэ","+79044444444");
        TelephoneDirectory people8 = new TelephoneDirectory("Уититть","+79055555555");
        TelephoneDirectory people9 = new TelephoneDirectory("Литтльл","+79066666666");
        TelephoneDirectory people10 = new TelephoneDirectory("Лваравмыо","+79077777777");
        TelephoneDirectory people11 = new TelephoneDirectory("Уопопоп","+79088888888");
        TelephoneDirectory people12 = new TelephoneDirectory("Ылилоад","+79099999999");
        TelephoneDirectory people13 = new TelephoneDirectory("Рдллаьп","+79111111111");
        TelephoneDirectory people14 = new TelephoneDirectory("Пддктнт","+79122222222");
        TelephoneDirectory people15 = new TelephoneDirectory("Рлыжуеьб","+792111111113");
        TelephoneDirectory people16 = new TelephoneDirectory("Рждывжье","+793111111112");
        TelephoneDirectory people17 = new TelephoneDirectory("Кьтапабк","+79222222222");
        TelephoneDirectory people18 = new TelephoneDirectory("Уэбжэжхь","+79066637880");
        TelephoneDirectory people19 = new TelephoneDirectory("Эьлаоие","+79766666666");
        TelephoneDirectory people20 = new TelephoneDirectory("Хлчолимыл","+79966666666");

        map.put(people1.getName(), people1.getTelephoneNumber());
        map.put(people2.getName(), people2.getTelephoneNumber());
        map.put(people3.getName(), people3.getTelephoneNumber());
        map.put(people4.getName(), people4.getTelephoneNumber());
        map.put(people5.getName(), people5.getTelephoneNumber());
        map.put(people6.getName(), people6.getTelephoneNumber());
        map.put(people7.getName(), people7.getTelephoneNumber());
        map.put(people8.getName(), people8.getTelephoneNumber());
        map.put(people9.getName(), people9.getTelephoneNumber());
        map.put(people10.getName(), people10.getTelephoneNumber());
        map.put(people11.getName(), people11.getTelephoneNumber());
        map.put(people12.getName(), people12.getTelephoneNumber());
        map.put(people13.getName(), people13.getTelephoneNumber());
        map.put(people14.getName(), people14.getTelephoneNumber());
        map.put(people15.getName(), people15.getTelephoneNumber());
        map.put(people16.getName(), people16.getTelephoneNumber());
        map.put(people17.getName(), people17.getTelephoneNumber());
        map.put(people18.getName(), people18.getTelephoneNumber());
        map.put(people19.getName(), people19.getTelephoneNumber());
        map.put(people20.getName(), people20.getTelephoneNumber());
        System.out.println(map);

        System.out.println("Task 1.2");
        Set<Product> products = new HashSet<>();
        HashMap<Product, Integer> prrec = new HashMap<>();

        Product bananas = new Product("Банан", 20.99, 1);
        Product tomatos = new Product("Помидор", 20.99, 2);
        Product cucumbers = new Product("Огурцы", 20.99, 2);
        Product potatos = new Product("Картошка", 20.99, 1);
        Product eggs = new Product("Яйца", 20.99, 1);
        Product apples = new Product("Яблоки", 20.99, 1);
        prrec.put(bananas, bananas.getQuantity());

        Recipe salat = new Recipe( "САЛАТ1");
        Recipe salat2 = new Recipe("САЛАТ2");
        salat.getIngredients().add(tomatos);
        salat.getIngredients().add(cucumbers);
        salat.getIngredients().add(eggs);
        salat.getIngredients().add(apples);

        salat2.getIngredients().add(tomatos);
        salat2.getIngredients().add(cucumbers);
        salat2.getIngredients().add(eggs);
//        salat2.getIngredients().add(potatos);
        System.out.println(salat);
        System.out.println(salat2);
        System.out.println(salat.getIngredients().size());

        Set<Recipe> recipes = new HashSet<>();
        salat.addRecipe(recipes);

        System.out.println("Task 1.3");

        laptop.put("Aзалия", 22);
        laptop.put("Алсу", 21);
        laptop.put("Лия", 21);
        laptop.put("Ильнур", 21);

        add("Aзалия", 24);
        System.out.println(laptop);
        add("Aзалия", 22);

    }

    public static void add(String str, Integer integ) {
        if (Objects.equals(laptop.put(str, integ), integ)) {
            throw new UnsupportedOperationException("Ключ с подобным значением уже есть");
        }
    }
}