public class Main {
    public static void main(String[] args) {
        Pile maPile = new Pile(10);
        if (!maPile.estVide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.estVide()) System.out.println("NOK");

        int elem = maPile.depiler();
        if (!maPile.estVide()) System.out.println("NOK");
        if (elem != 5) System.out.println("NOK");

        Pile maPilePleine = new Pile(1);
        maPilePleine.empiler(3);
        if (!maPilePleine.estPlein()) System.out.println("NOK");

        maPile.vider();
        if (!maPile.estVide()) System.out.println("NOK");

        maPile.empiler(3).empiler(5);
        if (maPile.sommet() != 5) System.out.println("NOK");

        Pile p = new Pile();
        p.empiler(4);
        int element = p.depiler();
        System.out.println(element);
     }
}