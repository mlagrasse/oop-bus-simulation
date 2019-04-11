package tec;

//source sans la documentation produite par javadoc.

class PassagerIndecis extends PassagerStandard {
	
	public PassagerIndecis(String nom, int destination) {
		super(nom, destination);
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
		if ( numeroArret == this.destination) {
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
}
