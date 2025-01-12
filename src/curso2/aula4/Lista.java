package curso2.aula4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Item lista 1");
        listaArrayList.add("Item lista 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Item lista A");
        listaLinkedList.add("Item lista B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

    }
}