public class MeetingRoom extends Reservable{
    private boolean hasTV;
    private boolean hasWhiteboard;

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public boolean isHasWhiteboard() {
        return hasWhiteboard;
    }

    public void setHasWhiteboard(boolean hasWhiteboard) {
        this.hasWhiteboard = hasWhiteboard;
    }

    public MeetingRoom(String name, boolean hasTV, boolean hasWhiteboard) {
        super(name);
        this.hasTV = hasTV;
        this.hasWhiteboard = hasWhiteboard;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (this.hasTV){
            System.out.println("It has TV included");
        }else{
            System.out.println("It doesn`t has TV included");
        }

        if (this.hasWhiteboard){
            System.out.println("It has whiteboard included");
        }else{
            System.out.println("It doesn`t has whiteboard included");
        }
    }

}
