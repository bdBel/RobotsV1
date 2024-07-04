/**
 * Classe principale RobotApp pour la démonstration des comportements de différents robots.
 */
public class RobotApp {

    /**
     * Méthode principale pour exécuter le programme de démonstration.
     *
     * <p>
     * Classe Robot est fermée à la modification mais ouverte à l'extension.
     * Principe Open-Closed (SOLID) appliqué.
     * Utilisation de couplage faible plutôt que fort.
     * Pas d'utilisation d'héritage direct avec les classes Robot normales, afin de maintenir la cohérence entre les versions du logiciel.
     *
     * <p>
     * Polymorphisme : des robots de types différents se comportent de la même manière.
     * Ce n'est pas du polymorphisme.
     * Les robots r1, r2, r4 ont des mouvements différents malgré leur type différent.
     * Utilisation du design pattern Stratégie plutôt que du polymorphisme.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans cet exemple).
     */
    public static void main(String[] args) {
        System.out.println("       -----------         ");

        // Création de différents robots avec des comportements initiaux
        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("Agressive Robot");

        Robot r4 = new Robot("robot gentille");
        r4.setStrategy(new AgressiveBehaviour());

        System.out.println("       -----------         ");
        System.out.println("Changement de comportement");
        System.out.println("       -----------         ");

        // Modification des comportements des robots
        r1.setStrategy(new DefensiveBehaviour());
        r2.setStrategy(new AgressiveBehaviour());
        r3.setStrategy(new NormalBehaviour());
        r2.setStrategy(new NormalBehaviour());
        r4.setStrategy(new AgressiveBehaviour());

        // Exécution des déplacements des robots
        r1.move();
        r3.move();
        r4.move();
    }
}
