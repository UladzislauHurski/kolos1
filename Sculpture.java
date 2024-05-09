class Sculpture extends Exhibit {
    private String material;
    private String author;
    private int year;

    public Sculpture(String material, String author, int year, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.material = material;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Material: " + material);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}