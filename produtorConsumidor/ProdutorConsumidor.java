package produtorConsumidor;

import armazem.Armazem;
import consumidor.Consumidor;
import produtor.Produtor;

public class ProdutorConsumidor {
    public static void main(String[] args) {
        Armazem armazem = new Armazem();
        Produtor produtor = new Produtor(armazem);
        Consumidor consumidor = new Consumidor(armazem);

        produtor.start();
        consumidor.start();
    }
}