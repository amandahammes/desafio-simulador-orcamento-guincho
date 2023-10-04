package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class CaminhaoPlataforma extends Guincho{
    public CaminhaoPlataforma() {
        super();
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return 5.0 * trajeto.getDistanciaEmKM();
    }
}
