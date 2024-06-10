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

    public void baseCodeToRate(Double baseCode, String countryBase, String countryCovertir){
        var monedaConvertida = baseCode * conversion.get(countryCovertir);
        System.out.println("El valor "+baseCode+" ["+countryBase+"] corresponde"
        +" al valor final de =>>> "+monedaConvertida+" ["+countryCovertir+"]");
    }

    public void RateToBaseCode(Double rate, String countryBase, String countryCovertir){
        var igualar = conversion.get(countryCovertir) / conversion.get(countryBase);
        var monedaConvertida = rate * igualar;
        System.out.println("El valor "+rate+" ["+countryBase+"] corresponde"
                +" al valor final de =>>> "+monedaConvertida+" ["+countryCovertir+"]");
    }
}
