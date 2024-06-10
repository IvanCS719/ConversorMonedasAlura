package com.ivandroid.conversormonedasalura.modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HistorialConversion {

    public static void generarHistorial(String mensaje) throws IOException {
        FileWriter fileWriter = new FileWriter("HistorialConversion.txt", true);
        // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();
        // Formatear la fecha y hora
        String formatoFechaHora = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        fileWriter.write(formatoFechaHora +" - " + mensaje + "\n");
        fileWriter.close();
    }
}
