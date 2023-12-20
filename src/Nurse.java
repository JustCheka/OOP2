public class Nurse extends  Doctor{
    public Nurse(String name, String jobTitle, int experience) {
        super(name, jobTitle, experience);
    }

    public void doVaccination(Animal animal){
        if (animal.vaccinated){
            System.out.println("Животное не нуждается в прививке");
        }
        else {
            animal.vaccinated = true;
            System.out.println("Вы сделали прививку животному");
        }
    }
}
