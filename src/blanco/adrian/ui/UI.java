package blanco.adrian.ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
                    System.out.println("Digite una opcion valida\n");
                    System.out.println("****************************");
            }
        }
        while(opcion != 7);
    }

    public static void registrarClientes() throws IOException{
        System.out.println("Ingrese el nombre completo: ");
        String nombreCompleto = in.readLine();
        System.out.println("Ingrese el numero de identificacion: ");
        String identificacion = in.readLine();
        System.out.println("Ingrese la fecha de nacimiento en el siguiente formato dd/mm/aaaa : ");
        String fechaNacimiento = in.readLine();
        System.out.println("Ingrese la direccion de habitacion: ");
        String direccionHabitacion = in.readLine();


    }

    public static void listarClientes() throws IOException{
        System.out.println("listando clientes papu\n");
    }

    public static void crearCuenta() throws IOException{
        System.out.println("crear cuentas papu\n");
    }

    public static void realizarDeposito() throws IOException{
        System.out.println("realizando depositos papu\n");
    }

    public static void retiroDinero() throws IOException{
        System.out.println("retirando dinero papu papu\n");
    }

    public static void mostrarSaldo() throws IOException{
        System.out.println("mostrando saldos papu\n");
    }


}
