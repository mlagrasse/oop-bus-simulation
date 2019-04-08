package tec;

//source sans la documentation produite par javadoc.

class PassagerIndecis implements Usager, Passager {

	private PassagerStandard p; 
	
	public PassagerIndecis(String nom, int destination) {
		p = new PassagerStandard(nom, destination);
	}
	
  public String nom() {
		return p.nom();
  }

  public boolean estDehors() { 
		return p.estDehors();
  }

  public boolean estAssis() {
		return p.estAssis();
  }

  public boolean estDebout() {
		return p.estDebout();
  }

  public void changerEnDehors() {
		p.changerEnDehors();
  }

  public void changerEnAssis() {
		p.changerEnAssis();
  }

  public void changerEnDebout() {
		p.changerEnDebout();
  }

  public void monterDans(Transport t) {
		VehiculeMontee v = (VehiculeMontee) t;

		if(v.aPlaceDebout() == true) {
			//Place debout Disponible
			//On demande une place
			v.monteeDemanderDebout(this);
			
			//Le passager peut se mettre debout dans bus
			//this.changerEnDebout(); C'est autobus qui fait ça
		}
		else {
			// On reste dehors
		}
  }

  public void nouvelArret(VehiculeArret bus, int numeroArret) {
		if ( numeroArret == p.getDestination()) {
			//Le passager doit descendre
			//On demande la sortie à l'autobis
			bus.arretDemanderSortie(this);
			//Le passager change en etat dehors
			//this.changerEnDehors(); C'est autobus qui fait ça
		}
		else {
			if (bus.aPlaceAssise() && this.estDebout()) {
				// Le passager est debout et une place assise est dispo
				// Le passager s'assied
				bus.arretDemanderAssis(this);
			}
			else if (bus.aPlaceDebout() && this.estAssis()) {
				// Le passager est assis et une place debout est dispo
				// Le passager se lève
				bus.arretDemanderDebout(this);
			}
		}
  }
  
  public String toString() {
	  // nom et dehors/assis/debout
	  return p.toString();
  }
}
