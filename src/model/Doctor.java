package model;

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
    public Doctor(String name, String email){
        super(name, email);
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

    @Override
    /*Sobrescribir el método toString a nivel de clase model.Doctor, trayendo el comportamiento de la clase model.User con la palabra super, también hacemos uso de la clase anidada
    con el fin de no repetir código y aplicar polimorfismo.
    * */
    public String toString() {
        return  super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Otorrinolaring");
    }

    //Clase anidada
    public static class  AvailableAppointment {
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

        @Override
        //Sobrescribir el método toString a nivel de clase anidada
        public String toString() {
            return "Available apointments \nDate " + date + "\nTime: " + time ;
        }
    }





}
