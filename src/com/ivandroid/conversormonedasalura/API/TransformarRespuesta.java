package com.ivandroid.conversormonedasalura.API;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

public class TransformarRespuesta {
    private final Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy
                    .LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public TipoDeCambioAPI TodoLosTiposDeCambio(String json){
        return gson.fromJson(json, TipoDeCambioAPI.class);
    }
}
