package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {
    
    @Override
    public void breakPassword(int sizeOfPassword) {
        char[] key = new char[sizeOfPassword];
        pickCharacter(key, 0);
    }

    public boolean pickCharacter(char[] key, int index) {
        if (key.length == 0) {
            tryOpen(key);
            return false;
        }
        char[] characters = getCharacters();
        for (char character : characters) {
            key[index] = character;
            if (tryOpen(key)) {
                return true;
            }
            if (index < key.length - 1) {
                if (pickCharacter(key, index + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
