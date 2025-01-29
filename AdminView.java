import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminView extends View {


    public AdminView(ReservationSystem system) {
        super(system);
    }

    @Override
    public void start() {
        do {

            Scanner sc = new Scanner(System.in);
            int type = 0;
            System.out.println("\n\nPlease, select option: ");
            System.out.println("1. See reservations.");
            System.out.println("2. See reservables");
            System.out.println("3. Add reservable");
            System.out.println("4. exit");
            try {
                type = sc.nextInt();
                sc.nextLine();

                switch (type) {
                    case 1:
                        this.system.showReservations();
                        break;
                    case 2:
                        this.system.shorReservables();
                        break;
                    case 3:
                        System.out.println("Introduce 1 if you want to create a restaurant table or 2 if you want to introduce a meeting room.");
                        int tipo = sc.nextInt();
                        sc.nextLine();
                        if (tipo == 1) {
                            this.system.addReservable(this.createTable());
                        } else if (tipo == 2) {
                            this.system.addReservable(this.createRoom());
                        }
                        break;
                    case 4:
                        return;

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        } while (true);
    }

    public RestaurantTable createTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the name for the table: ");
        String name = sc.nextLine();

        System.out.println("Introduce the number of places the table will have: ");
        while (true) {
            try {
                int places = sc.nextInt();
                sc.nextLine();
                return new RestaurantTable(name, places);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }

    }

    public MeetingRoom createRoom() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the name for the room: ");
        String name = sc.nextLine();


        int places = -1;
        while (places != 0 && places != 1) {
            System.out.println("Introduce 1 if it will have TV and 0 if not: ");

            if (sc.hasNextInt()) {
                places = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input. Please enter 0 or 1.");
                sc.next();
            }
        }
        if (places == 0) {
            return new MeetingRoom(name, true);
        } else {
            return new MeetingRoom(name, false);
        }
    }
}
