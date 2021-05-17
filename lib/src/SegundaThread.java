public class SegundaThread extends Thread {
    private Thread anterior;

    public SegundaThread(Thread anterior) {
        this.anterior = anterior;
    }
    public void run() {
        synchronized(anterior){
            try {
                anterior.wait();
                execute();
            } catch (InterruptedException e) {
                
            }
        }
    }
    private void execute()throws InterruptedException {
        System.out.println("Segunda Thread executando depois.");
        sleep(1000);
        
    }
}
