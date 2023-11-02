
public class Test {

	public static void main(String[] args) {
		
		//Da questo punto parte l'esecuzione del programma e, di conseguenza,
		//del Thread principale, creato ed eseguito in maniera automatica da programma.
		
		int a=10;
		System.out.println("Valore di a: " + a);
		
		//Provo a recuperare e gestire il Thread principale
		Thread t; //Questo è un riferimento che successivamente punterà all'oggetto Thread che andremo a recuperare
		t= Thread.currentThread();
		t.setName("Thread principale");
		try {
			t.sleep(3000); //Metto il Thread in attesa per 3 secondi
		} catch (InterruptedException e) {
			System.out.println("ATTENZIONE! Il Thread si è svegliato anticipatamente");
		} 
		
		a++;
		System.out.println("Valore aggiornato di a: " + a + " da: " + t.getName());
		
		
		
	}

}
