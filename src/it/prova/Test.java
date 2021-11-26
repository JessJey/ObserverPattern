package it.prova;

public class Test {

	 public static void main(String[] args) {
		 
	        ObservableMessage notifiche = new ObservableMessage();
	        
	        Observer observer1 = new ObserverMessage("Computer");
	        Observer observer2 = new ObserverMessage("Smartphone");

	        notifiche.addObserver(observer1);
	        notifiche.addObserver(observer2);

	        notifiche.setNotifica("Ci sono 2 nuove notifiche");

	        notifiche.removeObserver(observer2);
	        notifiche.setNotifica("Ci sono 5 nuove notifiche");

	    }
}
