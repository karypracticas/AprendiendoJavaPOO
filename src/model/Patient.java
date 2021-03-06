package model;

public class Patient extends User {
    //Encapsular con la palabra reservada "private"
    //Atributos especiales
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor
    public Patient(String name, String email){
        //Hace referencia al método constructos de la Súper Clase, en este caso model.User
        super(name, email);
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

   @Override
   //Sobrescribe el método toString de la clase model.User que previamente ya estaba sobrescrito de la clase Object
    public String toString() {
      return  super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() +  "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde naciemiento");
    }

}
