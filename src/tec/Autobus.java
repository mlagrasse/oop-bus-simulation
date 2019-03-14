package tec;

//source sans la documentation produite par javadoc.

public class Autobus {

  private Jauge placeAssise;
  private Jauge placeDebout;
  private int arret;
  private PassagerStandard[] passagers;

  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    this.placeAssise = new Jauge(nbPlaceAssise);
    this.placeDebout = new Jauge(nbPlaceDebout);
    arret = 0;
    passagers = new PassagerStandard[nbPlaceAssise + nbPlaceDebout];
  }

  public boolean aPlaceAssise() {
    return placeAssise.estVert();
  }

  public boolean aPlaceDebout() {
    return placeDebout.estVert();
  }

  public void monteeDemanderAssis(PassagerStandard p) {
    placeAssise.incrementer();
    int i = 0;
    while (passagers[i] != null) {
      i++;
    }
    passagers[i] = p;
    p.changerEnAssis();
  }

  public void monteeDemanderDebout(PassagerStandard p) {
    placeDebout.incrementer();
    int i = 0;
    while (passagers[i] != null) {
      i++;
    }
    passagers[i] = p;
    p.changerEnDebout();
  }

  public void allerArretSuivant() {
    arret++;
    for (PassagerStandard passager : passagers) {
		// Un passager peut être à null : tester si le passager existe !!!
		if (passager != null) {
			passager.nouvelArret(this, arret);
		}
    }
  }

  public void arretDemanderAssis(PassagerStandard p) {
    placeAssise.incrementer();
    placeDebout.decrementer();
    p.changerEnAssis();
  }

  public void arretDemanderDebout(PassagerStandard p) {
    placeAssise.decrementer();
    placeDebout.incrementer();
    p.changerEnDebout();
  }

  public void arretDemanderSortie(PassagerStandard p) {
    if (p.estDebout()) {
      placeDebout.decrementer();
    } else if (p.estAssis()){
      placeAssise.decrementer();
    }
    for (int i =0; i<passagers.length;i++) {
      if (p == passagers[i]) {
        passagers[i] = null;
      }
    }
    p.changerEnDehors();
  }
  
  public String toString() {
	  return "[" +
		"arret:" + this.arret + 
		", assis:" + this.placeAssise.toString() + 
		", debout:" + this.placeDebout.toString();
  }
}
