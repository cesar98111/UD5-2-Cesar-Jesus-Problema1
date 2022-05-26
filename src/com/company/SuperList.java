package com.company;

import java.util.Iterator;

public class SuperList extends ListManager {

    @Override
    public void addElement(Object element) {
        list.add(element);
    }

    @Override
    public Object removeElement(int position) {
        return list.remove(position);
    }

    @Override
    public void showElements() {

        Iterator<Object> recorrido = list.iterator();
        System.out.println("Super lista -> [");

        while(recorrido.hasNext()) {
            Object elemento = recorrido.next();
            System.out.println(elemento);
        }

        System.out.println("]");

    }

    @Override
    public void showReversedElements() {

    }
}
