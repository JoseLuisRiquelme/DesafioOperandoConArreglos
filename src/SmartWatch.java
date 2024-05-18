import java.util.Scanner;

public class SmartWatch {

    public static int[] clearSteps(int[]pasos){
        int i,j;
        for(i=j=0; i<pasos.length;i++)
            if(pasos[i]>=200 && pasos[i]<=100000) j++;
        int[] pasosFiltrados= new int[j];
        for(i=j=0; i<pasos.length;i++)
            if(pasos[i]>=200 && pasos[i]<=100000) pasosFiltrados[j++]=pasos[i];
        return pasosFiltrados;

    }
    public static double promedio(int[] pasosFiltrados) {
        int suma = 0;
        for (int paso : pasosFiltrados) {
            suma += paso;
        }
        return (double) suma / pasosFiltrados.length;
    }


    public static void main(String[] args) {
        int[] pasos = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            pasos[i] = Integer.parseInt(args[i]);

        }
        int[] filtrados=clearSteps(pasos);
        double resultado = promedio(filtrados);
        System.out.println("=============PROMEDIO PASOS FILTRADOS=============");
        System.out.printf("El promedio de los pasos filtrados es el siguiente: %.2f pasos",resultado);

    }
}
