import java.util.LinkedList;

public class Armazem {
    private LinkedList<Integer> buffer = new LinkedList<>();
    public int capacidadeDoArmazem = 10;

    public synchronized void getProducaoDoArmazem(int item) {
        while (buffer.size() == capacidadeDoArmazem) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        buffer.add(item);
        System.out.println("Produtor pegou o item " + item + " do armazem");
        notifyAll();
    }

    public synchronized int getConsumoDoArmazem() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int item = buffer.remove();
        System.out.println("Consumidor pegou o item " + item + " do armazem");
        notifyAll();
        return item;
    }
}