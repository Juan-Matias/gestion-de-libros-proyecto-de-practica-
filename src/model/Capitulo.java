package model;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {
    private int numero;
    private String nombre;
    private List<Pagina> listaPaginas;

    public Capitulo() {
        this(0, "", new ArrayList<>());
    }

    public Capitulo(int numero, String nombre, List<Pagina> listaPaginas) {
        this.numero = numero;
        this.nombre = (nombre != null) ? nombre : "";
        this.listaPaginas = (listaPaginas != null) ? listaPaginas : new ArrayList<>();
    }

    public boolean agregarPagina(Pagina nuevaPagina) {
        if (nuevaPagina == null) return false;
        for (Pagina p : listaPaginas) {
            if (p.getNumero() == nuevaPagina.getNumero()) {
                return false; // no duplicar
            }
        }
        listaPaginas.add(nuevaPagina);
        return true;
    }

    public boolean eliminarPagina(int numero) {
        for (int i = 0; i < listaPaginas.size(); i++) {
            if (listaPaginas.get(i).getNumero() == numero) {
                listaPaginas.remove(i);
                return true;
            }
        }
        return false;
    }

    public int obtenerCantidadCaracteres() {
        int total = 0;
        for (Pagina p : listaPaginas) {
            total += p.obtenerCantidadCaracteres();
        }
        return total;
    }

    public int obtenerCantidadPalabras() {
        int total = 0;
        for (Pagina p : listaPaginas) {
            total += p.obtenerCantidadPalabras();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pagina> getListaPaginas() {
        return listaPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAPÍTULO ===\n")
                .append("Número: ").append(numero).append("\n")
                .append("Nombre: ").append(nombre).append("\n")
                .append("Total páginas: ").append(listaPaginas.size()).append("\n")
                .append("Total caracteres: ").append(obtenerCantidadCaracteres()).append("\n")
                .append("Total palabras: ").append(obtenerCantidadPalabras()).append("\n");

        for (Pagina p : listaPaginas) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
