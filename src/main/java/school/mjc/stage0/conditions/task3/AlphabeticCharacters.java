package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!((character >= 'A'  && character <= 'Z') || (character >= 'a' && character <= 'z'))) {
            System.out.println("wrong alphabet!");
            return;
        }

        if (character == 'a' || character == 'e' || character == 'i' ||
                character == 'u' || character == 'o' || character == 'A' ||
            character == 'E' || character == 'I' || character == 'U' ||
            character == 'O')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
