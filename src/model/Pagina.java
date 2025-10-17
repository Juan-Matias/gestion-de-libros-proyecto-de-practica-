package model;

import interfaces.IPagina;

public class Pagina implements IPagina {

    // Atributos
    private int numero;
    private String contenido;

    // Constructores
    public Pagina() {
        this.numero = 0;
        this.contenido = "";
    }

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    // Métodos
    @Override
    public int obtenerCantidadCaracteres() {
        // Si contenido es null o vacío, devolvemos 0
        if (contenido == null || contenido.isBlank()) return 0;

        // Eliminamos todos los espacios antes de contar
        return contenido.replace(" ", "").length();
    }

    @Override
    public int obtenerCantidadPalabras() {
        if (contenido == null || contenido.isBlank()) return 0;

        // Dividimos la cadena por cualquier espacio, punto o coma
        String[] palabras = contenido.trim().split("[\\s.,]+");
        return palabras.length;
    }


    // Propiedades

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Zona de Mensajes
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== PÁGINA ===\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Contenido: ").append(contenido).append("\n");
        sb.append("Caracteres (sin espacios): ").append(obtenerCantidadCaracteres()).append("\n");
        sb.append("Palabras: ").append(obtenerCantidadPalabras()).append("\n");
        return sb.toString();
    }

}
