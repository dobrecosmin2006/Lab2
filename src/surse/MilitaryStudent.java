package surse;

/**
 * Created by Mihai on 10/27/2014.
 */
public class MilitaryStudent extends  Student implements  ISinger, IEating {


    public boolean isOfficer = false;

    public  MilitaryStudent ( String name1 )
    {
        super(name1);
        setName((name1));
    }

    public boolean isOfficer()
    {
        return isOfficer;
    }

    @Override
    public void eat()
    {
        // eat :) 
    }

    @Override
    public void setName(String name){
        super.setName(name);
        if ( name != null && ( name.contains("Slt") || name.contains("Lt")))
        {
            isOfficer = true;
        }
    }
    @Override
        public boolean attendingCourse(String course)
    {
        if (course == null)
             return false;


        return course.startsWith("Mil");
    }

    @Override
    public void sing()
    {
        System.out.println(getName()+ " is singing like a military ");
    }

}
