package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.Trajeto;

public class CaminhaoReboqueIntegrado extends Guincho {
    public CaminhaoReboqueIntegrado() {
        super();
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return 10.0 * trajeto.distanciaEmKM(); // Defina a taxa de deslocamento diretamente aqui
    }
}
