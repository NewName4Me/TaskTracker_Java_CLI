package helpers;

import java.io.File;
import java.io.IOException;

/**
 * Clase para crear un archivo JSON si no existe. El directorio base es fijo,
 * pero el nombre del archivo es configurable.
 */
public class CreateJsonFileIfNotExists {

    private static final String FILE_PATH = "./src/main/java/db/";

    public static void createJsonFileIfNotExists(String fileName) {
        String filePathFileName = FILE_PATH + fileName + ".json";

        File file = new File(filePathFileName);

        if (file.exists()) {
            return;
        }

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }
}
