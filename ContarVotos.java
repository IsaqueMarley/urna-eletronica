import java.io.*;
import java.util.*;
import java.security.*;
import java.util.List;

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
            System.out.println("Arquivo não foi encontrado! :(");
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




            // Ler o arquivo e armazenar seu conteúdo em um byte array
            byte[] arquivo = null;
            try {
                FileInputStream inputStream = new FileInputStream("votos.txt");
                arquivo = new byte[inputStream.available()];
                inputStream.read(arquivo);
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não foi encontrado! :(");
            } catch (IOException e) {
                e.printStackTrace();
            }
        
            // Gerar o hash do arquivo
            String hash = null;
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] digest = md.digest(arquivo);
                hash = bytesToHex(digest); // Converte o array de bytes em uma string hexadecimal
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        
            System.out.println("Hash do arquivo votos.txt: " + hash);
        
            // Comparar o hash com o hash criado na classe Login
            String hashLogin = hash;
            if (hash.equals(hashLogin)) {
                System.out.println("Os hashes são iguais!");
            } else {
                System.out.println("Os hashes são diferentes :(");
            }
        }
        
        // Método para converter um array de bytes em uma string hexadecimal
        private static String bytesToHex(byte[] bytes) {
            StringBuilder result = new StringBuilder();
            for (byte b : bytes) {
                result.append(String.format("%02x", b));
            }
            return result.toString();
        
        




    }
}
