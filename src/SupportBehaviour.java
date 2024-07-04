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
