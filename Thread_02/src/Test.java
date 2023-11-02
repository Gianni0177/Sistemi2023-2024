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

        //Creo un nuovo thread e gli assegno delle istruzioni da eseguire
        //Thread ts = new Thread(/* Passo un oggetto di una classe al cui interno è implementato il metodo RUN */);

        //ThreadSecondario t2 = new ThreadSecondario();
        //Thread ts = new Thread(t2);

        Thread ts = new Thread(new ThreadSecondario());
        //mando in esecuzione il thread secondario
        ts.start();

        for (int j = 0; j < 10; j++) {
            System.out.println("Numero[" + j + "]\n");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("ATTENZIONE!! Qualcuno mi ha svegliato anticipatamente!");
                
            }
        }

        System.out.println(Thread.currentThread().getName() + "Termina la sua esecuzuione\n");

    }
}
