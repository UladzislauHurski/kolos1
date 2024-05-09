class Painting extends Exhibit {
    private String style;
    private String author;
    private int year;

    public Painting(String style, String author, int year, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.style = style;
        this.author = author;
        this.year = year;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Style: " + style);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}