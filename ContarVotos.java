import java.io.*;
import java.util.*;

public class ContarVotos {
    
    public static void main(String[] args) {


        HashMap<String, Integer> votos = new HashMap<String, Integer>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("votos.txt"));
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (votos.containsKey(linha)) {
                    votos.put(linha, votos.get(linha) + 1);
                } else {
                    votos.put(linha, 1);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não há votos");
        } catch (IOException e) {
            e.printStackTrace();
        }
        


        if (votos.isEmpty()) {
            System.out.println("Não há votos");
            return;
        }
        


        List<String> atoresMaisVotados = new ArrayList<String>();
        int votosDoAtorMaisVotado = 0;
        for (String ator : votos.keySet()) {
            int numVotos = votos.get(ator);
            if (numVotos > votosDoAtorMaisVotado) {
                atoresMaisVotados.clear();
                atoresMaisVotados.add(ator);
                votosDoAtorMaisVotado = numVotos;
            } else if (numVotos == votosDoAtorMaisVotado) {
                atoresMaisVotados.add(ator);
            }
        }
        


        if (atoresMaisVotados.size() == 1) {
            String atorMaisVotado = atoresMaisVotados.get(0);
            System.out.println(atorMaisVotado + " VENCEU com " + votosDoAtorMaisVotado + " votos!");
        } else {
            System.out.println("Ocorreu um empate entre os atores:");
            for (String ator : atoresMaisVotados) {
                System.out.println("- " + ator);
            }
        }
    }
}
