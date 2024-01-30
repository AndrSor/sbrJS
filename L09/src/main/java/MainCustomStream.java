import java.util.List;
import java.util.Map;

public class MainCustomStream {

    public static void main(String[] args) {

        List<Person> someCollection = new java.util.ArrayList<>(List.of(new Person[]{
                new Person("Ярослав", 12),
                new Person("Антон", 25),
                new Person("Григорий", 40),
                new Person("Наталья", 13),
                new Person("Константин", 30)}));

        Map m = Streams.of(someCollection)
                .filter(p -> p.getAge() > 20)
                //.transform( p -> new Person(p.geAge() + 30)))
                .toMap(p -> p.getName(), p -> p);

    }
}
