# Ejercicios Guiados de Algoritmos de Búsqueda

## Descripción

Este repositorio contiene una colección de ejercicios prácticos y retos de aprendizaje desarrollados en Java, enfocados en la implementación y comprensión de diferentes algoritmos de búsqueda.

A través de estos ejercicios se trabajan búsquedas sobre arreglos unidimensionales y matrices, localización de elementos, identificación de posiciones, manejo de valores repetidos y comparación del rendimiento de distintos algoritmos.

## Objetivo

Fortalecer la lógica de programación y comprender el funcionamiento de los algoritmos de búsqueda mediante ejercicios prácticos, implementaciones en Java y pruebas con diferentes conjuntos de datos.

## Tecnologías utilizadas

- **Lenguaje:** Java.
- **Entorno de ejecución:** Java Virtual Machine (JVM).
- **Bibliotecas estándar:** `java.util.Arrays`, `java.util.ArrayList`, `java.util.List`, `java.util.Random` y `java.util.logging`.

## Estructura del proyecto

```text
ejercicios-guiados-algoritmos-de-busqueda/
└── src/
    ├── ejercicios/
    │   ├── Ejercicio1.java
    │   ├── Ejercicio2.java
    │   ├── Ejercicio3.java
    │   ├── Ejercicio4.java
    │   ├── Ejercicio5.java
    │   ├── Ejercicio6.java
    │   ├── Ejercicio7.java
    │   ├── Ejercicio8.java
    │   ├── Ejercicio9.java
    │   └── Ejercicio10.java
    │
    └── retosAprendizaje/
        ├── retoAprendizaje1.java
        ├── retoAprendizaje2.java
        └── retoAprendizaje3.java
```

## Ejercicios desarrollados

Los ejercicios se encuentran organizados en dos paquetes:

### 1. Paquete `ejercicios`

| Ejercicio | Descripción |
|---|---|
| Ejercicio 1 | Búsqueda lineal para determinar si un elemento existe en un arreglo. |
| Ejercicio 2 | Conteo de las apariciones de un elemento dentro de un arreglo. |
| Ejercicio 3 | Búsqueda y eliminación de la primera aparición de un elemento. |
| Ejercicio 4 | Identificación del índice del elemento mínimo de un arreglo. |
| Ejercicio 5 | Búsqueda binaria con retorno del índice o del punto de inserción. |
| Ejercicio 6 | Identificación de la primera y última aparición de un elemento mediante búsqueda binaria. |
| Ejercicio 7 | Búsqueda en matrices bidimensionales y conteo de coincidencias. |
| Ejercicio 8 | Búsqueda en escalera (*Staircase Search*) para localizar posiciones en una matriz ordenada. |
| Ejercicio 9 | Búsqueda binaria en una matriz tratada como un arreglo unidimensional, identificando el rango de posiciones de un elemento. |
| Ejercicio 10 | Comparación del rendimiento de búsqueda lineal y binaria utilizando cinco millones de elementos. |

### 2. Paquete `retosAprendizaje`

**Reto 1: Comparación de algoritmos de búsqueda**

Implementa búsqueda lineal, binaria y por saltos (*Jump Search*). Realiza pruebas con arreglos de diferentes tamaños, desde mil hasta cinco millones de elementos, y mide sus tiempos de ejecución.

**Reto 2: Búsqueda exponencial**

Implementa *Exponential Search*, utilizando la búsqueda binaria para localizar un elemento dentro del intervalo identificado.

**Reto 3: Búsqueda segura**

Implementa una búsqueda que verifica si el arreglo está ordenado y valida el resultado de la búsqueda binaria. Si las condiciones no se cumplen, utiliza la búsqueda lineal como alternativa.

## Algoritmos de búsqueda implementados

- **Búsqueda lineal (*Linear Search*):** recorre secuencialmente los elementos hasta encontrar el objetivo o terminar el recorrido.
- **Búsqueda binaria (*Binary Search*):** divide repetidamente el intervalo de búsqueda y requiere que los datos estén ordenados.
- **Búsqueda por saltos (*Jump Search*):** avanza por bloques y posteriormente realiza una búsqueda secuencial dentro del bloque correspondiente.
- **Búsqueda exponencial (*Exponential Search*):** identifica un intervalo mediante saltos exponenciales y aplica búsqueda binaria dentro de él.
- **Búsqueda en escalera (*Staircase Search*):** aprovecha el orden de filas y columnas de una matriz para descartar posiciones que no pueden contener el elemento.

## Análisis de rendimiento

El proyecto incluye ejercicios de medición que permiten comparar el comportamiento de diferentes algoritmos.

En el ejercicio 10 se utilizan cinco millones de elementos y se realizan mediciones con `System.nanoTime()`, incluyendo un calentamiento previo de la JVM.

El reto de aprendizaje 1 amplía la comparación entre búsqueda lineal, binaria y por saltos, utilizando diferentes tamaños de arreglos y varias corridas para calcular promedios.

Estas pruebas permiten observar cómo cambia el tiempo de ejecución según el algoritmo y la cantidad de datos.

## Requisitos

- Java JDK instalado.
- Terminal o entorno de desarrollo compatible con Java.
- Git para clonar el repositorio.

## Instalación y ejecución

Clonar el repositorio:

```bash
git clone https://github.com/rberriob-1432/ejercicios-guiados-algoritmos-de-busqueda.git
```

Ingresar al proyecto:

```bash
cd ejercicios-guiados-algoritmos-de-busqueda
```

Compilar los archivos:

```bash
javac -d out src/ejercicios/*.java src/retosAprendizaje/*.java
```

Ejecutar un ejercicio específico:

```bash
java -cp out ejercicios.Ejercicio1
```

Ejecutar un reto de aprendizaje:

```bash
java -cp out retosAprendizaje.retoAprendizaje1
```

Para ejecutar otro ejercicio o reto, se debe cambiar el nombre de la clase correspondiente.

## Conceptos aplicados

- Arreglos unidimensionales y bidimensionales.
- Ciclos y estructuras condicionales.
- Métodos estáticos.
- Búsqueda de elementos y posiciones.
- Manipulación de arreglos.
- Complejidad algorítmica.
- Medición de tiempos de ejecución.
- Validación de resultados.
- Uso de colecciones de Java.

## Autor

**Raul Alonso Berrio Blanquicett**

Proyecto académico desarrollado con fines de aprendizaje y práctica de algoritmos de búsqueda.

## Repositorio

[GitHub - Ejercicios Guiados de Algoritmos de Búsqueda](https://github.com/rberriob-1432/ejercicios-guiados-algoritmos-de-busqueda)