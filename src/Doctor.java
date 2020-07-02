import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

//Modelo o Plantilla
public class Doctor {
    //Propiedades
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Método Constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    //Sobrecarga de método constructor
    Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Método
    public void showName() {
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor:" + id);
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
