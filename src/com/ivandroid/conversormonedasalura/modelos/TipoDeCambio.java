package com.ivandroid.conversormonedasalura.modelos;

import com.ivandroid.conversormonedasalura.records.TipoDeCambioAPI;

import java.util.Map;

public class TipoDeCambio {
    private String tipoCambio;
    private Map<String, Double> conversion;

    public TipoDeCambio(TipoDeCambioAPI tipoDeCambioAPI){
        try{
            this.tipoCambio = tipoDeCambioAPI.base_code();
            this.conversion = tipoDeCambioAPI.rates();
        }catch (NullPointerException e){
            System.out.println("Error valores nulos: " + e.getMessage());
        }
    }

    public String baseCodeToRate(Double baseCode, String countryBase, String countryConvertir){
        var monedaConvertida = baseCode * conversion.get(countryConvertir);
        return String.format("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]",
                baseCode, countryBase, monedaConvertida, countryConvertir);
    }

    public String RateToBaseCode(Double rate, String countryBase, String countryConvertir){
        var igualar = conversion.get(countryConvertir) / conversion.get(countryBase);
        var monedaConvertida = rate * igualar;
        return String.format("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]",
                rate, countryBase, monedaConvertida, countryConvertir);
    }
}
