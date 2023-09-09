import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.dateOfBirth = "22/08/2011";
        person.name = "Amoo Arad";
        person.nationality = "Iranian";
        person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };
        person.seatNumber = 5;
        System.out.println("\n" + person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber + "\n");

    }
}
