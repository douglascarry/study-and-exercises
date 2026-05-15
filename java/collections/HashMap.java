import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Laranja", 10);
        mapa.put("Banana", 20);
        mapa.put("Melancia", 30);

        System.out.println("Tem Laranja no meu Map? :" + mapa.containsKey("Laranja"));

        mapa.remove("Laranja");
        System.out.println("Quantidade depois de remover: " + mapa);

        mapa.put("Melancia", 40);
        System.out.println("Depois de atualizar o valor: " + mapa);

    }
}