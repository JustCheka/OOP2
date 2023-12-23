package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {
    public static void main(String[] args) {

        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, pineceline);

//        for (Component c : pharmacy2){
//            System.out.println(c);
//        }

        List<Component> list = new ArrayList<>();
        list.add(pineceline);
        list.add(salt);
        list.add(sugar);


        Collections.sort(list);
        System.out.println(list);

    }

}