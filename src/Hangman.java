import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/user/myprojects/Hangman/world_alpha.txt"));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
