public class ExemploThread {
    public static void main(String args[]) {
        PrimeiraThread p1 = new PrimeiraThread();
        SegundaThread p2 = new SegundaThread(p1);
        p2.start();
        p1.start();
    }
    
}
