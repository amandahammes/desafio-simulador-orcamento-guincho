package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class TrajetoImpl implements Trajeto {
    private String origem;
    private String destino;

    // Construtor que recebe as informações de origem e destino
    public TrajetoImpl(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public Integer getDistanciaEmKM() {
        if (origem.equals(destino)) {
            if(destino.equals("C")){
                return 5;
            } else {
                return 0;
            }
        } else if ((origem.equals("C") && destino.equals("A")) || (origem.equals("A") && destino.equals("C"))) {
            return 10;
        } else if ((origem.equals("C") && destino.equals("B")) || (origem.equals("B") && destino.equals("C"))) {
            return 15;
        } else if ((origem.equals("A") && destino.equals("B")) || (origem.equals("B") && destino.equals("A"))) {
            return 8;
        } else {
            return 0;
        }
    }
}
