import Mediator.*;
import org.junit.Test;
import org.mockito.Mockito;


import org.junit.Test;
import org.mockito.Mockito;

public class MediatorTest {

	@Test
	public void shouldPaniKasiaUmowMeeting() {
		final KsiazkaTelefoniczna ksiazkaTelefoniczna = Mockito.mock(KsiazkaTelefoniczna.class);
		final Telefon telefon = Mockito.mock(Telefon.class);
		final Pracownik kowalski = Mockito.mock(Pracownik.class);
		final Salka salka = Mockito.mock(Salka.class);
		final PaniKasia paniKasia = new PaniKasia(ksiazkaTelefoniczna, telefon, salka);

		Mockito.when(ksiazkaTelefoniczna.getNumer(Mockito.eq("Kowalski"))).thenReturn("12345");
		Mockito.when(telefon.zadzwon(Mockito.eq("12345"))).thenReturn(kowalski);

		paniKasia.umowMeeting("11:00", "Kowalski");

		Mockito.verify(ksiazkaTelefoniczna).getNumer(Mockito.eq("Kowalski"));
		Mockito.verify(telefon).zadzwon(Mockito.eq("12345"));
		Mockito.verify(kowalski).zaakceptuj();
		Mockito.verify(salka).rezerwuj("11:00");
	}
}