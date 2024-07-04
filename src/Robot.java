

/**
 * La classe Robot représente un robot avec une stratégie comportementale variable.
 */
public class Robot {

    private IBehaviour strategy;
    private String name;

    /**
     * Constructeur avec paramètre pour initialiser un robot avec un nom donné et un comportement normal par défaut.
     * @param name Le nom du robot.
     */
    public Robot(String name) {
        this.name = name;
        this.strategy = new NormalBehaviour();
    }

    /**
     * Méthode pour déplacer le robot en utilisant sa stratégie comportementale actuelle.
     */
    public void move() {
        System.out.println("Le robot " + this.name + " se déplace.");
        strategy.move();
    }

    /**
     * Méthode pour définir la stratégie comportementale du robot.
     * @param strategy La nouvelle stratégie comportementale à définir.
     */
    public void setStrategy(IBehaviour strategy) {
        this.strategy = strategy;
    }

    // Les constructeurs ci-dessous sont commentés car ils ne sont pas utilisés dans cet exemple.
    /*
    // Constructeur par défaut
    public Robot() {
        this.strategy = new NormalBehaviour();
    }

    // Constructeur de copie
    public Robot(Robot r) {
        this.name = r.name;
        this.strategy = r.strategy; // Attention: ceci est une copie par référence
    }
    */

}
