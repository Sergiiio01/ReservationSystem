import java.util.Scanner;

public class AdminView extends View{



    public AdminView(ReservationSystem system) {
        super(system);
    }

    @Override
    public void start() {
        do{
            ReservationSystem system = new ReservationSystem();
            Scanner sc = new Scanner(System.in);
            int type = 0;
            System.out.println("Please, select option: ");
            System.out.println("1. if you are an admin.");
            System.out.println("2. if you are a client. ");

            type = sc.nextInt();
            if(type == 1){
                AdminView adminView = new AdminView(system);
                adminView.start();
                break;
            }
            else if(type == 2){
                ClientView clientView = new ClientView(system);
                clientView.start();
                break;
            }
        }while (true);
    }
}
