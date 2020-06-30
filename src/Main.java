import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //Instanciar clase Doctor
        /*Doctor myDoctor = new Doctor();
        myDoctor.name = "Juan Perez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);*/

        //showMenu();

        Doctor myDoctor = new Doctor("Yiya","Otorrino");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Ale","ale@mail.com");
        patient.setWeight(62);
        System.out.println(patient.getWeight());

        //No va a asignar el #telefónico, por la regla de negocio en la clase Patient
        patient.setPhoneNumber("1245479839");
        System.out.println(patient.getPhoneNumber()); //null
    }
}
