import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, penguin, duck, new Fish("Pepe", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());

        System.out.println("--------------------------");

        System.out.println(clinic.getSwimable());
        System.out.println(clinic.getFlyble());

        // комментарии исключительно в рамках практики
        Nurse nurse = new Nurse("Мария", "Младшая медсестра", 1);
        nurse.printInformation(); // информация о медсестре
        nurse.addPatient(duck); // делаем утку пациентом медсестры
        nurse.addPatient(barsik); // делаем барсика пациентом медсестры
        nurse.printPatiens(); // показываем пациентов, которых должна вылечить медсестра
        barsik.informationAboutVaccination(); // животное не привито
        nurse.doVaccination(barsik); // Вы сделали прививку животному
        barsik.informationAboutVaccination(); // Животное привито
        nurse.doVaccination(barsik);// Животное не нуждается в прививке

    }
}