package tec;

interface VehiculeArret {
  boolean aPlaceAssise();
  boolean aPlaceDebout();

  void arretDemanderDebout(Passager p);
  void arretDemanderAssis(Passager p);
  void arretDemanderSortie(Passager p);
}
