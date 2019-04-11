package tec;

/**
 * Cette classe represente la position d'un passager par rapport a un transport.
 * Une position a trois etats possibles : assis dans un transport, debout dans
 * un transport et dehors d'un transport.
 *
 * Les instances de cette classe sont des objets constants.
 *
 * @author Georgy
 * @since 2007-2016
 **/
class Position {

  static final private Position DEHORS = new Position();
  static final private Position ASSIS = new Position();
  static final private Position DEBOUT = new Position();

  // private final int DEHORS = 1;
  // private final int ASSIS = 2;
  // private final int DEBOUT = 3;

  // private final int courant;

  public static Position getDehors() {
    return DEHORS;
  }

  public static Position getAssis() {
    return ASSIS;
  }

  public static Position getDebout() {
    return DEBOUT;
  }

  /**
   * construit une l'instance dans la position dehors.
   * 
   */
  private Position() {
    // courant = DEHORS;
  }

  /**
   * Construit une instance en precisant une des positions du passager.
   * 
   * @param e valeur d'une des positions.
   */
  // private Position(int e) {
  // courant = e;
  // }

  /**
   * La position est-elle dehors ?
   *
   * @return vrai si l'etat de l'instance est dehors;
   */
  public boolean estDehors() {
    return this.equals(DEHORS);
  }

  /**
   * La position est-elle assis ?
   *
   * @return vrai si l'etat de l'instance est assis;
   */
  public boolean estAssis() {
    return this.equals(ASSIS);
  }

  /**
   * La position est-elle debout ?
   *
   * @return vrai si l'etat de l'instance est debout;
   */
  public boolean estDebout() {
    return this.equals(DEBOUT);
  }

  /**
   * La position est-elle assis ou debout ?
   *
   * @return vrai si la position est assis ou debout.
   */
  public boolean estInterieur() {
    return !this.equals(DEHORS);
  }

  /**
   * Fournit une position assis.
   *
   * @return instance dans l'etat assis.
   */
  public Position assis() {
    return ASSIS;
  }

  /**
   * Fournit une position debout.
   *
   * @return instance dans l'etat debout.
   */
  public Position debout() {
    return DEBOUT;
  }

  /**
   * Fournit une position dehors.
   *
   * @return instance dans l'etat dehors.
   */
  public Position dehors() {
    return DEHORS;
  }

  /**
   * Cette methode est heritee de la classe {@link java.lang.Object}. Tres utile
   * pour le debogage, elle permet de fournir une chaine de caracteres
   * correspondant a l'etat d'un objet. Mais, il faut adapter le code de cette
   * methode a chaque classe.
   */
  @Override
  public String toString() {
    String nom = null;
    if (this.estDehors())
      nom = "endehors";
    else if (this.estAssis())
      nom = "assis";
    else if (this.estDebout())
      nom = "debout";

    return "<" + nom + ">";
  }
}
