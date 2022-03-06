package Task7.Component;

import java.util.ArrayList;
import java.util.List;

public class Playing implements Component{

    private List<Component> toy=new ArrayList<Component>();

    @Override
    public void printName() {
        for (Component toy:toy){
            toy.printName();
        }
    }

    @Override
    public void add(Component t) {
        this.toy.add(t);
    }

    @Override
    public void remove() {
        this.toy.clear();
    }

    @Override
    public void getChild() {
    }


}
