import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {

        //DECLARACION DE VARIABLES A USAR
        int integrantes = 0;
        float aporte = 0;
        float ingresosTotal = 0;
        int vehiculo = 4;
        int anos = 0;
        int autoLujo = 0;

        float indiceCB = 139738;

        boolean lujo = false;
        boolean avion = false;
        boolean barco = false;
        boolean parSoc = false;

        //Pregunta por articulos de lujo
        if (avion==true||barco==true||parSoc == true) {
            lujo=true;

        // Verificacion de vehiculos
        if (vehiculo >= 3) {
          for (int i = 0; i == vehiculo; i++) {
            Scanner kBImput = new Scanner(System.in);
            System.out.println("Ingrese la antigüedad del vehiculo en años");
            anos = kBImput.nextInt();

             if (anos <= 5) {
             autoLujo = autoLujo + 1;
             anos = 0;
                    }
                }
                if (autoLujo == 3) {
                    lujo = true;
                }
            }
        }


        //DETERMINANTE DE CATEGORIA
        if (lujo==true) {
            System.out.println("Usted percibe grandes ingresos");
         } else {System.out.println("Usted persibe ingresos modicos");}
    }
}


