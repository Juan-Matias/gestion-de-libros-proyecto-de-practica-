import model.Pagina;
import model.Capitulo;
import model.Libro;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pagina p1 = new Pagina(1, "Este libro es de programación en Java.");
        Pagina p2 = new Pagina(2, "Contiene muchos ejemplos prácticos y ejercicios.");
        Pagina p3 = new Pagina(3, "Cada lección tiene explicaciones detalladas.");

        Capitulo capitulo1 = new Capitulo(1, "Lección 1: Introducción", new ArrayList<>());
        capitulo1.agregarPagina(p1);
        capitulo1.agregarPagina(p2);
        capitulo1.agregarPagina(p3);

        Libro libro = new Libro(1, "Curso de Programación", new ArrayList<>());
        libro.agregarCapitulo(capitulo1);

        System.out.println("=== CONTENIDO DEL LIBRO ===");
        System.out.println(libro);

        if (capitulo1.eliminarPagina(2)) {
            System.out.println("✅ Se eliminó correctamente la página 2.");
        } else {
            System.out.println("❌ No se encontró la página 2.");
        }

        System.out.println("\n=== CAPÍTULO DESPUÉS DE LA ELIMINACIÓN ===");
        System.out.println(capitulo1);
    }
}
