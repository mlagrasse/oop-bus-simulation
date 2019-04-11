package tec;

//source sans la documentation produite par javadoc.

class PassagerStresse extends PassagerAbstrait {
	
	public PassagerStresse(String nom, int destination) {
		super(nom, destination);
	}

// S'il est à 3 arrets ou moins : debout
	
	protected void faireChoixMontee(VehiculeMontee v) {
		if(v.aPlaceAssise() == true) {
			//Place debout Disponible
			//On demande une place
			v.monteeDemanderAssis(this);
            
			//Le passager peut se mettre debout dans bus
			//this.changerEnDebout(); C'est autobus qui fait ça
		}
		else {
			// On reste dehors
		}
	}
	
	protected void faireChoixArret(VehiculeArret v, int arret) {
		int destinationPassagerStresse = this.destination - 3;

		if (v.aPlaceDebout() && this.estAssis() && arret >= destinationPassagerStresse) {
			v.arretDemanderDebout(this);
		}
	}
}
