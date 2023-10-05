package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class TrajetoImpl implements Trajeto {
    private String origem;
    private String destino;

    public TrajetoImpl(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public int distanciaEmKM() {
        switch (origem) {
            case "A":
                if (destino.equals("B")) {
                    return 8;
                } else if (destino.equals("C")) {
                    return 10;
                } else {
                    return 0;
                }
            case "B":
                if (destino.equals("A")) {
                    return 8;
                } else if (destino.equals("C")) {
                    return 15;
                } else {
                    return 0;
                }
            case "C":
                if (destino.equals("A")) {
                    return 10;
                } else if (destino.equals("B")) {
                    return 15;
                } else if(destino.equals("C")) {
                    return 5;
                } else {
                    return 0;
                }
            default:
                return 0;
        }
    }
}
