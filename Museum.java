import java.util.ArrayList;

class Museum {
    private String address;
    private String name;
    private ArrayList<Exhibit> exhibits;

    public Museum(String address, String name) {
        this.address = address;
        this.name = name;
        this.exhibits = new ArrayList<>();
    }

    public void addExhibit(Exhibit exhibit) {
        if (!exhibits.contains(exhibit)) {
            exhibits.add(exhibit);
        } else {
            System.out.println("Exhibit already exists in the museum.");
        }
    }

    public void removeExhibit(Exhibit exhibit) throws Exception {
        if (exhibits.contains(exhibit)) {
            exhibits.remove(exhibit);
        } else {
            throw new Exception("Exhibit not found in the museum.");
        }
    }

    public void showMaintenanceDate() {
    }
}