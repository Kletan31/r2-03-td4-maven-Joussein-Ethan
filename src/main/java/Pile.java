
public class Pile {
    private int[] elements;
    private int sommet;
    private int capacite;

    /**
     * Initialise une pile d'entiers avec une capacité maximale spécifiée.
     * @param pfCapacite capacité maximale de la pile
     */
    public Pile(int pfCapacite) {
        this.capacite = pfCapacite;
        this.elements = new int[pfCapacite];
        this.sommet = -1;
    }

    /**
     * Initialise une pile d'entiers avec une capacité maximale de 10.
     */
    public Pile() {
        this.capacite = 10;
        this.elements = new int[10];
        this.sommet = -1;
    }
    
    /**
     * Vérifie si la pile est vide.
     * @return true si la pile est vide, sinon false
     */
    public boolean estVide() {
        return sommet == -1;
    }

    /**
     * Vérifie si la pile est pleine.
     * @return true si la pile est pleine, sinon false
     */
    public boolean estPlein() {
        return sommet == capacite - 1;
    }

    /**
     * Empile un élément elem, puis retourne la pile
     * Précondition : ! this.estPlein()
     * Lève une exception sinon
     * @throws IllegalStateException si la pile est pleine
     * @param pfElem l'élément à empiler
     * @return la pile après l'empilement
     */
    public Pile empiler(int pfElem) throws IllegalStateException {
        if (estPlein()) {
            throw new IllegalStateException("Impossible d'empiler : la pile est pleine");
        }
        elements[++sommet] = pfElem;
        return this;
    }

    /**
     * Récupère le sommet, le dépile puis le retourne
     * Précondition : ! this.estVide()
     * Lève une exception sinon
     * @throws IllegalStateException si la pile est vide
     * @return l'élément dépilé
     */
    public int depiler() {
        if (estVide()) {
            throw new IllegalStateException("Impossible de dépiler : la pile est vide");
        }
        return elements[sommet--];
    }

    /**
     * Retourne l'actuel sommet
     * Précondition : ! this.estVide()
     * Lève une exception sinon
     * @throws IllegalStateException si la pile est vide
     * @return l'élément au sommet de la pile
     */
    public int sommet() {
        if (estVide()) {
            throw new IllegalStateException("Impossible d'obtenir le sommet : la pile est vide");
        }
        return elements[sommet];
    }

    /**
     * Vide tous les éléments de la Pile
     */
    public void vider() {
        sommet = -1;
    }
}
