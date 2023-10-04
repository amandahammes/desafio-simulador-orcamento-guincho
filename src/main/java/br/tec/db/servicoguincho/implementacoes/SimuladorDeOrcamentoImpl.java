package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;

public class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento {
    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        Guincho guincho;
        switch (veiculo.getTipo()) {
            case CARRO:
            case MINIVAN:
                guincho = new CaminhaoPlataforma();
                break;
            case ONIBUS:
            case CAMINHAO:
                guincho = new CaminhaoReboqueIntegrado();
                break;
            default:
                throw new IllegalArgumentException("Tipo de veículo não suportado");
        }

        double custoDeslocamento = guincho.calcularCustoDeslocamento(trajeto);
        return custoDeslocamento;
    }
}