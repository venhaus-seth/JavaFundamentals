import java.util.Random;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    
    Random randMachine = new Random();

    public void getTenRolls() {
        for (int i = 1; i <=10; i++) {
            int num = (randMachine.nextInt(20)+ 1); 
            System.out.println(num);
        }
    }

    public String getRandomLetter() {
        String[] alphabetList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String randLetter = alphabetList[randMachine.nextInt(26)];
        return randLetter;
    }

    public String generatePassword( int passwordLength) {
        String password = "";
        for (int i = 0; i < passwordLength; i ++) {
            String newChar = this.getRandomLetter();
            password += newChar;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String newPassword = this.generatePassword(8);
            passwordSet.add(newPassword);
        }
        return passwordSet;
    }
}
