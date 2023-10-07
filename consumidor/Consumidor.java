package consumidor;

import armazem.Armazem;

public class Consumidor extends Thread {
    private Armazem armazem;
    private int quantidadeItensMaximoParaConsumo = 20;

    public Consumidor(Armazem armazem) {
        this.armazem = armazem;
    }

    public void run() {
        for (int i = 1; i <= quantidadeItensMaximoParaConsumo; i++) {
            try {
                armazem.getConsumoDoArmazem();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}