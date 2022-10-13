package blanco.adrian.bl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;


public class CL {



    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static CuentaCorriente agregarCuenta(String numeroCuenta, double saldo){
        CuentaCorriente cuenta = new CuentaCorriente(numeroCuenta,saldo);
        return cuenta;
    }


    ArrayList<Cliente> listaCuentas = new ArrayList<>();
    public static String agregarCliente(String nombreCompleto, String identificacion, String fechaNacimiento, String direccionHabitacion, ArrayList<CuentaCorriente> cuentas){

        Cliente cliente = new Cliente(nombreCompleto,identificacion,fechaNacimiento,direccionHabitacion, cuentas);
        listaClientes.add(cliente);
        return "El cliente " + cliente.getNombre() + ", fue agregado con exito!";

    }

    public static String verClientes(){
        String resultado = "";
        for (Cliente cliente : listaClientes) {
            resultado+="\tCliente: "+cliente.getNombre()+"\t Id: "+cliente.getIdentificacion()+"\tFecha de nacimiento: "+cliente.getFechaNacimiento()+"\tDireccion: "+cliente.getDireccionHabitacion()+ "\t Posee "+cliente.getCuentas().size()+" cuentas\n";
        }
        return resultado;
    }


}
//    //No pueden hacerse depósitos en negativo.
//
//    //No pueden hacerse retiros por un monto mayor al saldo de la cuenta.
//
//    // No pueden hacerse retiros ni depósitos igual a cero.
//
//    // El monto inicial del depósito no puede ser menor a 50 mil colones (pero puede
//    //ser superior).

