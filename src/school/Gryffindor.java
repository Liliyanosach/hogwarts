package school;

public class Gryffindor extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Всем Гриффиндорцам присущи благородство, честь и храбрость.
     */
    private String fullName;
    private int nobility;
    private int honor;
    private int courage;


    public Gryffindor(String fullName, int conjure, int transgress, int nobility, int honor, int courage) {
        super(conjure, transgress);
        this.fullName = fullName;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Факультет Gryffindor: " + fullName +
                " присущи благородство - " + nobility +
                ", честь " + honor +
                ", храбрость " + courage +
                super.toString();
    }

    /*
    * Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам.
    * У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
    * Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
    * Метод должен выводить в консоль сравнение учеников.
    * Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов.
    * У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
    * У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
     */
    public void compareStudents(){

    }
}
