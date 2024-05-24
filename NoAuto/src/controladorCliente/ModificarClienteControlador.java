package controladorCliente;

import noAuto.modelo.Cliente;
import noAuto.principal.API;

public class ModificarClienteControlador implements modificarClienteInterfaz {

    public void modificarCliente(int codigo, String nombre, String dni, int edad, int dinero) {
        System.out.println("Llamando al controlador de modificar de Cliente");
        API api = API.getInstancia();
        api.modificarCliente(codigo, nombre, dni, dinero, dinero);
    
    }
}
