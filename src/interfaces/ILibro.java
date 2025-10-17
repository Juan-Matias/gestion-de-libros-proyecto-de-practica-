package interfaces;

import model.Capitulo;

import java.util.ArrayList;

public interface ILibro {
//    private Integer idLibro;
//    private String titulo;
//    private ArrayList<Capitulo> listaCapitulo;

    // Entonces
    // idLibro = 1


    boolean agregarCapitulo(Capitulo uncapitulo);
    int eliminarCapitulo(int numero);
    int obtenerCantidadCaracteresCapitulo(int numero);
    int obtenerCantidadPalabrasCapitulo(int numero);
    int obtenerCantidadTotalCaracteres();
    int obtenerCantidadTotalPalabras();
    int obtenerNroPaginas();
}
