public class ThreadSecondario implements Runnable{
    
    

    public void run(){
        //inserisco qui le istruzioni che voglio far eseguire al nuovo Thread
        Thread.currentThread().setName("Thread Secondario");

        System.out.println("\t\t" + Thread.currentThread() + " inizia la sua esecuzione\n");

        for (int i = 0; i < 30; i++) {
            System.out.println("\t\tNumero[" + i + "]\n");
            try {
                Thread.sleep(300); // Ha effetto sul thread in esecuzione
                //oppure → Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\t\tATTENZIONE!! Qualcuno ha svegliato il thread anticipatamente");
            }
        }

        System.out.println("\t\t" + Thread.currentThread() + "finisce la sua esecuzione\n");

    }
}
