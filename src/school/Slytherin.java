package school;

public class Slytherin extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
     */

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int conjure, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Факультет Slytherin: "  + super.toString() +
                " хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти" + lustForPower;
    }

    public void compareStudents(Slytherin slytherin, Slytherin slytherin1){
        int st1 = slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.lustForPower;
        int st2 =slytherin1.cunning + slytherin1.determination + slytherin1.ambition + slytherin1.resourcefulness + slytherin1.lustForPower;
        if(st1>st2){
            System.out.println(slytherin.getFullName() + " лучший Слизеринец, чем " + slytherin1.getFullName());
        } else {
            System.out.println(slytherin1.getFullName() + " лучший Слизеринец, чем " + slytherin.getFullName());}
    }
}
