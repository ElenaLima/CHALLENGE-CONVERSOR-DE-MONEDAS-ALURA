package com.conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        conversorDeMonedas converter = new conversorDeMonedas();

        try {
            System.out.println("Ingrese la moneda de origen (por ejemplo, USD): ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese la moneda de destino (por ejemplo, EUR): ");
            String toCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Ingrese la cantidad a convertir: ");
            double amount;
            try {
                amount = scanner.nextDouble();
                if (amount < 0) {
                    throw new IllegalArgumentException("La cantidad no puede ser negativa.");
                }
            } catch (InputMismatchException e) {
                throw new IllegalArgumentException("Debe ingresar un número válido.");
            }

            double exchangeRate = converter.getExchangeRate(fromCurrency, toCurrency);
            double convertedAmount = converter.convertCurrency(amount, exchangeRate);

            System.out.printf("La tasa de cambio de %s a %s es: %.2f%n", fromCurrency, toCurrency, exchangeRate);
            System.out.printf("La cantidad convertida es: %.2f %s%n", convertedAmount, toCurrency);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
