package tec;

//source sans la documentation produite par javadoc.

abstract class PassagerAbstrait implements Usager, Passager {

	protected String nom;
	protected int destination;
	protected Position pos; 
	
	public PassagerAbstrait(String nom, int destination) {
		pos = Position.getDehors();
		this.nom = nom;
		this.destination = destination;
	}
	
  public String nom() {
	return this.nom;
	}
	
	public int getDestination() {
		return this.destination;
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
  
  public String toString() {
	  // nom et dehors/assis/debout
	  return this.nom.toString() + " " + this.pos.toString();
	}

	final public void monterDans(Transport t) {
		VehiculeMontee v = (VehiculeMontee) t;
	
		this.faireChoixMontee(v);
  }

  final public void nouvelArret(VehiculeArret bus, int numeroArret) {
		if (numeroArret == this.destination) {
			//Le passager doit descendre
			//On demande la sortie à l'autobus
			bus.arretDemanderSortie(this);
			//Le passager change en etat dehors
			//this.changerEnDehors(); C'est autobus qui fait ça
		}
		else {
			this.faireChoixArret(bus, numeroArret);
		}
	}
	
	abstract protected void faireChoixMontee(VehiculeMontee v);
	abstract protected void faireChoixArret(VehiculeArret v, int arret);
}
