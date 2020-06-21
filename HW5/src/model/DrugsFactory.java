package model;

public class DrugsFactory {
    public static DrugsServ getgroup(int c)
    {
        switch (c)
        {
            case 1:
                return new AasabVaRavan ();
            case 2:
                return new GhalbVaOrough ();
            case 3:
                return new Govareshi ();
            default:
                return null;
        }
    }
}
