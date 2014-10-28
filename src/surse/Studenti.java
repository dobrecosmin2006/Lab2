package surse;

/**
 * Created by Mihai on 10/23/2014.
 */
public class Studenti {


    private String NumeStudent;
    private int AtmMilitar;     // 0 - taxa 1 - militar


    public Studenti(){}
    public Studenti(String NumeNou, int Atm_da_nu){
        NumeStudent = NumeNou;
        AtmMilitar = Atm_da_nu;
    }
    public void ShowInfo(){
        System.out.println("Nume: " + NumeStudent + "Taxa/Militar: " + AtmMilitar);
    }



}
