package school;

public class Hogwarts {
    /*
    * Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
    * Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
     */
    private int conjure;
    private int transgress;

    public Hogwarts(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
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
}
