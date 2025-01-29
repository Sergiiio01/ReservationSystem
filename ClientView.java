import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientView extends View {


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
            System.out.println("\n\nPlease, select option: ");
            System.out.println("1. See reservations.");
            System.out.println("2. See reservables");
            System.out.println("3. Add reservation");
            System.out.println("4. exit");

            type = sc.nextInt();
            sc.nextLine();

            switch (type){
                case 1:
                    this.seeReservations();
                    break;
                case 2:
                    this.system.shorReservables();
                    break;
                case 3:
                    System.out.println("Introduce the name of the reservable you want.");
                    String reservable = sc.nextLine();

                    Reservable r = this.system.findReservable(reservable);
                    if(r == null){
                        System.out.println("Sorry, that reservable does not exist.");
                        break;
                    }

                    else{
                        System.out.println("Introduce the date for making the reservation (YYY-MM-DD): ");

                        LocalDate date = LocalDate.parse(sc.nextLine());

                        this.system.addReserve(r, date);
                        this.reservations.add(new Reservation(r, date));
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
