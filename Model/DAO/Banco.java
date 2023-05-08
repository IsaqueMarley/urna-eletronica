package Model.DAO;
import Model.Eleitor;
import Controller.HashGenerator;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Banco {
    //criando um arrayList
    public static ArrayList<Eleitor> eleitorList;

    public static void inicia(){

        //Instancia os Objetos
        eleitorList = new ArrayList<Eleitor>();

        //lendo o arquivo txt e comparando o hash

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("eleitor.txt"));
            String line = leitor.readLine();
            while (line != null){
                String[] termos = line.split(";");
                System.out.println(HashGenerator.hashStr(termos[0]+termos[1]));
                System.out.println("hash salva: "+ termos[2]);
                if(termos[2].equals(HashGenerator.hashStr(termos[0]+termos[1]))) {
                    Eleitor temp = new Eleitor(termos[0], termos[1]);
                    System.out.println("foi");
                    eleitorList.add(temp);
                }else{
                    System.out.println("Hash alterado");
                }
                line = leitor.readLine();
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        try {
            File file = new File("eleitor.txt");
            String hash = HashGenerator.hashFile(file);
            System.out.println("Hash SHA256 do arquivo: " + hash);

            String HashEsperado = "5f8726e82ae10144e8ce31fcc15a9bc51d46f3a4660bea794e92ebc2a2a973ca";

            if(hash.equals(HashEsperado)){
                System.out.println("Hash Valido");
            }else{
                System.out.println("Hash Invalido");
            }

        } catch (NoSuchAlgorithmException | IOException e) {
            System.err.println("Erro ao gerar hash: " + e.getMessage());
        }


    }

}
