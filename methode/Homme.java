package methode;

public class Homme extends Humain
{
    public Homme(String name)
    {
        m_Name = name;
    }

    public void sexe()
    {
        System.out.println("sexe masculin");
    }

    public void voix()
    {
        System.out.println("voix grave");
    }
}