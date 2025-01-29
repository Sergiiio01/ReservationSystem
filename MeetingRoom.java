public class MeetingRoom extends Reservable{
    private boolean hasTV;

    public boolean isHasTV() {
        return hasTV;
    }






    public MeetingRoom(String name, boolean hasTV) {
        super(name);
        this.hasTV = hasTV;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (this.hasTV){
            System.out.println("It has TV included");
        }else{
            System.out.println("It doesn`t has TV included");
        }

    }

}
