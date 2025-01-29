import java.util.Scanner;

public class AdminView extends View{



    public AdminView(ReservationSystem system) {
        super(system);
    }

    @Override
    public void start() {
        do{

            Scanner sc = new Scanner(System.in);
            int type = 0;
            System.out.println("Please, select option: ");
            System.out.println("1. See reservations.");
            System.out.println("2. See reservables");
            System.out.println("3. Add reservable");
            System.out.println("4. exit");

            type = sc.nextInt();

            switch (type){
                case 1:
                    this.system.showReservations();
                    break;
                case 2:
                    this.system.shorReservables();
                    break;
                case 3:
                    System.out.println("Introduce 1 if you want to create a restaurant table or 2 if you want to introduce a meeting room.");
                    int tipo = sc.nextInt();
                    if (tipo == 1){
                        this.system.addReservable(this.createTable());
                    }
                    else if(tipo == 2){
                        this.system.addReservable(this.createRoom());
                    }
                    break;
                case 4:
                    return;

            }

        }while (true);
    }

    public RestaurantTable createTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the name for the table: ");
        String name = sc.nextLine();
        sc.next();
        System.out.println("Introduce the number of places the table will have: ");
        int places = sc.nextInt();
        return new RestaurantTable(name, places);
    }

    public MeetingRoom createRoom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the name for the table: ");
        String name = sc.nextLine();
        sc.next();
        System.out.println("Introduce 1 if it will have TV and 0 if not: ");
        int places = sc.nextInt();

        if (places == 0){
            return new MeetingRoom(name, true);
        }

        else if(places == 1){
            return new MeetingRoom(name, false);
        }

        else{
            System.out.println("Incorrect number");
            return null;
        }

    }
}
