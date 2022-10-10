package blanco.adrian.bl;
import java.util.ArrayList;

public class Cliente {

    private String nombre;

    private String identificacion;

    private String fechaNacimiento;

    // Edad? se calcula desde la fecha de nacimiento o se pregunta?

    private String direccionHabitacion;

    private ArrayList<CuentaCorriente> cuentas;

    public Cliente(String nombre, String identificacion, String fechaNacimiento, String direccionHabitacion, ArrayList<CuentaCorriente> cuentas) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionHabitacion = direccionHabitacion;
        this.cuentas = cuentas;
    }
    //agregar cuenta al array
    public void agregarCuenta(){
        this.cuentas.add(new CuentaCorriente());
    }

    public void deposito(){

    }
    public void retiro(){

    }

    public double consultarSaldo(){

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccionHabitacion='" + direccionHabitacion + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccionHabitacion() {
        return direccionHabitacion;
    }

    public void setDireccionHabitacion(String direccionHabitacion) {
        this.direccionHabitacion = direccionHabitacion;
    }

    public ArrayList<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaCorriente> cuentas) {
        this.cuentas = cuentas;
    }


}