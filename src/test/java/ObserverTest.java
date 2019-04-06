import observer.Observer;
import observer.Publisher;
import observer.PublisherImplementation;
import org.junit.Test;
import org.mockito.Mockito;

public class ObserverTest {

    @Test
    public void shouldInform(){
        final Publisher publisher = new PublisherImplementation(); // utworz obiekt
        final Observer observer1 = Mockito.mock(Observer.class); // sztuczne obiekty ktore nie istnieja a tylko je implementuja
        final Observer observer2 = Mockito.mock(Observer.class);

        publisher.register(observer1); // rejestracja obiektow
        publisher.register(observer2);// rejestracja obiektow
        publisher.notifyObservers(); //wyslij potwierdzenie rejestracji obserwatorow

        Mockito.verify(observer1).informed(Mockito.anyString());
        Mockito.verify(observer2).informed(Mockito.anyString());
    }
}
