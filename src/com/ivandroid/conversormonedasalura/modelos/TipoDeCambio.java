package com.ivandroid.conversormonedasalura.modelos;

import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

import java.util.Map;

public class TipoDeCambio {
    private final Map<String, Double> tipoCambio;

    public TipoDeCambio(TipoDeCambioAPI tipoDeCambioAPI){
        this.tipoCambio = tipoDeCambioAPI.conversion_rates();
    }
}
