/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos ", "tachas"};
        Double[] prezo = {3.0, 4.0, 5.0};

        try {

            FileOutputStream leer = new FileOutputStream("/home/oracle/Desktop/ProbaExer4/exerc13.txt");
            ObjectOutputStream escribir = new ObjectOutputStream(leer);

            for (int i = 0; i < 3; i++) {
                Product obj = new Product(cod[i], desc[i], prezo[i]);
                escribir.writeObject(obj);
            }
            escribir.writeObject(null);
            escribir.close();
            leer.close();

            FileInputStream leer2 = new FileInputStream("/home/oracle/Desktop/ProbaExer4/exerc13.txt");
            ObjectInputStream escribir2 = new ObjectInputStream(leer2);

            Object lectura = 0;

            while (lectura != null) {
                lectura = escribir2.readObject();
                System.out.println(lectura);
            }

            escribir2.close();
            leer2.close();

        } catch (FileNotFoundException ex) {

        }
    }

}
