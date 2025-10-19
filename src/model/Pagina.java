package model;

import interfaces.IPagina;

public class Pagina implements IPagina {

    // Atributos
    private int numero;
    private String contenido;

    // Constructores
    public Pagina() {
        this(0, "");
    }

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = (contenido != null) ? contenido : "";
    }

    // Métodos de la interfaz
    @Override
    public int obtenerCantidadCaracteres() {
        if (contenido == null || contenido.isBlank()) return 0;
        // Contar caracteres sin espacios
        return contenido.replaceAll("\\s+", "").length();
    }

    @Override
    public int obtenerCantidadPalabras() {
        if (contenido == null || contenido.isBlank()) return 0;
        // Dividimos la cadena por espacios, puntos o comas
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
        this.contenido = (contenido != null) ? contenido : "";
    }

    // Zona de mensajes
    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== PÁGINA ===\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Contenido: ").append(contenido).append("\n");
        sb.append("Caracteres (sin espacios): ").append(obtenerCantidadCaracteres()).append("\n");
        sb.append("Palabras: ").append(obtenerCantidadPalabras()).append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        return obtenerDatos();
    }
}
