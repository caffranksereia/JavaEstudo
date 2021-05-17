public class Compartilhamento extends Thread{
    private Runnable  t1;
    private Runnable t2;
    private int recurso;

    public synchronized int getRecurso(){
        return recurso;
    }
    public synchronized void setRecurso(int recurso){
        this.recurso = recurso;
    }

    public void exemploUsoThread() {
        t1 = new Runnable() {
            @Override
            public void run(){
                setRecurso(getRecurso()+1);
                System.out.println(getRecurso());
            }
        };
        t2 =  new Runnable(){
            @Override
            public void run(){
                for(int i = 0; i<1000;i++){
                    setRecurso(getRecurso()+1);
                    System.out.println(getRecurso());
                }

            }
            
    
        };
        new Thread(t1).start();
        new Thread(t2).start();
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            setRecurso(i);
        System.out.println(this.getRecurso());
        }

    };

    public static void main (String[] args){
        Compartilhamento c1= new Compartilhamento();
        c1.exemploUsoThread();
    }
    
}
