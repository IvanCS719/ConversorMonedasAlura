package com.ivandroid.conversormonedasalura;

import com.ivandroid.conversormonedasalura.API.Conexion;
import com.ivandroid.conversormonedasalura.API.TransformarRespuesta;
import com.ivandroid.conversormonedasalura.modelos.TipoDeCambio;
import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

public class Main {
    public static void main(String[] args) {
       String respuesta = Conexion.conectarAPI("https://open.er-api.com/v6/latest/USD");
        TransformarRespuesta tr = new TransformarRespuesta();
        TipoDeCambioAPI jsonFIltrado = tr.TodoLosTiposDeCambio(respuesta);

        TipoDeCambio tipoDeCambio = new TipoDeCambio(jsonFIltrado);
        tipoDeCambio.baseCodeToRate(10.0,"USD","MXN");
    }
}
