package Main;

import surse.HelloWorld;
import surse.Studenti;

/**
 * Created by Mihai on 10/23/2014.
 * <p/>
 * this is my class for Lab2
 */
public class Main {


    public static void main(String[] arguments) {
        /*
        *this is main class
         */
        HelloWorld.ShowMessage();
        Studenti Dobre = new Studenti("DobreMihaiCosmin",1);
        Dobre.ShowInfo();

        System.out.println(" Acesta a fost codul/output'ul pt Lab2");
    }


}
