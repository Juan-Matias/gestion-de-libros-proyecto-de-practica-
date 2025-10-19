import model.Pagina;
import model.Capitulo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos algunas páginas
        Pagina p1 = new Pagina(1, "Este libro es de programación en Java.");
        Pagina p2 = new Pagina(2, "Contiene muchos ejemplos prácticos y ejercicios.");
        Pagina p3 = new Pagina(3, "Cada lección tiene explicaciones detalladas.");

        // Creamos un capítulo y agregamos páginas
        Capitulo capitulo1 = new Capitulo(1, "Lección 1: Introducción", new ArrayList<>());
        capitulo1.agregarPagina(p1);
        capitulo1.agregarPagina(p2);
        capitulo1.agregarPagina(p3);

        // Mostramos los resultados
        System.out.println(capitulo1);

        // Eliminamos una página
        capitulo1.eliminarPagina(2);
        System.out.println("\nDespués de eliminar la página 2:");
        System.out.println(capitulo1);
    }
}
