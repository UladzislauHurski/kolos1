public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum("Warszawa", "Museum");

        Painting painting = new Painting("Impressionist", "Uladzislau", 2023, 1, "Apple tree", "painting", "Beautiful painting.");
        Sculpture sculpture = new Sculpture("Silver", "Uladzislau", 2024, 2, "Gerakl", "sculpture", "Great sculpture.");
        Artefact artefact = new Artefact("Gold", "Ancient", 3, "Egypt", "artefact", "Ancient Egypt item.");

        museum.addExhibit(painting);
        museum.addExhibit(sculpture);
        museum.addExhibit(artefact);

        museum.showMaintenanceDate();
    }
}