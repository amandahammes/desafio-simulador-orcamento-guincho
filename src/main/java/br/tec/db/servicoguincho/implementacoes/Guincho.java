package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

abstract class Guincho {
    private double taxaDeslocamentoPorKM;

    public Guincho() {
        this.taxaDeslocamentoPorKM = taxaDeslocamentoPorKM;
    }

    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return taxaDeslocamentoPorKM * trajeto.getDistanciaEmKM();
    }
}
