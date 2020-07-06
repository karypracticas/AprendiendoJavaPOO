import javax.print.Doc;

import java.util.Date;

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

        Doctor myDoctor = new Doctor("Yiya","yiya@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        //Imprimir citas
        System.out.println(myDoctor.getAvailableAppointments());

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Ale","ale@mail.com");
        System.out.println(patient);
        patient.setWeight(62);
        System.out.println(patient.getWeight());

        //No va a asignar el #telefónico, por la regla de negocio en la clase Patient
        patient.setPhoneNumber("1245479839");
        System.out.println(patient.getPhoneNumber()); //null

    }
}
