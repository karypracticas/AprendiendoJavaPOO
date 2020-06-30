import javax.print.Doc;

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
}
