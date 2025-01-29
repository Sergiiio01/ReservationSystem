import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {

            ReservationSystem system = new ReservationSystem()
            Scanner sc = new Scanner(System.in);
            int type = 0;
            System.out.println("Please, select option: ");
            System.out.println("1. if you are an admin.");
            System.out.println("2. if you are a client. ");
            System.out.println("3. Exit.");

            type = sc.nextInt();
            if (type == 1) {
                AdminView adminView = new AdminView(system);
                adminView.start();
            } else if (type == 2) {
                ClientView clientView = new ClientView(system);
                clientView.start();
            }
            else if(type == 3) {
                return;
            }
        } while (true);


    }
}
}
