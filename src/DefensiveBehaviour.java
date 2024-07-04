/**
 * La classe DefensiveBehaviour implémente le comportement défensif d'un robot.
 */
public class DefensiveBehaviour implements IBehaviour {

    /**
     * Retourne la commande de mouvement spécifique pour le comportement défensif.
     * @return La commande de mouvement (0 dans ce cas, car non utilisée).
     */
    @Override
    public int moveCommand() {
        return 0;
    }

    /**
     * Effectue le comportement de déplacement défensif du robot.
     * Affiche simplement "Defensive Behaviour".
     */
    @Override
    public void move() {
        System.out.println("Comportement Défensif");
    }
}

