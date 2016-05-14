/**
 * Created by George on 5/13/16.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static String[] add(String[] toDos, String newTask) {
        String[] newTodos = new String[toDos.length + 1];
        for (int i = 0; i < toDos.length; ++i) {
            newTodos[i] = toDos[i];
        }
        newTodos[newTodos.length - 1] = newTask;
        return newTodos;
    }

    static String[] remove(String[] toDos, int index) {
        if (index < 0 || index >= toDos.length) {
            return toDos;
        }
        String[] newTodos = new String[toDos.length - 1];
        for (int i = 0; i < toDos.length; ++i) {
            if (i < index) {
                newTodos[i] = toDos[i];
                continue;
            }
            if (i == index) continue;
            newTodos[i - 1] = toDos[i];
        }
        return newTodos;
    }

    static void update(String[] toDos, int index, String newTask) {
        if (index < 0 || index >= toDos.length) {
            return;
        }
        toDos[index] = newTask;
    }

    static void list(String[] toDos) {
        for (int i = 0; i < toDos.length; ++i) {
            System.out.println("" + i + ". " + toDos[i]);
        }
    }

    public static void main(String[] args) {
        String[] toDos = new String[]{};
        Boolean continueLoop = true;
        Scanner scanner = new Scanner(System.in);
        while (continueLoop.booleanValue()) {
            String input;
            System.out.println("Please choose an option:");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(0) Exit.");
            switch (input = scanner.nextLine()) {
                case "1": {
                    System.out.println("Enter a description of the new task.");
                    String newTask = scanner.nextLine();
                    toDos = Main.add(toDos, newTask);
                    break;
                }
                case "2": {
                    System.out.println("Enter the index of the task to remove.");
                    int index = Integer.parseInt(scanner.nextLine());
                    toDos = Main.remove(toDos, index);
                    break;
                }
                case "3": {
                    System.out.println("Enter the index of the task to update.");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the new description of the task.");
                    String newTask = scanner.nextLine();
                    Main.update(toDos, index, newTask);
                    break;
                }
                case "4": {
                    Main.list(toDos);
                    break;
                }
                case "0": {
                    continueLoop = false;
                }
            }
        }
    }
}

