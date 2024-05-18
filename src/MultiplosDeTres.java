public class MultiplosDeTres {

    public static int[] filtrarMultiplos3(int[]multiplos){
        int i,j;
        for(i=j=0; i<multiplos.length;i++)
            if(multiplos[i]%3==0) j++;
        int[] multiplosDe3= new int[j];
        for(i=j=0; i<multiplos.length;i++)
            if(multiplos[i]%3==0) multiplosDe3[j++]=multiplos[i];
        return multiplosDe3;

    }

    public static int suma(int[] multiplosDe3){
        int acumulador=0;
        for(int multiplo : multiplosDe3){
            acumulador+=multiplo;
        }
        return acumulador;
    }
    public static double promedio(int[] multiplosFiltrados) {
        int suma = 0;
        for (int filtrado : multiplosFiltrados) {
            suma += filtrado;
        }
        return (double) suma / multiplosFiltrados.length;
    }
    public static void main(String[] args) {
        int[] multiplos = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            multiplos[i] = Integer.parseInt(args[i]);
        }
        int[] multiplosFiltrados=filtrarMultiplos3(multiplos);
        int resultado= suma(multiplosFiltrados);
        System.out.println("++++++++++SUMA+++++++++");
        System.out.printf("La suma de los multiplos de 3 proporcionados es la siguiente: %d",resultado);
        System.out.println();
        System.out.println("========PROMEDIO=======");
        double promedio = promedio(multiplosFiltrados);
        System.out.printf("El promedio de los multiplos de 3 proporcionados es el siguiente: %.2f",promedio);

    }
}
