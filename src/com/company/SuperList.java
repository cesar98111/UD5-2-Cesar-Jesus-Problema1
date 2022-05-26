package com.company;

import java.util.Iterator;

public class SuperList<T> extends ListManager<T>  {

    @Override
    public void addElement(T element) {

        list.add(element);
    }

    @Override
    public T removeElement(int position) {

        return list.remove(position);
    }

    @Override
    public void showElements() {

        Iterator<T> recorrido = list.iterator();
        System.out.println("Super lista -> [");

        while(recorrido.hasNext()) {
            T elemento = recorrido.next();
            System.out.print(elemento+" ");
        }

        System.out.println("]");

    }

    @Override
    public void showReversedElements() {

        System.out.println("Super List Reverse -> [");

        for (int i = list.size(); i >= 0; i--) {

            System.out.print(list.get(i)+" ");

        }

        System.out.println("]");
    }
}
