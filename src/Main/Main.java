package Main;

import surse.*;

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

        /* cod

        /*
        HelloWorld.ShowMessage();
        Studenti Dobre = new Studenti("DobreMihaiCosmin",1);
        Dobre.ShowInfo();

        System.out.println(" Acesta a fost codul/output'ul pt Lab2");

        */


        ISinger militaryStudent = new MilitaryStudent("Vasile");
        Student civilStudent = new CivilStudent("Vasile cel rau");
        MilitaryStudent officerStudent = new MilitaryStudent("Slt Vasile cel Ofiter");
        MilitaryStudent officerStudent2 = new MilitaryStudent(" Vasile cel Ofiter");


        try {

           System.out.println(" Military Student Name : " +  ((Student) militaryStudent).getName());

        }
        catch(ClassCastException e)
        {
            System.out.println(" Casting to Student failed : " + e );
        }

       System.out.println( officerStudent.isOfficer() );

       System.out.println( officerStudent2.isOfficer() );

        //   System.out.println(" Is he an officer? " + (officerStudent.isOfficer()) ? " YES !" :"NO!");
    }


}
