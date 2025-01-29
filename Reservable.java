public class Reservable {protected String id;
    protected String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Reservable name: " + this.name);
    }

    public Reservable(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
