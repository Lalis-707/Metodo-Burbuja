# Ordenamiento por Burbuja en Java

Práctica de la Unidad 05 — Estructura de Datos
Instituto Tecnológico Superior de Xalapa · Ingeniería en Sistemas Computacionales

## Resumen del tema

El **ordenamiento por burbuja** (*Bubble Sort*) es un algoritmo simple que ordena una lista comparando elementos **adyacentes** e intercambiándolos si están en el orden incorrecto. En cada pasada, el elemento mayor de la parte no ordenada "flota" como una burbuja hasta el final del arreglo, de ahí su nombre.

| Característica | Valor |
|---|---|
| Mejor caso (arreglo ya ordenado, con bandera) | O(n) |
| Caso promedio y peor caso | O(n²) |
| Espacio adicional | O(1) (ordena en el mismo arreglo) |
| Estable | Sí (no cambia el orden de elementos iguales) |

Es fácil de entender y programar, por lo que es muy usado para fines didácticos, pero es poco eficiente con arreglos grandes.

## Resumen del código

El programa tiene dos clases en el paquete `Estructuras_Lineales.Unidad05y06.Burbuja`:

- **`Burbuja.java`**
  - `ordenar(int[] arr)`: ordena el arreglo de forma ascendente con dos ciclos anidados. El ciclo externo controla las pasadas. El interno compara `arr[j]` con `arr[j + 1]` y los intercambia con una variable temporal si están desordenados. Se recorre hasta `n - i - 1` porque los últimos `i` elementos ya quedaron en su lugar.
  - **Optimización:** la bandera booleana `intercambiado` indica si hubo cambios en la pasada. Si no hubo ninguno, el arreglo ya está ordenado y el ciclo se detiene con `break`.
  - `imprimirArreglo(int[] arr)`: método auxiliar que muestra el arreglo en consola con el formato `[a, b, c]`.
- **`Main.java`**: crea el arreglo de ejemplo `{6, 1, 5, 8, 3, 2, 7, 4}`, lo imprime, llama a `Burbuja.ordenar` y vuelve a imprimirlo ya ordenado.

### Seguimiento con el arreglo de ejemplo

| Pasada | Estado del arreglo |
|---|---|
| Original | `[6, 1, 5, 8, 3, 2, 7, 4]` |
| 1 | `[1, 5, 6, 3, 2, 7, 4, 8]` |
| 2 | `[1, 5, 3, 2, 6, 4, 7, 8]` |
| 3 | `[1, 3, 2, 5, 4, 6, 7, 8]` |
| 4 | `[1, 2, 3, 4, 5, 6, 7, 8]` |
| 5 | Sin intercambios → termina |

## Requisitos

- [Git](https://git-scm.com/)
- JDK 8 o superior (verifica con `java -version` y `javac -version`)

## Clonar el repositorio

```bash
git clone https://github.com/Lalis-707/Metodo-Burbuja.git
cd Metodo-Burbuja
```

## Compilar

Desde la raíz del repositorio:

```bash
mkdir out
javac -encoding UTF-8 -d out src/Estructuras_Lineales/Unidad05y06/Burbuja/*.java
```

## Ejecutar

```bash
java -cp out Estructuras_Lineales.Unidad05y06.Burbuja.Main
```

También puedes abrir el proyecto en IntelliJ IDEA, abrir `Main.java` y presionar el botón verde de Run.

## Salida esperada

```
==========================================
          ARREGLO ORIGINAL
==========================================
[6, 1, 5, 8, 3, 2, 7, 4]

==========================================
          ARREGLO ORDENADO
==========================================
[1, 2, 3, 4, 5, 6, 7, 8]
```

## Estructura

```
src/Estructuras_Lineales/Unidad05y06/Burbuja/
├── Burbuja.java   # algoritmo (ordenar) y método auxiliar (imprimirArreglo)
└── Main.java      # programa principal con el arreglo de ejemplo
```

## Autor

Lalis-707 — 257O01401
Docente: Víctor Hugo Vásquez Herrera
