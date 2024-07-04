class Main {

    public static void main(String[] args) {
//classe Robot est ferme a modification , masi open
        //OPEN CLOSE PRINCIPLE(SOLID)
        //OOUVERT a l'extension.
       // c'st un couplage faible vs un fort
       //on a pas utilisé heritage.
       // pas classes robot nomral extends. car sinon on doit
       // modicfier la classe robot a change fois qu'on ajoute un robot
       // ->coherence entre differente versions du logiciel
       //
        System.out.println("       -----------         ");

        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("George v.2.1");
        Robot r3 = new Robot("Agressive Robot");

        Robot r4 = new Robot("robot gentille");
        r4.setStrategy(new AgressiveBehaviour());

        System.out.println("       -----------         ");
        System.out.println("Changement de comportement");
        System.out.println("       -----------         ");
        r1.setStrategy(new DefensiveBehaviour());
        r2.setStrategy(new AgressiveBehaviour());
        r3.setStrategy(new NormalBehaviour());
        r2.setStrategy(new NormalBehaviour());
        r4.setStrategy(new AgressiveBehaviour());
        r3.setStrategy(new WeirdBehaviour());
        //polymorphisme= des robots de type different qui se comportenent de la meme maniere
     //ce n'eset pas du poly morphisme.
        //r1 , r2 r4 , le move de la statefite est differentes.
        //on utilise plusôt le design pattern strategie pas le poly ?

        r1.move();
        r3.move();
        r4.move();
           }
}
//le comportement ne va pas etre ASSOCIE au robot.

class Robot {
    private IBehaviour strategy;
    private String name;

    // Contruscteur avec parametres
    public Robot(String name) {
        this.name = name;
        this.strategy = new NormalBehaviour();
    }
     public void move(){
         System.out.println("robot " + this.name + " move");
     }

    // Constructeur par default
    public Robot(){}

    // Constructeur par copie
    // Utilisation: r2 = new Robot(r1)
    public Robot(Robot r){}

    public void setStrategy(IBehaviour strategy) {
        this.strategy = strategy;
    }

    }

interface IBehaviour {
    public int moveCommand();
    void move();
}

class AgressiveBehaviour implements IBehaviour {

    @Override
    public int moveCommand() {

        return 0;
    }

    @Override
    public void move() {
        System.out.println("Agressive Behaviour");
    }
}


class DefensiveBehaviour implements IBehaviour{

    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Defensive Behaviour");
    }
}

class NormalBehaviour implements IBehaviour {

    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("I'm a NormalBehaviour");
    }
}
class SupportBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("I'm a SupportRobot");
    }

}


