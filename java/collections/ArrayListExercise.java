import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();

        filmes.add("Cars");
        filmes.add("Kung Fu Panda");
        filmes.add("Shrek");
        filmes.add("Minions");

        System.out.println("Contem  Shrek na lista de filmes? " + filmes.contains("Shrek"));

        System.out.println("Filmes para assistir: " + filmes);

        filmes.remove("Kung Fu Panda");
        System.out.println("Depois de remover:" +  filmes);
    }
}