package school;

public class Slytherin extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
     */
    private String fullName;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int conjure, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(conjure, transgress);
        this.fullName = fullName;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Факультет Slytherin: " + fullName +
                " хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти" + lustForPower
                + super.toString();
    }
}
