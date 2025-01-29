public class RestaurantTable extends Reservable{

    private int places;

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public RestaurantTable(String name, int places) {
        super(name);
        this.places = places;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of places: " + this.places);
    }
}
