package com.ivandroid.conversormonedasalura;

import com.ivandroid.conversormonedasalura.API.Conexion;
import com.ivandroid.conversormonedasalura.API.TransformarRespuesta;
import com.ivandroid.conversormonedasalura.modelos.TipoDeCambio;
import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String respuesta = Conexion.conectarAPI("https://open.er-api.com/v6/latest/USD");
        TransformarRespuesta tr = new TransformarRespuesta();
        TipoDeCambioAPI jsonFIltrado = tr.TodoLosTiposDeCambio(respuesta);
        Scanner teclado = new Scanner(System.in);

        TipoDeCambio tipoDeCambio = new TipoDeCambio(jsonFIltrado);


        int opcion = 0;
        double valor;

        while (opcion != 7){
            System.out.println("""
                    **************************************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    Seleccione una de la siguetes opciones para convertir:
                    1) Dólar =>> Peso Mexicano
                    2) Peso Mexicano =>> Dólar
                    3) Dólar =>> Peso Argentino
                    4) Peso Argentino =>> Dólar
                    5) Dólar =>> Real Brasileño
                    6) Real Brasileño =>> Dólar
                    7) Salir
                    **************************************************************************
                    """);
            opcion = teclado.nextInt();



            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor para convertir Dólar =>> Peso Mexicano:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.baseCodeToRate(valor,"USD","MXN");
                    break;

                case 2:
                    System.out.println("Ingrese el valor para convertir Peso Mexicano =>> Dólar:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.RateToBaseCode(valor, "MXN", "USD");
                    break;

                case 3:
                    System.out.println("Ingrese el valor para convertir Dólar =>> Peso Argentino:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.baseCodeToRate(valor,"USD","ARS");
                    break;

                case 4:
                    System.out.println("Ingrese el valor para convertir Peso Argentino =>> Dólar:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.RateToBaseCode(valor, "ARS", "USD");
                    break;

                case 5:
                    System.out.println("Ingrese el valor para convertir Dólar =>> Real Brasileño:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.baseCodeToRate(valor,"USD","BRL");
                    break;

                case 6:
                    System.out.println("Ingrese el valor para convertir Real Brasileño =>> Dólar:");
                    valor = teclado.nextDouble();

                    tipoDeCambio.RateToBaseCode(valor, "BRL", "USD");
                    break;

                case 7:
                    System.out.println("Gracias por usar este Convertidor de Monedas");
                    break;
            }

        }
    }
}
