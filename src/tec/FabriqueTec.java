package tec;

public class FabriqueTec {
    public static Autobus faireAutobus(int nbPlaceAssise, int nbPlaceDebout) {
        return new Autobus(nbPlaceAssise, nbPlaceDebout);
    }

    public static NavetteTerminus faireNavetteTerminus(int nbPlaceAssise, int nbPlaceDebout, int terminus) {
        return new NavetteTerminus(nbPlaceAssise, nbPlaceDebout, terminus);
    }

    // Fatigue
    public static Fatigue faireFatigueCalme(String nom, int destination) {
        return new Fatigue(nom, destination, Calme.getInstance());
    }

    public static Fatigue faireFatigueNerveux(String nom, int destination) {
        return new Fatigue(nom, destination, Nerveux.getInstance());
    }

    public static Fatigue faireFatiguePrudent(String nom, int destination) {
        return new Fatigue(nom, destination, Prudent.getInstance());
    }

    public static Fatigue faireFatigueAgoraphobe(String nom, int destination) {
        return new Fatigue(nom, destination, Agoraphobe.getInstance());
    }

    public static Fatigue faireFatiguePoli(String nom, int destination) {
        return new Fatigue(nom, destination, Poli.getInstance());
    }

    // Tetu
    public static Tetu faireTetuCalme(String nom, int destination) {
        return new Tetu(nom, destination, Calme.getInstance());
    }

    public static Tetu faireTetuNerveux(String nom, int destination) {
        return new Tetu(nom, destination, Nerveux.getInstance());
    }

    public static Tetu faireTetuPrudent(String nom, int destination) {
        return new Tetu(nom, destination, Prudent.getInstance());
    }

    public static Tetu faireTetuAgoraphobe(String nom, int destination) {
        return new Tetu(nom, destination, Agoraphobe.getInstance());
    }

    public static Tetu faireTetuPoli(String nom, int destination) {
        return new Tetu(nom, destination, Poli.getInstance());
    }

    // Repos
    public static Repos faireReposCalme(String nom, int destination) {
        return new Repos(nom, destination, Calme.getInstance());
    }

    // Interdit
    // public static Repos faireReposNerveux(String nom, int destination) {
    //     return new Repos(nom, destination, Nerveux.getInstance());
    // }

    public static Repos faireReposPrudent(String nom, int destination) {
        return new Repos(nom, destination, Prudent.getInstance());
    }

    public static Repos faireReposAgoraphobe(String nom, int destination) {
        return new Repos(nom, destination, Agoraphobe.getInstance());
    }

    public static Repos faireReposPoli(String nom, int destination) {
        return new Repos(nom, destination, Poli.getInstance());
    }

    // Sportif
    public static Sportif faireSportifCalme(String nom, int destination) {
        return new Sportif(nom, destination, Calme.getInstance());
    }

    public static Sportif faireSportifNerveux(String nom, int destination) {
        return new Sportif(nom, destination, Nerveux.getInstance());
    }

    public static Sportif faireSportifPrudent(String nom, int destination) {
        return new Sportif(nom, destination, Prudent.getInstance());
    }

    public static Sportif faireSportifAgoraphobe(String nom, int destination) {
        return new Sportif(nom, destination, Agoraphobe.getInstance());
    }

    public static Sportif faireSportifPoli(String nom, int destination) {
        return new Sportif(nom, destination, Poli.getInstance());
    }
}