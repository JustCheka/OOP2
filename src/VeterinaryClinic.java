import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public void addDoctors(Doctor ... doctor){
        Collections.addAll(doctors, doctor);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }
    public List<Flyble> getFlyble(){
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if (animal instanceof Flyble){
                result.add((Flyble) animal);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
    public List<Doctor> getDoctors(){
        return doctors;
    }
}
