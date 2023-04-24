/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Eleitor;
import java.util.ArrayList;

public class Banco {
    
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
