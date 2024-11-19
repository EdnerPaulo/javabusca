package pesquisas;

class No {
    int valor;
    No esquerda, direita;
    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
public class ArvoreBinaria {
    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);// recusividade serve para reutilizar
        //o codigo ate encontrar o valor
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        return atual;
    }

public boolean buscar(int valor) {
    return buscarRecursivo(raiz, valor);
}

private boolean buscarRecursivo(No atual, int valor) {
    if (atual == null) {
        return false;
    }
    if (valor == atual.valor) {
        return true;
    }
    return valor < atual.valor
            ? buscarRecursivo(atual.esquerda, valor)
            : buscarRecursivo(atual.direita, valor);
}

public static void main(String[] args) {
    ArvoreBinaria arvore = new ArvoreBinaria();
    arvore.inserir(10);// inserir valor na arvore dentro dos No
    arvore.inserir(5);
    arvore.inserir(15);
    arvore.inserir(7);
    arvore.inserir(25);
    arvore.inserir(9);

    int valor = 11;
    
    if (arvore.buscar(valor)) {
        System.out.println("Valor encontrado: " + valor);
    } else {
        System.out.println("Valor não encontrado.");
    }
}
}

