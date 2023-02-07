package school;

public class Gryffindor extends Hogwarts {
    /*
     * Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
     * Всем Гриффиндорцам присущи благородство, честь и храбрость.
     */

    private int nobility;
    private int honor;
    private int courage;


    public Gryffindor(String fullName, int conjure, int transgress, int nobility, int honor, int courage) {
        super(fullName, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Факультет Gryffindor: " + super.toString() +
                " присущи благородство - " + nobility +
                ", честь " + honor +
                ", храбрость " + courage;
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

    public int ability(){
        return getNobility() + getHonor() + getCourage();
    }
    public void compareStudents(Gryffindor gryffindor1) {
        int st1 = ability();
        int st2 = gryffindor1.ability();
        if (st1 > st2) {
            System.out.println(getFullName() + " лучший Гриффиндорец, чем " + gryffindor1.getFullName());
        } else if (st1 < st2){
            System.out.println(gryffindor1.getFullName() + " лучший Гриффиндорец, чем " + getFullName());
        } else {
            System.out.println("Их способности равны");
        }
    }
}
