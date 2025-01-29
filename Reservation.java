import java.time.LocalDate;

public class Reservation {

    private Reservable reservable;
    private LocalDate date;

    public Reservation(Reservable reservable, LocalDate date) {
        this.reservable = reservable;
        this.date = date;
    }

    public Reservable getReservable() {
        return reservable;
    }

    public void setReservable(Reservable reservable) {
        this.reservable = reservable;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void displayInfo(){
        System.out.println("Reservation of the next resource for: " + this.date);
        this.reservable.displayInfo();
    }
}
