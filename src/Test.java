public class Test {
    public static void main(String[] args) {
        System.out.println("Стетюха Маргарита РИБО-04-22 Вариант 2");
        Thread[] students = new StudentsThread[7];
        for (int i = 0; i < 7; i++){
            students[i] = new StudentsThread();
            students[i].setName("Студент" + (i + 1));
            students[i].start();
        }
        try{
            for (Thread student : students){
                student.join();
            }
        }catch (InterruptedException ex){
            System.out.println("Возникла ошибка");
        }
    }
}
