import Entidades.Pokemon;

import java.util.ArrayList;
import java.util.Random;

import static Ficheiros.LerPokemons.readAllPokemon;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> allPokemon = readAllPokemon("src/pokemon_data.csv");

        Random random = new Random();
        int[] randomValues = new int[10];

        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = random.nextInt(1050) + 1;
        }

        for (int i = 0; i < randomValues.length; i++) {
            System.out.println(allPokemon.get(randomValues[i]));
        }
    }
}
