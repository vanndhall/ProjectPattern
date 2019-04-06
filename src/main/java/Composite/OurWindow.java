package Composite;

import java.util.ArrayList;
import java.util.List;

public class OurWindow implements OurComposite {
    private List<OurComponent> components = new ArrayList<>();

    @Override
    public void add(OurComponent component) {
        components.add(component);

    }

    @Override
    public void remove(OurComponent component) {

    }

    @Override
    public OurComponent getChild(int attr) {
        return null;
    }

    @Override
    public void draw() {

    }
}