public abstract class View {

    protected ReservationSystem system;

    public View(ReservationSystem system) {
        this.system = system;
    }

    public abstract void start();

}
