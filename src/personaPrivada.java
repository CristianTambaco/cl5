
public class personaPrivada {

    //Atributos
    String nombre;
    int edad;
    double altura;


    //metodo constructor

    public personaPrivada(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;

    }

    public void datos() {
        System.out.println("El nombre: " + nombre +
                ", edad: " + edad +
                " altura " + altura);


    }





}