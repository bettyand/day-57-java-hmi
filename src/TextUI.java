import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Give me a command!\nI am a mere aggregation of circuits and code!\nI live to serve you, o wise and powerful meatbag!");
        System.out.println("[Known commands: add, search, end]");
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("end")) {

                System.out.println("Bye bye!");
                break;

            } else if (command.equalsIgnoreCase("add")) {

                System.out.print("Enter a word: ");
                String word = scanner.nextLine();
                System.out.print("Enter a translation for that word: ");
                String trans = scanner.nextLine();
                dictionary.add(word, trans);

            } else if (command.equalsIgnoreCase("search")) {

                System.out.print("What word would you like translated? ");
                String search = scanner.nextLine();
                System.out.println("Word entered: " + search);
                String found = dictionary.translate(search);
                if (found == null) {
                    System.out.println("Word " + search + " was not found.");
                } else {
                    System.out.println("Translation: " + dictionary.translate(search));
                }

            } else {

                System.out.println("Unknown command. Try again?");

            }
        }
    }
}
