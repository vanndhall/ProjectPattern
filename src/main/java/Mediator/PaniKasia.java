package Mediator;

public class PaniKasia {

	final KsiazkaTelefoniczna ksiazkaTelefoniczna;
	final Telefon telefon;
	final Salka salka;

	public PaniKasia(KsiazkaTelefoniczna ksiazkaTelefoniczna, Telefon telefon, Salka salka) {
		this.ksiazkaTelefoniczna = ksiazkaTelefoniczna;
		this.telefon = telefon;
		this.salka = salka;
	}


	public void umowMeeting(String godzina, String pracownik) {
		String number = ksiazkaTelefoniczna.getNumer(pracownik);
		Pracownik pracownikObiekt = telefon.zadzwon(number);
		pracownikObiekt.zaakceptuj();
		salka.rezerwuj(godzina);
	}
}
