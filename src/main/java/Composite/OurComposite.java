package Composite;

public interface OurComposite extends OurComponent {
    void add(OurComponent component);

    void remove(OurComponent component);

    OurComponent getChild(int attr);
}
