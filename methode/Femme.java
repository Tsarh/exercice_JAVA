package methode;

public class Femme extends Humain implements Commune
{
    public Femme(String name)
    {
        m_Name = name;
    }

    public void sexe()
    {
        System.out.println("sexe feminin");
    }

    public void voix()
    {
        System.out.println("voix aguis");
    }

    public void manger()
    {
        System.out.println("je mange du riz car je suis un humain");
    }
}