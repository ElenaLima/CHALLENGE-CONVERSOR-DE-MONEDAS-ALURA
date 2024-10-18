package com.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class conversorDeMonedas {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/235fb8f864a25d67a2856a41/pair";

    public double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        // Construir la URL completa con las monedas de origen y destino
        String urlStr = API_URL + "/" + fromCurrency + "/" + toCurrency;
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Error en la conexión a la API. Código de respuesta: " + responseCode);
        }

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

        // Verificar si la respuesta contiene el campo conversion_rate
        if (!jsonObject.has("conversion_rate")) {
            throw new RuntimeException("La API no devolvió la tasa de conversión esperada.");
        }

        // Obtener la tasa de conversión
        return jsonObject.get("conversion_rate").getAsDouble();
    }

    public double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}