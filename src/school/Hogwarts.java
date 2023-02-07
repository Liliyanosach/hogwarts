package school;

public class Hogwarts {
    /*
     * Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
     * Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
     */

    private final String fullName;
    private int conjure;
    private int transgress;

    public Hogwarts(String fullName, int conjure, int transgress) {
        this.fullName = fullName;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getFullName(){
        return fullName;
    }
    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return ". Общие характеристики для школы: " +
                "умеет колдовать с мощностью " + conjure +
                ", трансгрессируют на  расстояние " + transgress;
    }

    public void compareStudentByProperties(Hogwarts hogwarts, Hogwarts hogwarts1) {
        int str = hogwarts.getConjure() + hogwarts.getTransgress();
        int str1 = hogwarts1.getConjure() + hogwarts1.getTransgress();
        if (str > str1) {
            System.out.println(hogwarts.getFullName() + " общие характеристики лучше чем у " + hogwarts1.getFullName());
        } else {
            System.out.println(hogwarts1.getFullName() + " общие характеристики лучше чем у " + hogwarts.getFullName());
        }
    }
}
