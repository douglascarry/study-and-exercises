package Biblioteca;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(25);
        numeros.add(48);
        numeros.add(12);
        numeros.add(79);

        boolean contemNumero15 = numeros.contains(34);
        System.out.println("Contem o numero 34? " + contemNumero15);

        numeros.remove(48);
        System.out.println("Contem quais numeros: " + numeros);





    }
}