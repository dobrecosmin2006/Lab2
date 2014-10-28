package surse;

/**
 * Created by Mihai on 10/27/2014.
 */
public abstract class Student {

    private String mName;

    public Student ( String Name)
    {
        mName = Name;
    }


    public abstract boolean attendingCourse ( String CourseName);

    public String getName()
    {
        return mName;
    }

    public void setName ( String name)
    {
        this.mName = name;
    }

}
