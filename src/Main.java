import model.Pagina;

public class Main {
    public static void main(String[] args) {

        // Instanciamos el objeto Pagina
        Pagina pagina = new Pagina(1, "Hola . hola ,   . ");




        System.out.println("Total de caracteres: " + pagina.obtenerCantidadCaracteres());
        System.out.println("Total de palabras: " + pagina.obtenerCantidadPalabras());

        // Usando toString()
        System.out.println(pagina);
    }
}
