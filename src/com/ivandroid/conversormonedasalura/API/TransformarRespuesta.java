package com.ivandroid.conversormonedasalura.API;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

public class TransformarRespuesta {
    private final Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy
                    .LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public TipoDeCambioAPI TodoLosTiposDeCambio(String json){
        try {
            return gson.fromJson(json, TipoDeCambioAPI.class);
        } catch (JsonSyntaxException e) {
            System.err.println("Error de sintaxis en el JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado al transformar la respuesta: " + e.getMessage());
        }
        return null;
    }
}
