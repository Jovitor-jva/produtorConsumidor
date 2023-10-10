package armazem;

import java.util.LinkedList;

public class Armazem {
    private LinkedList<Integer> capacidadeDoArmazem = new LinkedList<>();

    public synchronized void getProducaoDoArmazem(int item) {
        while (capacidadeDoArmazem.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        capacidadeDoArmazem.add(item);
        System.out.println("Produtor colocou o item " + item + " do armazem");
        notifyAll();
    }

    public synchronized int getConsumoDoArmazem() throws Exception {
        while (capacidadeDoArmazem.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new Exception("O armazém está vázio");
            }
        }
        int item = capacidadeDoArmazem.remove(0);
        System.out.println("Consumidor pegou o item " + item + " do armazem");
        notifyAll();
        return item;
    }
}