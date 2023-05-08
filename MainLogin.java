import Viwe.Login;

import java.io.FileWriter;
import java.io.IOException;

public class MainLogin {
    public static void main(String[]args){
        //Limpa o arquivo de votos
        try {
            FileWriter arquivo = new FileWriter("votos.txt", false);
            arquivo.write(  "\n");
            arquivo.close();
        } catch (IOException ex) {
            ex.printStackTrace(); // escrever no console qual foi o erro
        }
        new Login();
    }
}
