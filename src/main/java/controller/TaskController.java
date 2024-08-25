package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author torta
 */
public class TaskController {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Runnable> actions = new HashMap<>();

    /**
     * mapa para determinar que funcion debe ejecutar cada una de las acciones
     * de un usuario
     */
    static {
        actions.put("add", TaskController::addTask);
        actions.put("update", TaskController::updateTask);
        actions.put("delete", TaskController::deleteTask);
        actions.put("list", TaskController::listTask);
    }

    /**
     * este metodo es el director de todos los metodos, él decide a que metodo
     * llamar para realizar cada una de las acciones posibles en nuestra "DB"
     *
     * @param userAction
     */
    public static void selectAction(String userAction) {
        userAction = userAction.trim().toLowerCase();

        Runnable action = actions.get(userAction);

        if (action != null) {
            action.run();
        } else {
            invalidOption();
        }
    }

    public static void invalidOption() {
        System.out.println("Opcion no valida, pulsa MAN para ver la lista de comandos");
    }

    public static void addTask() {
        System.out.println("add");
    }

    public static void updateTask() {
        System.out.println("update");
    }

    public static void deleteTask() {
        System.out.println("delete");
    }

    public static void listTask() {
        System.out.println("list all");
    }
}
