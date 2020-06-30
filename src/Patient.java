public class Patient {
    //Propiedades
    int id;
    //Encapsular con la palabra reservada "private"
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }
}
