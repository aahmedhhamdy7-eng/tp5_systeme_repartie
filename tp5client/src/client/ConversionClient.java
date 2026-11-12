package client;



import java.rmi.Naming;

import Service.Iconversion;

public class ConversionClient {
    public static void main(String[] args) {
        try {
            Iconversion stub = (Iconversion) Naming.lookup("rmi://localhost:1099/conversion");


            double res = stub.convertirMontant(500);
            System.out.println("500 EUR = " + res + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
