public class PrimeiraThread extends Thread {
    public void run(){
        synchronized(this){
            try {
                execute();
                notify();
                System.out.println("Acabei");

            } 
            catch (InterruptedException e) {
                System.out.println(e.getCause());
            }
        }
    }
    private void execute()throws InterruptedException {
        System.out.println("Primeira thread.");
        sleep(10000);
    }
}
