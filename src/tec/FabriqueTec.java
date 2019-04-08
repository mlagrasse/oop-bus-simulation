package tec;

public class FabriqueTec {
    public static Autobus faireAutobus(int nbPlaceAssise, int nbPlaceDebout) {
        return new Autobus(nbPlaceAssise, nbPlaceDebout);
    }

    public static NavetteTerminus faireNavetteTerminus(int nbPlaceAssise, int nbPlaceDebout, int terminus) {
        return new NavetteTerminus(nbPlaceAssise, nbPlaceDebout, terminus);
    }

    public static PassagerStandard fairePassagerStandard(String nom, int destination) {
        return new PassagerStandard(nom, destination);
    }

    public static PassagerIndecis fairePassagerIndecis(String nom, int destination) {
        return new PassagerIndecis(nom, destination);
    }
}