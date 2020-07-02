import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

//Modelo o Plantilla
public class Doctor extends User {

    //Atributo especial
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Sobrecarga de método constructor
    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    //Colección de objetos
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
    availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    //Devolver el arreglo que es la lista completa de citas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }



    //Clase anidada
    public static class  AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        //Método constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
