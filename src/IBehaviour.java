/**
 * L'interface IBehaviour définit les méthodes nécessaires pour tout comportement de robot.
 */
public interface IBehaviour {

    /**
     * Méthode pour obtenir la commande de mouvement spécifique pour chaque comportement.
     * @return La commande de mouvement (non utilisée dans ce programme).
     */
    public int moveCommand();

    /**
     * Méthode pour exécuter le comportement de déplacement spécifique du robot.
     */
    void move();
}

