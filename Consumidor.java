public class Consumidor extends Thread {
    private Armazem armazem;
    private int capacidadeDeConsumoDoConsumidor = 20;

    public Consumidor(Armazem armazem) {
        this.armazem = armazem;
    }

    public void run() {
        for (int i = 1; i <= capacidadeDeConsumoDoConsumidor; i++) {
            armazem.getConsumoDoArmazem();
        }
    }
}