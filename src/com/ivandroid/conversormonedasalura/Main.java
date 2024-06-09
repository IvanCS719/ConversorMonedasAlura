package com.ivandroid.conversormonedasalura;

import com.ivandroid.conversormonedasalura.API.Conexion;

public class Main {
    public static void main(String[] args) {
        System.out.println(Conexion.conectarAPI("https://open.er-api.com/v6/latest/USD"));
    }
}
