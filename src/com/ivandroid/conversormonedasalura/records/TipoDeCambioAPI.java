package com.ivandroid.conversormonedasalura.records;

import java.util.Map;

public record TipoDeCambioAPI(String base_code, Map<String, Double> rates) {
}
