package tec;

//source sans la documentation produite par javadoc.

class PassagerStandard extends PassagerAbstrait {
	
	public PassagerStandard(String nom, int destination) {
		super(nom, destination);
	}

  protected void faireChoixMontee(VehiculeMontee v) {
	if(v.aPlaceAssise() == true) {
		//Place assise Disponible
		//On demande une place
		v.monteeDemanderAssis(this);
		
		//Le passager peut s'assoir
		//this.changerEnAssis(); C'est autobus qui fait ça
	}
	else if(v.aPlaceDebout() == true) {
		//Place debout Disponible
		//On demande une place
		v.monteeDemanderDebout(this);
		
		//Le passager peut se mettre debout dans bus
		//this.changerEnDebout(); C'est autobus qui fait ça
	}
	else {
		//Pas de place, reste dehors
	}
  }

  protected void faireChoixArret(VehiculeArret v, int arret) {}

}
