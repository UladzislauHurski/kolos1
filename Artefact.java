class Artefact extends Exhibit {
    private String material;
    private String timePeriod;

    public Artefact(String material, String timePeriod, int exhibitCount, String name, String idNumber, String description) {
        super(exhibitCount, name, idNumber, description);
        this.material = material;
        this.timePeriod = timePeriod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Material: " + material);
        System.out.println("Time Period: " + timePeriod);
    }
}

