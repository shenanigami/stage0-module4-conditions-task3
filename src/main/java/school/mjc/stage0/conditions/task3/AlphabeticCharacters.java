package school.mjc.stage0.conditions.task3;
import java.lang.*;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!((character >= 'A'  && character <= 'Z') || (character >= 'a' && character <= 'z')))
            System.out.println("wrong alphabet!");

        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' ||
                character == 'u' || character == 'o')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
