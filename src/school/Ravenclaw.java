package school;

public class Ravenclaw extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Когтевранцы умны, мудры, остроумны и полны творчества.
     */
    private String fullName;
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String fullName, int conjure, int transgress, int smart, int wise, int witty, int fullOfCreativity) {
        super(conjure, transgress);
        this.fullName = fullName;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Факультет Ravenclaw: " + fullName +
                " умен " + smart +
                ", мудр " + wise +
                ", остроумен " + witty +
                ", полон творчества " + fullOfCreativity + super.toString();
    }
}
