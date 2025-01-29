import java.util.UUID;

public abstract class Reservable {
    protected UUID id;
    protected String name;


    public UUID getId() {
        return id;
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

    public Reservable(String name) {
        this.id = UUID.randomUUID();;
        this.name = name;
    }


}
