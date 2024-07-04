class WeirdBehaviour implements IBehaviour {

    @Override
    public int moveCommand() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Agressive Behaviour");
    }
}



