package tec;

//source sans la documentation produite par javadoc.

class PassagerLunatique extends PassagerAbstrait {
	
	public PassagerLunatique(String nom, int destination) {
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

    protected void faireChoixArret(VehiculeArret v, int arret) {
        if (v.aPlaceAssise() && this.estDebout()) {
            // Le passager est debout et une place assise est dispo
            // Le passager s'assied
            v.arretDemanderAssis(this);
        }
        else if (v.aPlaceDebout() && this.estAssis()) {
            // Le passager est assis et une place debout est dispo
            // Le passager se lève
            v.arretDemanderDebout(this);
        }
    }

}