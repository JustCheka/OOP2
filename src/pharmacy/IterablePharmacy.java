package pharmacy;

//import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component> {
    private int index;
    private final List<Component> components;

    //private List<String> compNames;

    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);

    }

    public void fillCompNames(List<String> compNames){
        for (int i = 0; i < components.size(); i++){
            compNames.add(components.get(i).getName());
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    //@NotNull
    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }
            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IterablePharmacy that = (IterablePharmacy) o;

        if (this.components.size() == that.components.size()) {
            List<String> compNames1 = new ArrayList<>();
            List<String> compNames2 = new ArrayList<>();
            for (int i = 0; i < this.components.size(); i++){
                compNames1.add(this.components.get(i).getName());
                compNames2.add(that.components.get(i).getName());
            }
            Collections.sort(compNames1);
            Collections.sort(compNames2);
            for (int i = 0; i < compNames1.size(); i++){
                if (compNames1.get(i) != compNames2.get(i)) return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 0;
        List<String> compNames = new ArrayList<>();
        fillCompNames(compNames);
        Collections.sort(compNames);
        for (int i = 0; i < compNames.size(); i++){
            result = result * 31 + compNames.get(i).hashCode();
        }
        return result;
    }

//    @NotNull
//    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }
}