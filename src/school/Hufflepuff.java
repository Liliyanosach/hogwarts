package school;

public class Hufflepuff extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Студенты Пуффендуя трудолюбивы, верны, честны.
     */
    private String fullName;
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String fullName, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(conjure, transgress);
        this.fullName = fullName;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Факультет Hufflepuff: " + fullName +
                " трудолюбив " + hardworking +
                ", верен " + loyal +
                ", честен " + honest +
                super.toString();
    }
}
