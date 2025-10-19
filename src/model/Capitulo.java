package model;

import interfaces.ICapitulo;
import java.util.ArrayList;
import java.util.List;

public class Capitulo implements ICapitulo {

    // Atributos
    private int numero;
    private String nombre;
    private List<Pagina> listaPaginas;

    // Constructores
    public Capitulo() {
        this(0, "", new ArrayList<>());
    }

    public Capitulo(int numero, String nombre, List<Pagina> listaPaginas) {
        this.numero = numero;
        this.nombre = (nombre != null) ? nombre : "";
        this.listaPaginas = (listaPaginas != null) ? listaPaginas : new ArrayList<>();
    }

    // Métodos
    @Override
    public boolean agregarPagina(Pagina unaPagina) {
        if (unaPagina == null) return false;

        // Evitar duplicados por número
        for (Pagina p : listaPaginas) {
            if (p.getNumero() == unaPagina.getNumero()) return false;
        }

        listaPaginas.add(unaPagina);
        return true;
    }

    @Override
    public int eliminarPagina(int numero) {
        for (int i = 0; i < listaPaginas.size(); i++) {
            if (listaPaginas.get(i).getNumero() == numero) {
                listaPaginas.remove(i);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int obtenerCantidadCaracteres() {
        int total = 0;
        for (Pagina p : listaPaginas) {
            total += p.obtenerCantidadCaracteres();
        }
        return total;
    }

    @Override
    public int obtenerCantidadPalabras() {
        int total = 0;
        for (Pagina p : listaPaginas) {
            total += p.obtenerCantidadPalabras();
        }
        return total;
    }

    @Override
    public int obtenerNroPaginas() {
        return listaPaginas.size();
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre != null) ? nombre : "";
    }

    public List<Pagina> getListaPaginas() {
        return listaPaginas;
    }

    public void setListaPaginas(List<Pagina> listaPaginas) {
        this.listaPaginas = (listaPaginas != null) ? listaPaginas : new ArrayList<>();
    }

    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAPÍTULO ===\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Total páginas: ").append(obtenerNroPaginas()).append("\n");
        sb.append("Total caracteres: ").append(obtenerCantidadCaracteres()).append("\n");
        sb.append("Total palabras: ").append(obtenerCantidadPalabras()).append("\n");

        for (Pagina p : listaPaginas) {
            sb.append(p.obtenerDatos()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return obtenerDatos();
    }
}
