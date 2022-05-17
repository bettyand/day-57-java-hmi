import java.util.Scanner;

public class TodoUI {
    TodoList list;
    Scanner scanner;

    public TodoUI(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Welcome to your personal digital assistant.\nHow may I serve while also datamining you?");
        System.out.println("[Known commands: add, list, remove, stop]");
        while (true) {
            System.out.print("Command: ");
            String response = scanner.nextLine();
            
            if (response.equalsIgnoreCase("stop")) {
                System.out.println("Goodbye.");
                break;

            } else if (response.equalsIgnoreCase("add")) {
                System.out.print("Task to add: ");
                String task = scanner.nextLine();
                list.add(task);

            } else if (response.equalsIgnoreCase("list")) {
                list.print();

            } else if (response.equalsIgnoreCase("remove")) {
                System.out.print("Task number to remove: ");
                int num = Integer.valueOf(scanner.nextLine());
                list.remove(num);
            }

        }
    }
}
