package tec;

public class Calme implements PassagerArret {

    // Pattern singleton
    private static PassagerArret singletonInst = null;

    public static PassagerArret getInstance() {
        if (Calme.singletonInst == null)
            Calme.singletonInst = new Calme();
        return Calme.singletonInst;
    }

    private Calme() {}

    @Override
    public void choixChangerPlace(VehiculeArret v, int arret, Passager p) {}
    
}