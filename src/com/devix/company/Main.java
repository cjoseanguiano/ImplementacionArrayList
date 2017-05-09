package com.devix.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList unoArrayList = new ArrayList();
        ArrayList dosArrayList = new ArrayList();
        ArrayList<String[]> vectorString = new ArrayList<>();
        ArrayList enteros = new ArrayList();

        unoArrayList.add("A");
        unoArrayList.add("B");
        unoArrayList.add("C");

        dosArrayList.add("D");
        dosArrayList.add("E");
        dosArrayList.add("F");

        //Se añade los elementos a un arrayList
        unoArrayList.addAll(dosArrayList);

        System.out.println("Tamaño del ArrayList " + unoArrayList.size());

        for (int i = 0; i < unoArrayList.size(); i++) {
            System.out.println("Indice " + i + " contiene " + unoArrayList.get(i));
        }

        if (unoArrayList.contains("A")) {
            System.out.println("Contengo la A");
        }

        unoArrayList.set(0, "Z");
        unoArrayList.remove(1);

        System.out.println("Tamaño del ArrayList " + unoArrayList.size());
        for (int i = 0; i < unoArrayList.size(); i++) {
            System.out.println("Indice " + i + " contiene " + unoArrayList.get(i));
        }

        unoArrayList.clear();

        if (unoArrayList.isEmpty()){
            System.out.println("Estoy vacio");
        }
    }
}
