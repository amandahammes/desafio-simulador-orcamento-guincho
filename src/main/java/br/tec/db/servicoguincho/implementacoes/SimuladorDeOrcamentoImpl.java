package br.tec.db.servicoguincho.implementacoes;

import br.tec.db.servicoguincho.Menu;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;

public class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento {

    private int carro;
    private int estadoConservacao;
    private int escolhaGuincho;

    public SimuladorDeOrcamentoImpl(int carro, int estadoConservacao, int escolhaGuincho) {
        this.carro = carro;
        this.estadoConservacao = estadoConservacao;
        this.escolhaGuincho = escolhaGuincho;
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        Guincho guincho;

        switch (escolhaGuincho){
            case 1:
                if (estadoConservacao == 1){
                    throw new IllegalArgumentException("Veículos novos não podem ser levados por esse guincho.");
                } else {
                    guincho = new CaminhaoCorrenteGancho();
                }
                break;
            case 2:
                if (carro == 1 || carro == 2){
                    throw new IllegalArgumentException("Veículos leves não podem ser levados por esse guincho.");
                } else {
                    guincho = new CaminhaoReboqueIntegrado();
                }
                break;
            case 3:
                if (carro == 3 || carro == 4){
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