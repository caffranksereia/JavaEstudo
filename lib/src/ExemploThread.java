public class ExemploThread {
    public static void main(String args[]) {
        PrimeiraThread p1 = new PrimeiraThread();
        SegundaThread p2 = new SegundaThread(p1);
        p2.start();
        p1.start();


        Thread[] threads = new Thread[5];
        try {
            for(int i=0;i<=5;i++){
                threads[i] = new BarreiraThreads();
                threads[i].start();
            }
            for(int i=0;i<=5;i++){
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.prinStackTrace();
        }
        System.out.println("Acabou");

    }
    
}
