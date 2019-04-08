package tec;

//source sans la documentation produite par javadoc.

class Autobus implements Transport, VehiculeArret, VehiculeMontee {

  private Jauge placeAssise;
  private Jauge placeDebout;
  private int arret;
  private Passager[] passagers;

  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    this.placeAssise = new Jauge(nbPlaceAssise);
    this.placeDebout = new Jauge(nbPlaceDebout);
    this.arret = 0;
    this.passagers = new Passager[nbPlaceAssise + nbPlaceDebout];
  }

  public boolean aPlaceAssise() {
    return placeAssise.estVert();
  }

  public boolean aPlaceDebout() {
    return placeDebout.estVert();
  }

  public void monteeDemanderAssis(Passager p) {
    placeAssise.incrementer();
    int i = 0;
    while (passagers[i] != null) {
      i++;
    }
    passagers[i] = p;
    p.changerEnAssis();
  }

  public void monteeDemanderDebout(Passager p) {
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
    for (Passager passager : passagers) {
		// Un passager peut être à null : tester si le passager existe !!!
		if (passager != null) {
			passager.nouvelArret(this, arret);
		}
    }
  }

  public void allerArretSuivantNavetteTerminus(int terminus) {
    this.arret++;
    if (this.arret == terminus) {
        for (Passager passager : this.passagers) {
            // Un passager peut être à null : tester si le passager existe !!!
            passager.changerEnDehors();
        }
        this.passagers = new Passager[this.passagers.length];
        this.placeAssise.vider();
        this.placeDebout.vider();
    }
  }

  public void arretDemanderAssis(Passager p) {
    placeAssise.incrementer();
    placeDebout.decrementer();
    p.changerEnAssis();
  }

  public void arretDemanderDebout(Passager p) {
    placeAssise.decrementer();
    placeDebout.incrementer();
    p.changerEnDebout();
  }

  public void arretDemanderSortie(Passager p) {
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
