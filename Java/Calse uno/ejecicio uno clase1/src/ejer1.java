public class ejer1 {
    public static void main(String[] args) {
        int numeroInicio=5;
        int numeroFin=14;

        // A Mostrar numeros
        while (numeroInicio <= numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio = numeroInicio +1;
        }
        numeroInicio = 5;

        // B Mostrar numeros pares
        for (int i = numeroInicio; i <= numeroFin; i++){
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }

        // C Mostrar impares c/ variables modificable
        boolean mostrarPares = false;

        for (int i = numeroInicio; i <= numeroFin; i++){
            if (i % 2 == 0 && mostrarPares) {
                System.out.println("Par: " + i);}
            else if (i%2 !=0 && !mostrarPares) {
                System.out.println("Impar: " + i);

            }
        }

        // D Invertir orden
        for (int i = numeroFin; i >= numeroInicio; i--){
            //System.out.println("Al reves: " + i); --- Muestra todos los numeros invertidos
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
                 }

         }

    }

}
