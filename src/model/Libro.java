package model;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int idLibro;
    private String titulo;
    private List<Capitulo> listaCapitulo;

    public Libro() {
        this(0, "", new ArrayList<>());
    }

    public Libro(int idLibro, String titulo, List<Capitulo> listaCapitulo) {
        this.idLibro = idLibro;
        this.titulo = (titulo != null) ? titulo : "";
        this.listaCapitulo = (listaCapitulo != null) ? listaCapitulo : new ArrayList<>();
    }

    public boolean agregarCapitulo(Capitulo cap) {
        if (cap == null) return false;
        for (Capitulo c : listaCapitulo) {
            if (c.getNumero() == cap.getNumero()) return false;
        }
        listaCapitulo.add(cap);
        return true;
    }

    public boolean eliminarCapitulo(int numero) {
        return listaCapitulo.removeIf(c -> c.getNumero() == numero);
    }

    public int obtenerCantidadTotalCaracteres() {
        int total = 0;
        for (Capitulo c : listaCapitulo) {
            total += c.obtenerCantidadCaracteres();
        }
        return total;
    }

    public int obtenerCantidadTotalPalabras() {
        int total = 0;
        for (Capitulo c : listaCapitulo) {
            total += c.obtenerCantidadPalabras();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("📘 LIBRO\n")
                .append("ID: ").append(idLibro).append("\n")
                .append("Título: ").append(titulo).append("\n")
                .append("Total capítulos: ").append(listaCapitulo.size()).append("\n")
                .append("Total caracteres: ").append(obtenerCantidadTotalCaracteres()).append("\n")
                .append("Total palabras: ").append(obtenerCantidadTotalPalabras()).append("\n\n");

        for (Capitulo c : listaCapitulo) {
            sb.append(c).append("\n");
        }

        return sb.toString();
    }
}
