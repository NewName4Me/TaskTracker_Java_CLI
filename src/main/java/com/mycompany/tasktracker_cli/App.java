package com.mycompany.tasktracker_cli;

import controller.TaskController;
import helpers.CreateJsonFileIfNotExists;
import java.util.Scanner;

/**
 * Clase principal de la aplicación que maneja la interacción con el usuario.
 */
public class App {

    public static void main(String[] args) {
        // Variables
        String accionUsuario = "";
        String mensajeSalidaUsuario = "exit";

        // Inicializar Archivos necesarios
        CreateJsonFileIfNotExists.createJsonFileIfNotExists("data");

        // Leer la acción del usuario y dirigirla a TaskController
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe 'man' para aprender los comandos disponibles");

        while (!accionUsuario.equals(mensajeSalidaUsuario)) {
            accionUsuario = scanner.nextLine().trim().toLowerCase();
            TaskController.selectAction(accionUsuario);
        }

        scanner.close();
    }
}
