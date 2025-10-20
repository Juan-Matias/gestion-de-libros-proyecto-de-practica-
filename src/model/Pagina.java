package model;

public class Pagina {
    private int numero;
    private String contenido;

    public Pagina() {
        this(0, "");
    }

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = (contenido != null) ? contenido.trim() : "";
    }

    public int obtenerCantidadCaracteres() {
        if (contenido == null || contenido.isEmpty()) return 0;
        return contenido.replaceAll("\\s+", "").length(); // sin espacios
    }

    public int obtenerCantidadPalabras() {
        if (contenido == null || contenido.isBlank()) return 0;
        return contenido.trim().split("\\s+").length;
    }

    public int getNumero() {
        return numero;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("=== PÁGINA ===\n")
                .append("Número: ").append(numero).append("\n")
                .append("Contenido: ").append(contenido).append("\n")
                .append("Caracteres (sin espacios): ").append(obtenerCantidadCaracteres()).append("\n")
                .append("Palabras: ").append(obtenerCantidadPalabras()).append("\n")
                .toString();
    }
}
