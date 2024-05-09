import java.util.Date;

public class Exhibit {
    protected int exhibitCount;
    protected Date lastMaintenanceDate;
    protected String name;
    protected String idNumber;
    protected String description;

    public Exhibit(int exhibitCount, String name, String idNumber, String description) {
        this.exhibitCount = exhibitCount;
        this.name = name;
        this.idNumber = idNumber;
        this.description = description;
        this.lastMaintenanceDate = new Date();
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Description: " + description);
    }
}
