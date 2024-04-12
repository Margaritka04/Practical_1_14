import java.util.concurrent.Semaphore;
public class StudentsThread extends Thread{
    private static Semaphore table = new Semaphore(2);
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " Ожидает");
            table.acquire();
            System.out.println(Thread.currentThread().getName() + " Приём пищи");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Выходит из-за стола");
            table.release();
        }catch (InterruptedException ex){
            System.out.println("Возникла ошибка");
        }
    }
}
