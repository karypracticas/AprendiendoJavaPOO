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

    //En el método Set y get, se están agregando las reglas de negocio es decir la validaciones

    //Método SET
    public void setWeight(double weight){
        this.weight = weight;
    }

    //Método GET
    public String getWeight(){
        return this.weight + " Kg.";
    }

    //Ctrl + n -> Despliega menú para crear automáticamente los métodos

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefónico debe ser máximo 8 dígitos");
        }else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
