
/**
 * Realisation d'une jauge avec un intervalle d'entiers.
 * <p>
 * Un objet Jauge definit une position dans un intervalle [0, max[.
 * La position d'une jauge n'est pas limite aux valeurs dans l'intervalle.
 * <p>
 * L'etat d'une jauge correspond a la position par rapport a
 * l'intervalle [0, max[.
 * Une jauge definit deux etats :
 * <ul>
 * <li>rouge position de la jauge superieure a l'intervalle,
 * <li>vert position de la jauge dans l'intervalle,
 * </ul>
 *
 * @author georgy
 * @since 2006-2016
 */
class Jauge {
  private int valeur;
  private final int max;

  /**
   * Construit une instance en precisant la valeur max de l'intervalle
   * [0, max[ et la position de depart de la Jauge.
   *
   * La position de depart n'est pas forcement dans l'intervalle
   * [0, max[.
   *
   * @param max valeur maximale > 0 de l'intervalle.
   * @param depart   valeur initiale de la position de la Jauge.
   */
  public Jauge(int max, int depart) {
    this.valeur = depart;
    this.max = max;
  }
  
  public Jauge(int vigieMax) {
	this(vigieMax, 0);
  }

  /**
   * La position de la jauge est-elle au-dessus de l'intervalle ?
   *
   * @return vrai si niveau >=  vigieMax.
   *
   */
  public boolean estRouge() {
    return valeur < 0 || valeur >= max;
  }

  /**
   * La position de la jauge est-elle dans l'intervalle ?
   *
   * @return vrai si niveau appartient a [0, vigieMax[.
   *
   */
  public boolean estVert() {
    return valeur >= 0 && valeur < max;
  }

  /**
   * Incremente la position de la jauge.
   * La position peut devenir superieur a max.
   */
  public void incrementer() {
    valeur ++;
  }

  /**
   * Decremente la position de la jauge.
   */
  public void decrementer() {
    valeur--;
 }

  /**
   * Cette methode est heritee de la classe {@link java.lang.Object}.
   * Tres utile pour le debogage, elle permet de fournir une
   * chaine de caracteres correspondant a l'etat d'un objet.
   * Mais, il faut adapter son code a chaque classe.
   */
  @Override
  public String toString() {
    return "<" + valeur + " [0," + max + "[>";
  }
}
