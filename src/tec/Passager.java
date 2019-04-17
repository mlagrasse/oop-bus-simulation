package tec;

interface Passager {
    public String nom();

    public boolean estDehors();
    
    public boolean estAssis();
    public boolean estDebout();
  
    public void changerEnDehors();
    public void changerEnAssis();
    public void changerEnDebout();

    // Getter nécessaire pour choixChangerPlace de Prudent
    public int getDestination();

    public void nouvelArret(VehiculeArret t, int numeroArret);
  }
  