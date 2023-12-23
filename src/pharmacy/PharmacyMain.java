package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {

        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "20gr", 10);
        Component sugar = new Component("Sugar", "87gr", 80);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addComponents(salt, pineceline);

        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.addComponents(sugar, pineceline);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(pineceline, salt, sugar);

        IterablePharmacy pharmacy3 = new IterablePharmacy();
        pharmacy3.addComponents(sugar, pineceline);

        IterablePharmacy pharmacy4 = new IterablePharmacy();
        pharmacy4.addComponents(pineceline, sugar);

        IterablePharmacy pharmacy5 = new IterablePharmacy();
        pharmacy5.addComponents(sugar, salt);

        System.out.println(pharmacy1.equals(pharmacy1)); //сравнение объекта с самим собой
        System.out.println(pharmacy1.equals(pharmacy2)); //сравнение объектов с разным количеством компонентов
        System.out.println(pharmacy1.equals(pharmacy3)); //сравнение объектов с одинаковым количеством компонентов и с одинаковым порядком компронентов
        System.out.println(pharmacy1.equals(pharmacy4)); //сравнение объектов с одинаковым количеством компонентов, но с разным порядоком компонентов
        System.out.println(pharmacy1.equals(pharmacy5)); //сравнение объектов с одинаковым количеством компоненов, но с разными компонентами

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);
        System.out.println();

        System.out.println("result = " + result.size());
        System.out.println("-----------------------------");


        List<Component> list = new ArrayList<>();
        list.add(pineceline);
        list.add(salt);
        list.add(sugar);


        Collections.sort(list);
        System.out.println(list);

    }



}