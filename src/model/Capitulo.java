package model;

import interfaces.ICapitulo;

import java.util.ArrayList;

public class Capitulo implements ICapitulo {
    // Atributos
    private int numero;
    private String nombre;
    private ArrayList<Pagina> pagina;

    // Constructores
    public Capitulo() {
        this.numero = 0;
        this.nombre = "";
        this.pagina = new ArrayList<>();
    }

    public Capitulo(int numero, String nombre, ArrayList<Pagina> pagina) {
        this.numero = numero;
        this.nombre = nombre;
        this.pagina = pagina;
    }

    // Metodos
    @Override
    public boolean agregarPagina(Pagina unaPagina) {
        // Validamos null primero
        if (unaPagina == null) return false;

        // Evitamos duplicados
        for (Pagina p : pagina) {
            if (p.getNumero() == unaPagina.getNumero()) {
                return false;
            }
        }

        // Agregamos
        this.pagina.add(unaPagina);
        return true;
    }


    @Override
    public int eliminarPagina(int numero) {
        return 0;
    }

    @Override
    public int obtenerCantidadCaracteres() {
        return 0;
    }

    @Override
    public int obtenerCantidadPalabras() {
        return 0;
    }

    @Override
    public int obtenerNroPaginas() {
        return 0;
    }

    // Propiedades

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
        this.nombre = nombre;
    }

    public ArrayList<Pagina> getPagina() {
        return pagina;
    }

    public void setPagina(ArrayList<Pagina> pagina) {
        this.pagina = pagina;
    }
}
