package tec;

public class NavetteTerminus implements Transport, VehiculeMontee {
    
  private Autobus a;
  private int terminus;

  public NavetteTerminus(int nbPlaceAssise, int nbPlaceDebout, int terminus) {
    this.a = new Autobus(nbPlaceAssise, nbPlaceDebout);
    this.terminus = terminus;
  }

  public boolean aPlaceAssise() {
    return a.aPlaceAssise();
  }

  public boolean aPlaceDebout() {
    return a.aPlaceDebout();
  }

  public void monteeDemanderAssis(Passager p) {
    a.monteeDemanderAssis(p);
  }

  public void monteeDemanderDebout(Passager p) {
    a.monteeDemanderDebout(p);
  }

  public void allerArretSuivant() {
    a.allerArretSuivantNavetteTerminus(this.terminus);
  }
  
  public String toString() {
	  return a.toString();
  }
}