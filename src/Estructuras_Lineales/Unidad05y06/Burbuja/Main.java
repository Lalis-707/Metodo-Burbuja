package Estructuras_Lineales.Unidad05y06.Burbuja;

public class Main {
    public static void main(String[] args) {
        // Usamos nuestro arreglo de ejemplo de clase
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("\n==========================================");
        System.out.println("          ARREGLO ORIGINAL");
        System.out.println("==========================================");

        Burbuja.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento
        Burbuja.ordenar(arreglo);

        System.out.println("\n==========================================");
        System.out.println("          ARREGLO ORDENADO");
        System.out.println("==========================================");

        Burbuja.imprimirArreglo(arreglo);
    }
}