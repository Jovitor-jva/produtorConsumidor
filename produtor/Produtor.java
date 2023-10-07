package produtor;

import armazem.Armazem;

public class Produtor extends Thread {
    private Armazem armazem;
    private int itensProduzidos = 0;
    private int capacidadeDeProducaoDoArmazem = 20;

    public Produtor(Armazem armazem) {
        this.armazem = armazem;
    }

    public void run() {
        for (int i = 1; i <= capacidadeDeProducaoDoArmazem; i++) {
            armazem.getProducaoDoArmazem(i);
            itensProduzidos++;
        }
    }

    public int getItensProduzidos() {
        return itensProduzidos;
    }
}