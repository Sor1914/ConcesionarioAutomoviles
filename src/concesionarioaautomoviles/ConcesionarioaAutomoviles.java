package concesionarioaautomoviles;
import java.util.Scanner;
/**
 *
 * @author xXSorzXx
 */
public class ConcesionarioaAutomoviles {

    public static void main(String[] args) {
        //Se declaran variables para almacenar los precios
        float precioVehiculo, precioTransmision = 0, precioAros=0, precioExternos=0, precioInteriores=0, precioElectronicos=0, total = 0;
        int op;
       
        
        String opAmenidades = "s", transmision = "", pintura= "", tapiceria="", aros="", exteriores="", interiores="", electronicos="", totalS = "";
        
        Scanner in = new Scanner(System.in);
        //Variable Booleano para poder regresar al menú anterior
        boolean menuPrincipal = true, menuGama = true;
        
        while (menuPrincipal){
            menuGama = true;
            System.out.println("------------------------------------");
            System.out.println("       CONCESIONARIA DE AUTOS       ");
            System.out.println("          -MENU PRINCIPAL-          ");
            System.out.println("------------------------------------");
            System.out.println(" ");
            System.out.println("1.- Seleccionar Automóvil");
            System.out.println("2.- Salir");
            System.out.println(" ");
            System.out.print("Ingrese la opción que desea ejecutar: ");
            op = in.nextInt();
            clearConsole();
            //Se compara la opción seleccionada para cerrar el bucle o continuarlo
            switch (op){
                case 1:
                    while (menuGama){
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS       ");
                        System.out.println("  -SELECCION DE GAMA DE VEHICULO-   ");
                        System.out.println("------------------------------------");
                        System.out.println(" ");
                        System.out.println("01.- Sedán Económico");
                        System.out.println("02.- Sedán");
                        System.out.println("03.- Deportivo");
                        System.out.println("04.- Híbrido");
                        System.out.println("05.- Coupe");
                        System.out.println("06.- Coupe Deportivo");
                        System.out.println("07.- Compacto");
                        System.out.println("08.- Hatchback");
                        System.out.println("09.- Eonómico versión Rally");
                        System.out.println("10.- Regresar al menú principal");
                        System.out.println(" ");
                        System.out.print("Ingrese la gama de vehículo que desea: ");
                        op = in.nextInt();
                        clearConsole();
                        //Se muestran las opciones de vehículos según la selección
                        switch (op){
                            case 1:
                                retornoVehiculo("Sedán Económico", 18940f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos );
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 2:
                                retornoVehiculo("Sedán", 23570f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 3:
                                retornoVehiculo("Deportivo", 24100f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 4:
                                retornoVehiculo("Híbrido", 25100f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 5:
                                retornoVehiculo("Coupe", 19350f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 6:
                                retornoVehiculo("Coupe Deportivo", 24100f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 7:
                                retornoVehiculo("Compacto", 16190f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 8:
                                retornoVehiculo("Hatchback",20150f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos , totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                                
                            case 9:
                                retornoVehiculo("Económico Versión Rally", 34700f, in, total, transmision, pintura, tapiceria, aros, exteriores, interiores, electronicos, totalS, precioTransmision, precioAros, precioExternos, precioInteriores, precioElectronicos);
                                opAmenidades = in.next();
                                clearConsole();
                                break;
                            case 10:
                                menuGama = false;
                                break;
                            default: 
                                System.out.println("Opción no definida.");
                                break;
                        }
                    }
                break;
                
                case 2:
                    menuPrincipal = false; 
                break;
                default: 
                    System.out.println("Opción no definida.");
                    break;
            }            
        }
    }
    
    //Se manda a imprimir el menú
    public static void retornoVehiculo(String a, float precio, Scanner in, float total, String transmision, String pintura, String tapiceria, String aros, String exteriores, String interiores, String electronicos, String totalS, float precioTransmision, float precioAros, float precioExternos, float precioInteriores, float precioElectronicos){
        char opAmenidades;
        boolean tipoAmenidad = true;
        int op = 0;
        System.out.println("------------------------------------");
        System.out.println("       CONCESIONARIA DE AUTOS       ");
        System.out.println("  -SELECCION DE GAMA DE VEHICULO-   ");
        System.out.println("------------------------------------");
        System.out.println(" ");
        System.out.println("Ha seleccionado la gama " + a + "");
        System.out.println(" ");
        System.out.println("¿Desea agregar amenidades? s/n");
        opAmenidades = in.next().charAt(0); //se obtiene el primer carácter del String introducido por teclado       
        clearConsole();

        if (opAmenidades == 's'){ //Salida si el usuario desea ameniudades
            while (tipoAmenidad){    
                System.out.println("------------------------------------");
                System.out.println("       CONCESIONARIA DE AUTOS       ");
                System.out.println("      -SELECCION DE AMENIDADES-     ");
                System.out.println("------------------------------------");
                System.out.println(" ");
                System.out.println("Ha seleccionado la gama " + a + "");
                System.out.println(" ");
                System.out.println("TIPOS DE AMENIDADES:");
                System.out.println(" ");

                System.out.println("01.- Tipo de Transmisión");
                System.out.println("02.- Color de Pintura Exterior");
                System.out.println("03.- Tapicería");
                System.out.println("04.- Aros");
                System.out.println("05.- Accesorios Exteriores");
                System.out.println("06.- Accesorios Interiores");
                System.out.println("07.- Accesorios Electrónicos");
                System.out.println("08.- Regresar a la selección de gama de Vehículo ");
                op = in.nextInt();
                switch (op){
                    case 1:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS       ");
                        System.out.println("      -SELECCION DE AMENIDADES-     ");
                        System.out.println("     -SELECCION DE TRANSMISION-     ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- Manual               US$ 0.00");
                        System.out.println("02.- CVT                US$ 800.00");
                        System.out.println("03.- Manual con Turbo   US$   0.00");
                        System.out.println("04.- CVT con Turbo      US$ 800.00");
                        System.out.println("05.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                precioTransmision = 0f;
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos);
                            break;
                        case 2:
                                precioTransmision = 800f;
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "CVT", 800f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                precioTransmision = 0f;
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual con Turbo", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                precioTransmision = 800f;
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "CVT con Turbo", 800f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );                            
                            break;
                        case 5:
                                
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            }
                                    break;
                    case 2:                       
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS       ");
                        System.out.println("      -SELECCION DE AMENIDADES-     ");
                        System.out.println("     -Color de Pintura Exterior-    ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- Cosmic Blue          US$ 0.00");
                        System.out.println("02.- Burgundy Night       US$ 0.00");
                        System.out.println("03.- Rallye Red           US$ 0.00");
                        System.out.println("04.- Crystal Black        US$ 0.00");
                        System.out.println("05.- Modern Steel         US$ 0.00");
                        System.out.println("06.- Taffeta White        US$ 0.00");
                        System.out.println("07.- Energy Green         US$ 0.00");
                        System.out.println("08.- Kona Coffee          US$ 0.00");
                        System.out.println("09.- Orange Fury          US$ 0.00");
                        System.out.println("10.- Helios Yellow        US$ 0.00");
                        System.out.println("11.- Sonic Gray           US$ 0.00");
                        System.out.println("12.- Polished Metal       US$ 0.00");
                        System.out.println("13.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                pintura = "Cosmic Blue.........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                pintura = "Burgundy Nigh.......................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                pintura = "Rallye Red..........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                pintura = "Crystal Black.......................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 5:
                                pintura = "Modern Steel .......................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 6:
                                pintura = "Taffeta White.......................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 7:
                                pintura = "Energy Green........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 8:
                                pintura = "Kona Coffee.........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 9:
                                pintura = "Orange Fury.........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos  );
                            break;
                        case 10:
                                pintura = "Helios Yellow........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 11:
                                pintura = "Sonic Gray...........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 12:
                                pintura = "Polished Metal.......................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura,tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  13: 
                            //regresar
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            }
                                    break;
                    case 3:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS       ");
                        System.out.println("      -SELECCION DE AMENIDADES-     ");
                        System.out.println("        -Color de Tapicería-        ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- Gray Cloth                         US$ 0.00");
                        System.out.println("02.- Black Cloth                        US$ 0.00");
                        System.out.println("03.- Black/Gray Cloth                   US$ 0.00");
                        System.out.println("04.- Red/Black Suede Effect-Fabric      US$ 0.00");
                        System.out.println("05.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                tapiceria = "Gray Cloth .........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                tapiceria = "Black Cloth..........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                tapiceria = "Black/Gray Cloth.....................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                tapiceria = "Red/Black Suede Effect-Fabric........................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  5: 
                            //regresar
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            }

                                    break;
                    case 4:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS        ");
                        System.out.println("      -SELECCION DE AMENIDADES-      ");
                        System.out.println("               -Aros-                ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- 15                                 US$    0.00");
                        System.out.println("02.- 16                                 US$    0.00");
                        System.out.println("03.- 17                                 US$ 1688.00");
                        System.out.println("04.- 18                                 US$ 1700.00");
                        System.out.println("05.- 19                                 US$ 3011.00");
                        System.out.println("06.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                precioAros= 0f;
                                aros = "15 ........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                precioAros= 0f;
                                aros = "16.........................................................................US$ 0.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                precioAros= 1688f;
                                aros = "17.........................................................................US$ 1688.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                precioAros= 1700f;
                                aros = "18.........................................................................US$ 1700.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  5: 
                                precioAros= 3011f;
                                aros = "18.........................................................................US$ 3011.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  6: 
                            //No hacer nada
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            }
                                    break;
                    case 5:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS        ");
                        System.out.println("      -SELECCION DE AMENIDADES-      ");
                        System.out.println("      -Accesorios Exteriores-        ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- BODY SIDE MOLDING                  US$  217.00");
                        System.out.println("02.- CAR COVER                          US$  230.00");
                        System.out.println("03.- DECKLID SPOILER                    US$  299.00");
                        System.out.println("04.- DOOR EDGE FIELD                    US$   42.00");
                        System.out.println("05.- DOOR EDGE GUARDS                   US$   84.00");
                        System.out.println("06.- DOOR TRIM CHROME                   US$  285.00");
                        System.out.println("07.- DOOR VISOR                         US$  185.00");
                        System.out.println("08.- FRONT FENDER EMBLEMS               US$   50.00");
                        System.out.println("09.- REAR BUMPER APPLIQUE               US$   70.00");
                        System.out.println("10.- FOG LIGHTS                         US$  325.00");
                        System.out.println("11.- NOSE MASCS                         US$  158.00");
                        System.out.println("12.- MOONROF VISOR                      US$  138.00");
                        System.out.println("13.- SPLASH GUARD SET                   US$  104.00");
                        System.out.println("14.- DUST COVER                         US$  350.00");
                        System.out.println("15.- DOOR MIRROR COVER - CARBON FIBER   US$  520.00");
                        System.out.println("16.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                precioExternos= 217f;
                                exteriores = "BODY SIDE MOLDING............................................................US$ 217.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                precioExternos= 230f;
                                exteriores = "CAR COVER....................................................................US$ 230.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                precioExternos= 299.99f;
                                exteriores = "Decklid Spoiler..............................................................US$ 299.99";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                precioExternos= 42f;
                                exteriores = "Door Edge Film...............................................................US$ 42.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  5: 
                                precioExternos= 84f;
                                exteriores = "Door Edge Guards.............................................................US$ 84.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  6: 
                                precioExternos= 285f;
                                exteriores = "Door Trim Chrome.............................................................US$ 285.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;                       
                        case 7:
                                precioExternos= 185f;
                                exteriores = "Door Visor...................................................................US$ 185.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  8: 
                                precioExternos= 50f;
                                exteriores = "Front Fender Emblems.........................................................US$ 50.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 9:
                                precioExternos= 70f;
                                exteriores = "Rear Bumper Applique.........................................................US$ 70.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 10:
                                precioExternos= 325f;
                                exteriores = "Fog Lights.................................................................US$ 325.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 11:
                                precioExternos= 158f; 
                                exteriores = "Nose Mascs.................................................................US$ 158.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 12:
                                precioExternos= 138f;
                                exteriores = "Moonrof Visor..............................................................US$ 138.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  13: 
                                precioExternos= 104f;
                                exteriores = "Splash Guard Set...........................................................US$ 104.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  14: 
                                precioExternos= 350f;
                                exteriores = "Dust Cover.................................................................US$ 350.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );                            
                            break;
                        case 15:
                                precioExternos= 520f;
                                exteriores = "Door Mirror Cover..........................................................US$ 520.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 16: 
                            //No hacer nada
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            }                        

                                    break;
                    case 6:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS        ");
                        System.out.println("      -SELECCION DE AMENIDADES-      ");
                        System.out.println("      -Accesorios Interiores-        ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- All-Season Floor Mats              US$  142.00");
                        System.out.println("02.- Automatic-Dimming Mirror           US$  219.00");
                        System.out.println("03.- Cargo Hook                         US$   12.00");
                        System.out.println("04.- Cargo Net                          US$   49.00");
                        System.out.println("05.- Console Illumination               US$  250.00");
                        System.out.println("06.- Cargo Organizer                    US$   87.00");
                        System.out.println("07.- Door Panel Protector               US$  149.00");
                        System.out.println("08.- Armrest Compartiment               US$  337.00");
                        System.out.println("09.- Door Sill Trim - illuminated       US$  290.00");
                        System.out.println("10.- Cargo Cover                        US$  166.00");
                        System.out.println("11.- Cargo Liner                        US$  187.00");
                        System.out.println("12.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                precioInteriores= 142f;
                                interiores = "All-Season Floor Mats...................................................US$ 142.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                precioInteriores= 219f;
                                interiores = "Automatic-Dimming Mirror................................................US$ 219.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                precioInteriores= 12f;
                                interiores = "cargo hook..............................................................US$  12.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                precioInteriores= 49f;
                                interiores = "Cargo Net...............................................................US$  49.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  5: 
                                precioInteriores= 250f;
                                interiores = "Console Ilumination.....................................................US$ 250.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  6: 
                                precioInteriores= 87f;
                                interiores = "Cargo Organizer.........................................................US$  87.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;                       
                        case 7:
                                precioInteriores= 149f;
                                interiores = "Door Panel Protector....................................................US$ 149.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  8: 
                                precioInteriores= 337f;
                                interiores = "Armrest Compartiment....................................................US$ 337.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 9:
                                precioInteriores= 290f;
                                interiores = "Door Sill Trim - Illuminated............................................US$ 290.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 10:
                                precioInteriores= 166f;
                                interiores = "Cargo Cover.............................................................US$ 166.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 11:
                                precioInteriores= 187f;
                                interiores = "Cargo Liner.............................................................US$ 187.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 12: 
                            //No hacer nada
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                            } 
                                    break;
                    case 7:
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS        ");
                        System.out.println("      -SELECCION DE AMENIDADES-      ");
                        System.out.println("      -Accesorios Interiores-        ");
                        System.out.println("------------------------------------");
                        System.out.println("01.- Wireless Phone Charguer            US$  305.00");
                        System.out.println("02.- usb Charger - 2.1 Amp.             US$  120.00");
                        System.out.println("03.- Puddle Light                       US$  185.00");
                        System.out.println("04.- Parking Sensors                    US$  514.00");
                        System.out.println("05.- Regresar al menú de Amenidades");
                        op = in.nextInt();
                        switch (op){
                             case 1:
                                precioElectronicos = 305f;
                                electronicos = "Wireles Phone Charguer..................................................US$ 305.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 2:
                                precioElectronicos = 120f;
                                electronicos = "USB Charger - 2.1 AMP...................................................US$ 120.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 3:
                                precioElectronicos = 185f;
                                electronicos = "Puddie Light............................................................US$ 185.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 4:
                                precioElectronicos = 514f;
                                electronicos = "Parking Sensors.........................................................US$ 514.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  5: 
                                precioInteriores= 250f;
                                interiores = "Console Ilumination.....................................................US$ 250.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  6: 
                                precioInteriores= 87f;
                                interiores = "Cargo Organizer.........................................................US$  87.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;                       
                        case 7:
                                precioInteriores= 149f;
                                interiores = "Door Panel Protector....................................................US$ 149.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case  8: 
                                precioInteriores= 337f;
                                interiores = "Armrest Compartiment....................................................US$ 337.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 9:
                                precioInteriores= 290f;
                                interiores = "Door Sill Trim - Illuminated............................................US$ 290.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 10:
                                precioInteriores= 166f;
                                interiores = "Cargo Cover.............................................................US$ 166.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 11:
                                precioInteriores= 187f;
                                interiores = "Cargo Liner.............................................................US$ 187.00";
                                Amenidades(a, precio, transmision,total, opAmenidades, in, "Manual", 0f, pintura, tapiceria, aros, exteriores, interiores, electronicos, precioAros, precioExternos, precioInteriores, precioElectronicos );
                            break;
                        case 12: 
                            //No hacer nada
                            break;
                        default:
                            System.out.println("Esta opción no está definida.");
                            break;
                        }
                                    break;
                    case 8:
                                      
                         tipoAmenidad = false; 
                                    break;
                                                     
                            }
                        }
                               
                                  
                    } else { //Salida si el usuario no desea amenidades
                        System.out.println("------------------------------------");
                        System.out.println("       CONCESIONARIA DE AUTOS       ");
                        System.out.println("  -       VENTA DE VEHICULO     -   ");
                        System.out.println("------------------------------------");
                        System.out.println(" ");

                        System.out.println("Gama seleccionada: " + a);
                        System.out.println("........................................................................." + "US$ " + precio);

                        System.out.println("Amenidades: Ninguna");
                        System.out.println("Total:.................."  );
                        System.out.println("........................................................................." + "US$ " + precio);                        
                        in.next();
                        clearConsole();

                    }
}
    
 public static void Amenidades(String a, float precio, String transmision, float total, char opAmenidades, Scanner in, String tipoTransmision, float precioTransmision, String Pintura,String tapiceria, String aros, String exteriores, String interiores, String electronicos, float precioAros, float precioExternos, float precioInteriores, float precioElectronicos){
    System.out.println("------------------------------------");
    System.out.println("       CONCESIONARIA DE AUTOS       ");
    System.out.println("       -RESUMEN DE AMENIDADES-      ");
    System.out.println("     -SELECCION DE TRANSMISION-     ");
    System.out.println("------------------------------------");
    
    System.out.println("Gama seleccionada: " + a);
    System.out.println(".........................................................................US$ " + precio);
    //se almacena en una variable el valor de transmisión para luego poder llamarlo con SOUT
    transmision = tipoTransmision + ".........................................................................US$ " + precioTransmision ;
    
    total = precio + precioTransmision + precioAros + precioElectronicos + precioExternos + precioInteriores;
     System.out.println("TRANSMISION");
    System.out.println(transmision);
    System.out.println("PINTURA");
    System.out.println(Pintura);
    System.out.println("TAPICERIA");
    System.out.println(tapiceria);
    System.out.println("AROS");
    System.out.println(aros);
    System.out.println("EXTERIORES");
    System.out.println(exteriores);
    System.out.println("INTERIORES");
    System.out.println(interiores);   
    System.out.println("Electrónicos");
    System.out.println(electronicos); 
    
    System.out.println("");
    System.out.println("Total:.................................................................. US$ " + total);
    System.out.println("¿Desea agregar otra amenidad? s/n");
    opAmenidades = in.next().charAt(0); //se obtiene el primer carácter del String introducido por teclado       
    if (opAmenidades != 's') {
        System.exit(0);
    }
}   
    //Clase que permite limpiar la pantalla dependiendo del sistema operativo en la línea de consola
    public final static void clearConsole()
{
    try
    {
        final String os = System.getProperty("os.name");
        //para Windows
        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        //para linux y Mac OS
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    //Retener Excepciones.
    catch (final Exception e)
    {
        //Excepciones
    }
}
    
    
    
}
