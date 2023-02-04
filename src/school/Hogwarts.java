package school;

public class Hogwarts {
    /*
    * Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
    * Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
     */
    int conjure;
    int transgress;

    public Hogwarts(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return ". Общие характеристики для школы: " +
                "умеет колдовать с мощностью " + conjure +
                ", трансгрессируют на  расстояние " + transgress;
    }
}
