public class PeopleQueue extends Thread{
    private String[] names;
    PeopleQueue(String... names) {
        this.names = names;
    }
    @Override
    public void run() { // Этот метод будет вызван при старте потока
        for (int i = 0; i < names.length; i++) { // Вывод в цикле с паузой 0.5 сек очередного сотрудника
            System.out.println("Обработаны документы: " + names[i]);
            try {
                sleep(500); // Задержка в 0.5 сек
            } catch (Exception e) {}
        }
    }
}
