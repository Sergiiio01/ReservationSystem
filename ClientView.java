import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientView extends View {

    private ReservationSystem system;
    private ArrayList<Reservation> reservations;

    public ClientView(ReservationSystem system) {
        super(system);
        this.reservations = new ArrayList<>();
    }

    @Override
    public void start(){
        do{

            Scanner sc = new Scanner(System.in);
            int type = 0;
            System.out.println("Please, select option: ");
            System.out.println("1. See reservations.");
            System.out.println("2. See reservables");
            System.out.println("3. Add reservation");
            System.out.println("4. exit");

            type = sc.nextInt();

            switch (type){
                case 1:
                    this.seeReservations();
                    break;
                case 2:
                    this.system.shorReservables();
                    break;
                case 3:
                    System.out.println("Introduce the name of the reservabble you want.");
                    sc.next();
                    String reservable = sc.nextLine();

                    Reservable r = this.system.findReservable(reservable);
                    if(r == null){
                        System.out.println("Sorry, that reservable does not exist.");
                        break;
                    }

                    else{
                        System.out.println("Introduce the date for making the reservation (YYY-MM-DD): ");
                        sc.next();
                        LocalDate date = LocalDate.parse(sc.nextLine());

                        this.system.addReserve(r, date);
                    }
                    break;
                case 4:
                    return;

            }

        }while (true);
    }

    public void seeReservations(){
        if (this.reservations.isEmpty()){
            System.out.println("No reservations done.");
        }

        for(Reservation r: this.reservations){
            r.displayInfo();
        }
    }
}
