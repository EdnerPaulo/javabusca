package pesquisas;

public class BuscaSequencial {
    public static int busca(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {// array.length e o tamanho do vertor e onde tem
        	// i é o valor inicial do vetor
            if (array[i] == valor) {// == e valor de igual
                return i; // Retorna o índice do elemento encontrado
            }
        }
        return -1; // Retorna -1 se o elemento não for encontrado
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11,13,15};// array variedade
        int valor = 7;

        int resultado = busca(array, valor);
        if (resultado != -1) {// != diferente
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
}


