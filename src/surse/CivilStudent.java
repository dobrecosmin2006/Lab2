package surse;

/**
 * Created by Mihai on 10/27/2014.
 */
public class CivilStudent extends Student implements  ISinger {


    public CivilStudent( String name1 )
    {
        super(name1);
        setName((name1));

    }


    @Override
        public void sing()
    {
        System.out.println(getName() + " is singing without pathos");

    }

    @Override
        public boolean attendingCourse(String courseName)
    {
        if ( courseName == null)
        {
            return false;
        }

        return !(courseName.startsWith("Mil"));
    }
}
