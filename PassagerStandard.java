//source sans la documentation produite par javadoc.

class PassagerStandard {

	private String nom;
	private int destination;
	private Position pos; 
	
	public PassagerStandard(String nom, int destination) {
		pos = new Position();
		this.nom = nom;
		this.destination = destination;
	}
	
  public String nom() {
	return this.nom;
  }

  public boolean estDehors() { 
	return pos.estDehors();
  }

  public boolean estAssis() {
	return pos.estAssis();
  }

  public boolean estDebout() {
	return pos.estDebout();
  }

  public void changerEnDehors() {
	pos = pos.dehors();
  }

  public void changerEnAssis() {
	pos = pos.assis();
  }

  public void changerEnDebout() {
	pos = pos.debout();
  }

  public void monterDans(Autobus t) {
	if(t.aPlaceAssise() == true) {
		//Place assise Disponible
		//On demande une place
		t.monteeDemanderAssis(this);
		
		//Le passager peut s'assoir
		//this.changerEnAssis(); C'est autobus qui fait ça
	}
	else if(t.aPlaceDebout() == true) {
		//Place debout Disponible
		//On demande une place
		t.monteeDemanderDebout(this);
		
		//Le passager peut se mettre debout dans bus
		//this.changerEnDebout(); C'est autobus qui fait ça
	}
	else {
		//Pas de place
	}
  }

  public void nouvelArret(Autobus bus, int numeroArret) {
	if (numeroArret == this.destination) {
		//Le passager doit descendre
		//On demande la sortie à l'autobis
		bus.arretDemanderSortie(this);
		//Le passager change en etat dehors
		//this.changerEnDehors(); C'est autobus qui fait ça
	}
	else {
		//Passager ne descend pas 
	}
  }
  
  public String toString() {
	  // nom et dehors/assis/debout
	  return this.nom.toString() + " " + this.pos.toString();
  }
}
