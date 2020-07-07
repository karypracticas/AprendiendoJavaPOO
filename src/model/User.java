package model;

//Súper Clase
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Método constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
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

    @Override
    //Método extraído de la clase Padre es decir de la clase Object en este caso
    public String toString() {
        return "model.User: " + name + ",Email: " + email + "\nAdress: " + address + ". Phone: " + phoneNumber;
    }

    //Método abstracto
    public abstract void showDataUser();
}
