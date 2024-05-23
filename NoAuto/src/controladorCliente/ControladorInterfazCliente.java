package controladorCliente;

public interface ControladorInterfazCliente {
    void altaCliente(String nombre, String dni, int edad);
    void bajaCliente(int codigoCliente);
    String mostrarClientes();
}
