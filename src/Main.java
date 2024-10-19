
public class Main {
    public static void main(String[] args) {

        PersonaPrivada personaPrivada01 = new PersonaPrivada("Javier", 29, 1.62);
        personaPrivada01.mostrarDatos();
        System.out.println("Es mayor de edad " + personaPrivada01.esMayorDeEdad());


        PersonaPublica personaPublica01 = new PersonaPublica("Calle Guatemala", "654324", "abcd@gmail.com");
        System.out.println("Dirección: " + personaPublica01.direccion);
        System.out.println("Teléfono: " + personaPublica01.telefono);
        System.out.println("Email: " + personaPublica01.email);


        personaPublica01.probarMetodosPrivados();
    }
}