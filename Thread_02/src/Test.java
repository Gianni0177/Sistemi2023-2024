public class Test {
    public static void main(String[] args) {
        
        //Da questo punto partirà l'esecuzione del thread principale
        int i = 1;

        /*
        > Recupero il thread principale in questi punto del programma
        Thread t = Thread.currentThread();
        t.setName("Thread Principale");
        System.out.println(t.getName());
        */
        
        Thread.currentThread().setName("Thread Principale");

        System.out.println(Thread.currentThread().getName());
        
        //Creo un nuovo thread e gli assegno delle istruzioni da eseguire
        //Thread ts = new Thread(/* Passo un oggetto di una classe al cui interno è implementato il metodo RUN */);

        //ThreadSecondario t2 = new ThreadSecondario();
        //Thread ts = new Thread(t2);

        Thread ts = new Thread(new ThreadSecondario()); 





    }
}
