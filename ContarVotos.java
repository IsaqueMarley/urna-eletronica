import java.io.*;
import java.util.*;

public class ContarVotos {
    
    public static void main(String[] args) {

        // cria um hashmap com nome do ator e numeros de votos
        HashMap<String, Integer> votos = new HashMap<String, Integer>();
        System.out.println(votos);
        try {
           //eh um classe em Java lê o texto de um fluxo de entrada de caracteres,
           //armazenando caracteres em buffer para fornecer uma leitura eficiente
            BufferedReader leitor = new BufferedReader(new FileReader("votos.txt"));
            String linha;
            while ((linha = leitor.readLine()) != null) {

                if (votos.containsKey(linha)) {
                    
                    votos.put(linha, votos.get(linha) + 1);
                } else {
                    votos.put(linha, 1);
                }
            }
            leitor.close();
            System.out.println("AQUIIII: "+votos);

        }catch (FileNotFoundException ex) { //se o arquivo não for criado 
            System.out.println("Não há votos");
        } catch (IOException ex ) { // exibir no console qual erro seria
            ex.printStackTrace();
        }
        
        
        // Encontrando o ator mais votado
        String atorMaisVotado = "";
        int votosDoAtorMaisVotado = 0;
        System.out.println("votos"+ votos.keySet());

        for (String ator : votos.keySet()) { //keySet retorna as chaves do hashmap que no caso sao os atores
            int numVotos = votos.get(ator); // numVotos recebe o ator
            System.out.println("ator: "+ator);
            System.out.println(numVotos);
            if (numVotos > votosDoAtorMaisVotado) {
                atorMaisVotado = ator;
                votosDoAtorMaisVotado = numVotos;
            }
        }
        
         /*
         //criar uma verificao se com isEmpty pra ver se o arquivo esta vazio
            ou com ... se ele existe
         */
        
        System.out.println(atorMaisVotado + " VENCEU com " + votosDoAtorMaisVotado + " votos!");
    }
}
