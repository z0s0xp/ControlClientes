
package dominio;

/**
 *
 * @author z0s0xp
 */
public class Cliente {
    
    private int IdCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private double saldo;
    
    public Cliente(){
    }

    public Cliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    
    public Cliente(String nombre, String apellido, String email, String telefono, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Cliente(int IdCliente, String nombre, String apellido, String email, String telefono, double saldo) {
        this.IdCliente = IdCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    
    
    
    
    
    
}
