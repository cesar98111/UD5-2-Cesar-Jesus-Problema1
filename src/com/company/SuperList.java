package com.company;

import java.util.Iterator;

public class SuperList<T> extends ListManager<T>  {

    @Override
    public void addElement(T element) {

        list.add(element);
    }

    @Override
    public T removeElement(int position) {

        position--;

        return list.remove(position);
    }

    @Override
    public void showElements() {

        Iterator<T> recorrido = list.iterator();
        System.out.print("Super lista -> [");

        while(recorrido.hasNext()) {
            T elemento = recorrido.next();
            System.out.print(elemento+" ");
        }

        System.out.println("]");

    }

    @Override
    public void showReversedElements() {

        System.out.print("Super List Reverse -> [");

        int tamaño = list.size();
        tamaño--;

        for (int i = tamaño; i >= 0; i--) {

            System.out.print(list.get(i)+" ");

        }

        System.out.println("]");
    }
}
