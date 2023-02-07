package school;

public class Hufflepuff extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Студенты Пуффендуя трудолюбивы, верны, честны.
     */

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(fullName, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Факультет Hufflepuff: " + super.toString() +
                " трудолюбив " + hardworking +
                ", верен " + loyal +
                ", честен " + honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void compareStudents(Hufflepuff hufflepuff, Hufflepuff hufflepuff1){
        int st1 = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
        int st2 = hufflepuff1.getHardworking() + hufflepuff1.getLoyal() + hufflepuff1.getHonest();
        if(st1>st2){
            System.out.println(hufflepuff.getFullName() + " лучший Пуффендуец, чем " + hufflepuff1.getFullName());
        } else {
            System.out.println(hufflepuff1.getFullName() + " лучший Пуффендуец, чем " + hufflepuff.getFullName());}
    }
}
