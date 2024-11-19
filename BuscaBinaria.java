package pesquisas;

import java.util.Arrays;
public class BuscaBinaria {
    public static int buscaBinaria(int[] array, int valor) {
        int inicio = 0;
        int fim = array.length - 1;// puxa a ultima posiçao do ponteiro
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == valor) {
                return meio; // Retorna o índice do elemento encontrado
            } else if (array[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11};
        Arrays.sort(array);// sort e uma procedure de procedimento para chamar um afuncção vazia
        // Certifica-se de que o array está ordenado
        int valor = 7;
        int resultado = buscaBinaria(array, valor);
        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }}
