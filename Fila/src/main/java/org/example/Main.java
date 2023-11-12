package org.example;

public class Main {
    public static void main(String[] args) {

        Fila<Integer> minhaFila = new Fila<>();

        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

        System.out.println("========================");

        Fila<String> minhaFila2 = new Fila<>();

        minhaFila2.enqueue("Primerio");
        minhaFila2.enqueue("Segundo");
        minhaFila2.enqueue("Terceiro");
        minhaFila2.enqueue("Quarto");

        System.out.println(minhaFila2);

        System.out.println(minhaFila2.dequeue());

        System.out.println(minhaFila2.first());
        System.out.println(minhaFila2);
    }
}