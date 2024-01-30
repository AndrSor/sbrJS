public class MainMyThread {
    public static void main(String[] args){
        // Первый параметр: экземпляр Runnable
        // Второй параметр: своё имя (необязательно)
        Thread myThread = new Thread(new MyThread(), "Leo");
        Thread myThread2 = new Thread(new MyThread(), "Leo2");
        myThread.start();
        myThread2.start();
    }
}
