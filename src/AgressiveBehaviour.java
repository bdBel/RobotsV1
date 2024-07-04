/**
 * La classe AgressiveBehaviour implémente le comportement agressif d'un robot.
 */
public class AgressiveBehaviour implements IBehaviour {

    /**
     * Retourne la commande de mouvement spécifique pour le comportement agressif.
     * @return La commande de mouvement (0 dans ce cas, car non utilisée).
     */
    @Override
    public int moveCommand() {
        return 0;
    }

    /**
     * Effectue le comportement de déplacement agressif du robot.
     * Affiche simplement "Comportement Agressif".
     */
    @Override
    public void move() {
        System.out.println("Comportement Agressif");
    }
}

