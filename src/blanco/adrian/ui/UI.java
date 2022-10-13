package blanco.adrian.ui;


import blanco.adrian.bl.CL;
import blanco.adrian.bl.Cliente;
import blanco.adrian.bl.CuentaCorriente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static blanco.adrian.bl.CL.verClientes;


public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        desplegarMenu();
    }
    public static void desplegarMenu() throws IOException{
        int opcion = -1;
        do{

            System.out.println("**** Sistema bancario Los Lavadores.com****");
            System.out.println("Por favor digite:");
            System.out.println("1. Para agregar un cliente nuevo ");
            System.out.println("2. Para listar clientes");
            System.out.println("3. Para crear cuenta corriente");
            System.out.println("4. Para realizar deposito");
            System.out.println("5. Para realizar retiro");
            System.out.println("6. Para mostrar el saldo de una cuenta");
            System.out.println("7. Para salir del menu");
            System.out.println("Digite su opcion: ");
            opcion = Integer.parseInt(in.readLine());


            switch (opcion){
                case 1:
                    registrarClientes();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    crearCuenta();
                    break;
                case 4:
                    realizarDeposito();
                    break;
                case 5:
                    retiroDinero();
                    break;
                case 6:
                    mostrarSaldo();
                    break;
                default:
                    System.out.println("****************************\n");
                    System.out.println("Gracias por utilizar el sistema\n");
                    System.out.println("****************************");
            }
        }
        while(opcion != 7);
    }

    public static void registrarClientes() throws IOException{

        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
        String numeroCuenta = "cuentaVacia";
        double saldo;
        double primerDeposito = 1;

        System.out.println("Ingrese el nombre completo: ");
        String nombreCompleto = in.readLine();
        System.out.println("Ingrese el numero de identificacion: ");
        String identificacion = in.readLine();
        System.out.println("Ingrese la fecha de nacimiento en el siguiente formato dd/mm/aaaa : ");
        String fechaNacimiento = in.readLine();
        System.out.println("Ingrese la direccion de habitacion: ");
        String direccionHabitacion = in.readLine();
        System.out.println("Por favor digite la cantidad de cuentas a registrar: ");
        int cantidadCuentas = Integer.parseInt(in.readLine());
        for (int i = 0; i < cantidadCuentas; i++) {
        System.out.println("Por favor digite los datos de la cuenta " + (i+1));
        System.out.println("Digite el numero de cuenta: ");

        do{
            System.out.println("El numero de cuenta debe ser de 7 digitos");
            numeroCuenta = in.readLine();
            if(numeroCuenta.length()!=7){
                System.out.println("\n***** ERROR *****\n");
            }
        }while (numeroCuenta.length()!=7);

        System.out.println("Digite el monto del primer depósito: ");

        do{
            System.out.println("El primer deposito debe ser mayor a 50.000 colones");
            primerDeposito = Double.parseDouble(in.readLine());
            if(primerDeposito<50000){
                System.out.println("\n***** ERROR *****\n");
            }
        }while (primerDeposito < 50000);

        cuentas.add(CL.agregarCuenta(numeroCuenta,primerDeposito));
        }


        String resultado = CL.agregarCliente(nombreCompleto,identificacion,fechaNacimiento,direccionHabitacion, cuentas);
        System.out.println(resultado);

    }

    public static void listarClientes() throws IOException{
        System.out.println("\n*****************\n");
        System.out.println(verClientes());
        System.out.println("\n*****************\n");
    }


    public static void  buscarCliente() throws IOException{
        for (int i = 0; i < CL.getListaClientes().size(); i++) {

        }
    }
    public static void crearCuenta() throws IOException{
        System.out.println("Perdon, no me dio tiempo de terminar el feature, quede en hacer la forma de buscar el cliente\n");
    }

    public static void realizarDeposito() throws IOException{
        System.out.println("Perdon, no me dio tiempo de terminar el feature\n");
    }

    public static void retiroDinero() throws IOException{
        System.out.println("Perdon, no me dio tiempo de terminar el feature\n");
    }

    public static void mostrarSaldo() throws IOException{
        System.out.println("Perdon, no me dio tiempo de terminar el feature\n");
    }


}
