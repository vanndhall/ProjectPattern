public class SingletonPattern {

    private static SingletonPattern instance;
    // klasa wzorzec projektowy  Singleton   =   gdzie klasa ma jedną metodę


    public static SingletonPattern getInstance() {
        //leniwa inicjalizacja
        if(instance == null){
            instance = new SingletonPattern();
        }

        return null;
    }

    private SingletonPattern(){

    }
}
