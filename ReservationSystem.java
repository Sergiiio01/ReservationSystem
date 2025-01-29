import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationSystem {

    private ArrayList<Reservable> reservables;
    private ArrayList<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void addReserve(Reservable reservable, LocalDate date){
        boolean flag = false;
        if(this.reservables.contains(reservable)){
            for(Reservation r: this.reservations){
                if(r.getReservable().getId() == reservable.getId() && r.getDate().equals(date)){
                    System.out.println("Sorry. The reservable is already filled for that date");
                    flag = true;
                    break;
                }

            }
            if(!flag){
                this.reservations.add(new Reservation(reservable, date));
            }
        }
        else{
            System.out.println("Sorry, that reservable does not exist, please try again.");
        }



    }
    public void addReservable(Reservable reservable){
        if(this.reservables.contains(reservable)){
            System.out.println("This reservable is already registered on the system");
        }

        else{
            this.reservables.add(reservable);
        }
    }

    public void cancelReservation(Reservation reservation){
        this.reservations.remove(reservation);
    }

    public void showReservations(){
        for(Reservation r: this.reservations){
            r.displayInfo();
        }
    }

    public void shorReservables(){
        for(Reservable r: this.reservables){
            r.displayInfo();
        }
    }

    public Reservable findReservable(String name){
        for(Reservable r: this.reservables){
            if(r.getName().equals(name)){
                return r;
            }

        }
        return null;
    }

}
