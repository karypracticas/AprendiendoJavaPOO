import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Instanciar clase model.Doctor
        /*model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Juan Perez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(model.Doctor.id);

        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();
        System.out.println(model.Doctor.id);*/

        //showMenu();

        Doctor myDoctor = new Doctor("Yiya","yiya@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        //Usando el método abstracto para Doctor
        User user = new Doctor("Karys Rguez", "mymail@gmail.com");
        user.showDataUser();

        //Usando el método abstracto para Paciente
        User userPatient = new Patient("Pedro perez", "paciente@gmail.com");
        userPatient.showDataUser();

        //Usando el método abstracto en un User y es una clase anonima
        //Solo será vigente para el lapso de tiempo en el que se está llamando el objeto user
        User user0 = new User("Carlos Fuentes","user@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento de Geriatría");
            }
        };
        user0.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        //ISchedulable iSchedulable1 = new AppointmentDoctor();

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

        //No va a asignar el #telefónico, por la regla de negocio en la clase model.Patient
        patient.setPhoneNumber("1245479839");
        System.out.println(patient.getPhoneNumber()); //null

    }
}
