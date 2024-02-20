import methode.*;

public class App
{
    public static void main(String[] args)
    {
        Homme h = new Homme("Koto");
        h.voix();
        h.sexe();

        Femme f = new Femme("Soa");
        f.voix();
        f.sexe();
        f.manger();
    }
}