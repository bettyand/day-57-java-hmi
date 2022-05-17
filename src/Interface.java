import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        // once again, classes have their own files
        // all programs will run in sequence

        Scanner scanner = new Scanner(System.in);

        // // simple dictionary
        // System.out.println("---Simple dictionary---");
        // SimpleDictionary dictionary = new SimpleDictionary();

        // TextUI ui = new TextUI(scanner, dictionary);
        // ui.start();

        // System.out.println();
        

        // // to do list
        // // renamed UserInterface class to TodoUI
        // System.out.println("---To do list---");
        // TodoList list = new TodoList();

        // TodoUI todo = new TodoUI(list, scanner);
        // todo.start();

        // System.out.println();

        // averages
        // renamed UserInterface to GradeUI
        // System.out.println("---Averages---");
        // GradeRegister register = new GradeRegister();

        // GradeUI userInterface = new GradeUI(register, scanner);
        // userInterface.start();

        // System.out.println();

        // joke manager
        // renamed UserInterface to JokeUI
        // System.out.println("---Joke Manager---");
        // JokeManager manager = new JokeManager();

        // JokeUI ui = new JokeUI(manager, scanner);
        // ui.start();

        // System.out.println();

        // TacoBoxes
        // this one was just making files buuuut here are some tests:
        // TripleTacoBox triple = new TripleTacoBox();
        // while (triple.tacosRemaining() > 0) {
        //     System.out.println(triple.tacosRemaining());
        //     triple.eat();
        // }
        // triple.eat();

        // System.out.print("How many tacos do you want? ");
        // int tacos = Integer.valueOf(scanner.nextLine());
        // System.out.println("Making your tacos...");
        // if (tacos > 5) {
        //     pause(1);
        //     System.out.println("This is a lot of tacos!");
        //     pause(1);
        // } else {
        //     pause(2);
        // }
        // CustomTacoBox custom = new CustomTacoBox(tacos);
        // System.out.println("Eating all your tacos mwahaha!");
        // while (custom.tacosRemaining() > 0) {
        //     System.out.println(custom.tacosRemaining());
        //     custom.eat();
        // }
        // custom.eat();
    }

    public static void pause(int wait) {
        try {
            Thread.sleep(wait * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
