package school;

public class Ravenclaw extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Когтевранцы умны, мудры, остроумны и полны творчества.
     */

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String fullName, int conjure, int transgress, int smart, int wise, int witty, int fullOfCreativity) {
        super(fullName, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Факультет Ravenclaw: " + super.toString() +
                " умен " + smart +
                ", мудр " + wise +
                ", остроумен " + witty +
                ", полон творчества " + fullOfCreativity;
    }

    public int ability(){
        return getSmart() + getWise() + getWitty() + getFullOfCreativity();
    }
    public void compareStudents(Ravenclaw ravenclaw1){
        int st1 = ability();
        int st2 = ravenclaw1.ability();
        if(st1>st2){
            System.out.println(getFullName() + " лучший Когтевранец, чем " + ravenclaw1.getFullName());
        } else {
            System.out.println(ravenclaw1.getFullName() + " лучший Когтевранец, чем " + getFullName());}
    }
}
