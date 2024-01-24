import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> someCollection = List.of(new Person[]{
                new Person("Ярослав", 12),
                new Person("Антон", 25),
                new Person("Григорий", 40),
                new Person("Наталья", 13),
                new Person("Константин", 30)});

        for(Person p:someCollection) {
            System.out.println(p.getName() + ": " + p.getAge());
        }

        System.out.println();

        Map<String,Integer> mapPerson =
                someCollection
                        .stream()
                        .collect(Collectors.toMap(value->value.getName(),value->value.getAge()));
        System.out.println(mapPerson);

        System.out.println();
                //List<Person> newCollection =
                someCollection
                        .stream()
                        .filter(person -> person.getAge() > 20)
                        .forEach(p -> System.out.println(p.getName() + ": " + p.getAge()));






    }




}
