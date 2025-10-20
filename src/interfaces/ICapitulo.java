package interfaces;

import model.Pagina;


public interface ICapitulo {

    boolean agregarPagina(Pagina unaPagina);
    boolean eliminarPagina(int numero);
    int obtenerCantidadCaracteres();
    int obtenerCantidadPalabras();
    int obtenerNroPaginas();
}
