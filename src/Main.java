import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Vehiculo> lstVehiculo = new ArrayList<>();

        int opc;
        do{
        System.out.println("""
                1)Agregar un vehiculo
                2)Mostrar Informacion
                3)Salir
                ------Digite su opcion: -----
                """);
        opc = teclado.nextInt();

        switch (opc){
            case 1 ->{
                int opcion;
                System.out.println("""
                        1)Auto
                        2)Vehiculo
                        Digite su opcion:
                        
                        """);
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1 ->{
                        String marca;
                        String modelo;
                        int año;
                        int numPuertas;
                        double precioBase;
                        System.out.println("Escriba la marca del auto: ");
                        marca = teclado.next();
                        System.out.println("Escriba el modelo del vehiculo: ");
                        modelo = teclado.next();
                        System.out.println("Escriba el año del auto: ");
                        año = teclado.nextInt();
                        System.out.println("Escriba el numero de puertas del auto");
                        numPuertas = teclado.nextInt();
                        System.out.println("Escriba el precio base del vehiculo");
                        precioBase = teclado.nextDouble();
                        lstVehiculo.add(new Autos(marca,modelo,año,precioBase,numPuertas));

                    }
                    case 2 ->{
                        String marca;
                        String modelo;
                        int año;
                        double cilindraje;
                        double precioBase;
                        System.out.println("Escriba la marca de la motocicleta: ");
                        marca = teclado.next();
                        System.out.println("Escriba el modelo de la motocicleta: ");
                        modelo = teclado.next();
                        System.out.println("Escriba el año de la motocicleta: ");
                        año = teclado.nextInt();
                        System.out.println("Escriba el cilindraje de la motocicleta");
                        cilindraje = teclado.nextInt();
                        System.out.println("Escriba el precio base de la motocicleta");
                        precioBase = teclado.nextDouble();
                        lstVehiculo.add(new Motocicletas(marca,modelo,año,precioBase,cilindraje));

                    }
                }
            }

            case 2 ->{
                int opcion;
                System.out.println("""
                            1)Informacion de autos
                            2)Informacion de motocicletas
                            Digite su opcion:
                            
                            """);
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1 ->{
                        for(Vehiculo u : lstVehiculo){
                            if(u instanceof Autos){
                                System.out.println(u);
                            }

                        }
                        System.out.println("--------");
                        for(int i=0;i<lstVehiculo.size();i++){
                            lstVehiculo.get(i).calcularPrecioFinal();

                        }
                    }
                    case 2 ->{
                        for(Vehiculo u : lstVehiculo){
                            if(u instanceof Motocicletas){
                                System.out.println(u);
                            }
                        }
                        for(int i=0;i<lstVehiculo.size();i++){
                            lstVehiculo.get(i).calcularPrecioFinal();

                        }
                    }


                }

            }
        }
        }while(opc !=3);



    }
}