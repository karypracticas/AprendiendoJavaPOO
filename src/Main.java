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
    }
}
