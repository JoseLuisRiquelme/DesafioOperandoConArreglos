public class Visitas {
    public static double promedio(int[] visitas) {
        int suma = 0;
        for (int visita : visitas) {
            suma += visita;
        }
        return (double) suma / visitas.length;
    }
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Por favor, ingrese las visitas diarias como argumentos.");
            return;
        }

        int[] visitas = new int[args.length];
        for (int i = 0; i < args.length; i++) {

                visitas[i] = Integer.parseInt(args[i]);

        }

        double resultado = promedio(visitas);
        System.out.println("==================VISITAS==================");
        System.out.printf("Para la entrada anterior el resultado es %d",(int) Math.round(resultado));


    }

}