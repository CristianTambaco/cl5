public class PersonaPublica {

    //Atributos
    public String direccion;
    public String telefono;
    public String email;


    //metodo constructor

    //con parametros
    public PersonaPublica(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }


    private void cambiarDireccion(String NuevaDireccion) {
        this.direccion = NuevaDireccion;
    }


    //metodo vacío propio(imprimir), no devuelve nada
    private void mostrarTelefono() {
        System.out.println("Teléfono: " + telefono);
    }

    public void probarMetodosPrivados() {
        cambiarDireccion("Nueva Direccion");
        System.out.println("Dirección actualizada a: " + direccion);
        mostrarTelefono();
    }
}