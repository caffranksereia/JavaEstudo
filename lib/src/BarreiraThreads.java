public class BarreiraThreads extends Thread{
    public void run(){
        Random rnd = new Random();
        System.out.println("Thread "+getName()+"Executando.");
        try {
            sleep(rnd.nextInt(1000));
        } catch (InterruptedException e) {
           
        }
        System.out.println( "Thread"+getName()+" finalizada.");
    }
}
