# CONVERSOR DE MONEDAS

Este proyecto es una aplicación en Java que convierte cantidades de una moneda a otra utilizando una API para obtener la tasa de cambio.

## DESCRIPCIÓN

La aplicación se compone de dos clases principales:

1. `conversorDeMonedas`:
    - Clase que maneja la obtención de la tasa de cambio desde la API.
    - Métodos:
        - `getExchangeRate(String fromCurrency, String toCurrency)`: Obtiene la tasa de cambio entre dos monedas.
        - `convertCurrency(double amount, double exchangeRate)`: Realiza la conversión de la cantidad dada a la moneda de destino.

2. `Principal`:
    - Clase que contiene el método `main`.
    - Interactúa con el usuario para obtener la moneda de origen, la moneda de destino y la cantidad a convertir.
    - Utiliza la clase `conversorDeMonedas` para calcular la cantidad convertida.

## USO

Para ejecutar la aplicación, sigue estos pasos:

1. Ejecuta el método `main` de la clase `Principal`.
2. Ingresa la moneda de origen (por ejemplo, `USD`).
3. Ingresa la moneda de destino (por ejemplo, `EUR`).
4. Ingresa la cantidad a convertir.

La aplicación mostrará la tasa de cambio actual y la cantidad convertida.

## Ejemplo
- Ingrese la moneda de origen (por ejemplo, USD):
USD
- Ingrese la moneda de destino (por ejemplo, EUR):
COP
- Ingrese la cantidad a convertir:
25
- La tasa de cambio de USD a COP es: 4249,56
- La cantidad convertida es: 106238,97 COP

Process finished with exit code 0

## MANEJO DE ERRORES:

La aplicación maneja errores comunes, como:

- Errores de conexión a la API.
- Formatos inválidos de moneda.
- Cantidades negativas o entradas no numéricas.

## Ejemplo 1
- Ingrese la moneda de origen (por ejemplo, USD):
COP
- ngrese la moneda de destino (por ejemplo, EUR):
EUR
- Ingrese la cantidad a convertir:
-720
- Ocurrió un error: La cantidad no puede ser negativa.

Process finished with exit code 0

## Ejemplo 2
. Ingrese la moneda de origen (por ejemplo, USD):
COP
- Ingrese la moneda de destino (por ejemplo, EUR):
UND
- Ingrese la cantidad a convertir:
34
- Ocurrió un error: Error en la conexión a la API. Código de respuesta: 404

Process finished with exit code 0

## PROYECTO CREADO POR: 
Elena Lima
Bogotá - Colombia 
Octubre 2024




