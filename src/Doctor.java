import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String jobTitle;
    private int experience;
    private List<Animal> patients = new ArrayList<>();

    public Doctor (String name, String jobTitle, int experience){
        this.name = name;
        this.jobTitle = jobTitle;
        this.experience = experience;
    }

    public void printInformation(){
        System.out.println("имя: " + name + "; Должность: " + jobTitle + "; Опыт работы: " + experience);
    }

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void printPatiens(){
        System.out.print("Животные прикрепленные к доктору " + name + ": ");
        for(Animal animal:patients){
            System.out.print(animal.name + " ");
        }
        System.out.println();
    }

}
