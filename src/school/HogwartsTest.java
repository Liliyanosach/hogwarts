package school;

public class HogwartsTest {
    public static void main(String[] args) {
        /*
         * Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
         * Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
         * На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
         * На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
         */
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер",78,97,100, 57,76);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",67,99,65,45,78);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",56,65,79,56,48);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",67,87,46,99,63,80,70);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",45,63,76,49,33,60,66);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",57,38,79,65,78,50,55);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",45,67,34,67,45);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",76,58,89,56,38);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",56,72,91,67,49);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг",67,81,38,56,38,16);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",57,84,68,39,40,50);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 26, 89, 47, 36, 69, 41);

        System.out.println(harryPotter);
        System.out.println(dracoMalfoy);
        System.out.println(zhouChang);
        System.out.println(zachariasSmith);

        ronWeasley.compareStudents(ronWeasley, harryPotter);
        grahamMontagu.compareStudents(grahamMontagu, gregoryGoyle);
        cedricDiggory.compareStudents(cedricDiggory, justinFinchFletchley);
        ronWeasley.compareStudentByProperties(ronWeasley, dracoMalfoy);

    }


}
