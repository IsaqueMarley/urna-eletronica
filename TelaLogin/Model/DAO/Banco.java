package Model.DAO;
import Model.Eleitor;
import java.util.ArrayList;
public class Banco {
    //criando um arrayList
    public static ArrayList<Eleitor> eleitorList;



    public static void inicia(){

        //Instancia os Objetos
        eleitorList = new ArrayList<Eleitor>();

        //criando elementos
        Eleitor anderson = new Eleitor("79","9847539");

        //adicionando eleitor
        eleitorList.add(anderson);

    }
}
