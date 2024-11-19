package pesquisas;

import java.util.HashMap;// bibioteca e classe

public class HashingExemplo {// hashing e uma tabela/lista encadeada
    public static void main(String[] args) {
        HashMap<String, Integer> tabelaHash = new HashMap<>();

        // Inserindo valores na tabela hash
        tabelaHash.put("Alice", 25);// put e incluir
        tabelaHash.put("Bob", 30);
        tabelaHash.put("Carol", 35);

        // Pesquisa usando a chave
        String chave = "Bob";
        if (tabelaHash.containsKey(chave)) {//chave e o objeto
            System.out.println("Idade de " + chave + ": " + tabelaHash.get(chave));
        } else {
            System.out.println(chave + " não encontrado.");
        }
    }
}



