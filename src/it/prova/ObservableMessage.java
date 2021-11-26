package it.prova;

import java.util.ArrayList;
import java.util.List;

public class ObservableMessage {

	private String notifica;
	private List<Observer> dispositivi = new ArrayList<>();

	public void addObserver(Observer dispositivo) {
		dispositivo.update(this.notifica);
		this.dispositivi.add(dispositivo);
	}

	public void removeObserver(Observer dispositivo) {
		this.dispositivi.remove(dispositivo);
	}

	public ObservableMessage() {
		this.notifica = "Non ci sono notifiche";
	}

	public void setNotifica(String nuovaNotifica) {
		this.notifica = nuovaNotifica;
		for (Observer observer : this.dispositivi) {
			observer.update(this.notifica);
		}
	}

	public List<Observer> getDispositivi() {
		return dispositivi;
	}

	public void setDispositivi(List<Observer> dispositivi) {
		this.dispositivi = dispositivi;
	}

	public String getNotifica() {
		return notifica;
	}
	
	

}
