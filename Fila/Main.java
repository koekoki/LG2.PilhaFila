package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Jamilli");
        fila.adiciona("Kaiky");

        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
//        String x1 = fila.remove();
//
//        System.out.println(x1);
//        System.out.println(fila);

        Queue<String> filaDoJava = new LinkedList<String>();

        filaDoJava.add("Jamilli");
        String p1 = filaDoJava.poll();

        System.out.println(p1);
        System.out.println(filaDoJava);
    }
}
