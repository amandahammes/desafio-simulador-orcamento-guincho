package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.Menu;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;

public class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento {

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        Guincho guincho;

        switch (Menu.getEscolhaGuincho()){
            case 1:
                if (Menu.getEstadoConservacao() == 1){
                    throw new IllegalArgumentException("Veículos novos não podem ser levados por esse guincho.");
                } else {
                    guincho = new CaminhaoCorrenteGancho();
                }
                break;
            case 2:
                if (Menu.getEscolhaCarro() == 1 || Menu.getEscolhaCarro() == 2){
                    throw new IllegalArgumentException("Veículos leves não podem ser levados por esse guincho.");
                } else {
                    guincho = new CaminhaoReboqueIntegrado();
                }
                break;
            case 3:
                if (Menu.getEscolhaCarro() == 3 || Menu.getEscolhaCarro() == 4){
                    throw new IllegalArgumentException("Veículos pesados não podem ser levados por esse guincho.");
                } else {
                    guincho = new CaminhaoPlataforma();
                }
                break;
            default:
                throw new IllegalArgumentException("Opção de Guincho não encontrada.");
        }

        double custoDeslocamento = guincho.calcularCustoDeslocamento(trajeto);
        return custoDeslocamento;
    }
}