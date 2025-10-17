package test;

public class TestRendimiento {
    public static void main(String[] args) {
        final int ITERACIONES = 10_000_000;
        long inicio, fin;

        // === Prueba con int ===
        inicio = System.nanoTime();
        int sumaInt = 0;
        for (int i = 0; i < ITERACIONES; i++) {
            sumaInt += i;
        }
        fin = System.nanoTime();
        long tiempoInt = fin - inicio;
        System.out.println("Tiempo con int     : " + tiempoInt / 1_000_000.0 + " ms");

        // === Prueba con Integer ===
        inicio = System.nanoTime();
        Integer sumaInteger = 0;
        for (int i = 0; i < ITERACIONES; i++) {
            sumaInteger += i; // autoboxing + unboxing
        }
        fin = System.nanoTime();
        long tiempoInteger = fin - inicio;
        System.out.println("Tiempo con Integer : " + tiempoInteger / 1_000_000.0 + " ms");

        // === Resultado final ===
        System.out.println("\nDiferencia aproximada: " + (tiempoInteger - tiempoInt) / 1_000_000.0 + " ms");
    }
}
