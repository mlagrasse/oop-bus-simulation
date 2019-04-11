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

    public static PassagerLunatique fairePassagerLunatique(String nom, int destination) {
        return new PassagerLunatique(nom, destination);
    }

    public static PassagerStresse fairePassagerStresse(String nom, int destination) {
        return new PassagerStresse(nom, destination);
    }
}