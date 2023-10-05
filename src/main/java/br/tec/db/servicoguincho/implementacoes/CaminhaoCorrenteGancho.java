package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class CaminhaoCorrenteGancho extends Guincho {
    public CaminhaoCorrenteGancho() {
        super();
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return 2.0 * trajeto.distanciaEmKM();
    }
}
