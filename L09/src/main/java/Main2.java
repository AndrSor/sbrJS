import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> someCollection = new java.util.ArrayList<>(List.of(new Person[]{
                new Person("Ярослав", 12),
                new Person("Антон", 25),
                new Person("Григорий", 40),
                new Person("Наталья", 13),
                new Person("Константин", 30)}));

        Person person = new Person("Валера",18);
        
        someCollection.add(new Person("Андрей",46));

        someCollection.stream()
                .forEach(p -> System.out.println(person.getName()));
        //Test
    }



}
