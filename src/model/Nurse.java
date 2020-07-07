package model;

public class Nurse extends User {
    private String speciality;

    //Método constructor
    public Nurse(String name, String email) {
        super(name, email);

    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: SSE");
        System.out.println("Departamento: Nutrición, Pediatría");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
