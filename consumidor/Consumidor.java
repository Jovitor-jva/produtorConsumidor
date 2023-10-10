package consumidor;

import armazem.Armazem;

public class Consumidor extends Thread {
    private Armazem armazem;
    private int quantidadeDeItensQueOConsumidorVaiConsumir = 20;

    public Consumidor(Armazem armazem) {
        this.armazem = armazem;
    }

    public void run() {
        for (int i = 1; i < quantidadeDeItensQueOConsumidorVaiConsumir; i++) {
            try {
                armazem.getConsumoDoArmazem();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}