package model;

import interfaces.ILibro;

import java.util.ArrayList;

public class Libro implements ILibro {
    // Atributos
    private Integer idLibro;
    private String titulo;
    private ArrayList<Capitulo> listaCapitulo;

    // Constructores
    public Libro() {
        this.idLibro = 0;
        this.titulo = "";
        this.listaCapitulo = new ArrayList<>();
    }

    public Libro(Integer idLibro, String titulo, ArrayList<Capitulo> listaCapitulo) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.listaCapitulo = listaCapitulo;
    }

    // Metodos

    @Override
    public boolean agregarCapitulo(Capitulo uncapitulo) {
//        validar entrada de capitulo
//        if (uncapitulo == null) {
//            return false;
//        }
        this.listaCapitulo.add(uncapitulo);
        return true;
    }

    @Override
    public int eliminarCapitulo(int numero) {
//         Verificar que la lista no sea null
//        if (this.listaCapitulo == null) {
//            return 0; // No hay capítulos para eliminar
//        }


        for (int i = 0; i < listaCapitulo.size(); i++) {
            if (listaCapitulo.get(i).getNumero() == numero) {
                listaCapitulo.remove(i);
                return 1; // Capítulo eliminado correctamente
            }
        }
        return 0; // no se encontro el capitulo
    }

    @Override
    public int obtenerCantidadCaracteresCapitulo(int numero) {
        int totalCarecteresCapitulo = 0;
        for (int i = 0; i < listaCapitulo.size(); i++) {
            if (listaCapitulo.get(i).getNumero() == numero) {
                totalCarecteresCapitulo++;
            }
        }
        return totalCarecteresCapitulo;
    }

    @Override
    public int obtenerCantidadPalabrasCapitulo(int numero) {
        return 0;
    }

    @Override
    public int obtenerCantidadTotalCaracteres() {
        return 0;
    }

    @Override
    public int obtenerCantidadTotalPalabras() {
        return 0;
    }

    @Override
    public int obtenerNroPaginas() {
        return 0;
    }

    // Propiedades
    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Capitulo> getListaCapitulo() {
        return listaCapitulo;
    }

    public void setListaCapitulo(ArrayList<Capitulo> listaCapitulo) {
        this.listaCapitulo = listaCapitulo;
    }

}
