package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.implementacoes.SimuladorDeOrcamentoImpl;
import br.tec.db.servicoguincho.implementacoes.TrajetoImpl;
import br.tec.db.servicoguincho.implementacoes.VeiculoImpl;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class Main {

    public static void main(String[] args) {
        SimuladorDeOrcamento simulador;
        Veiculo carroNovo;
        Trajeto centroParaBairroA;

        simulador = new SimuladorDeOrcamentoImpl();
        carroNovo = new VeiculoImpl(TipoVeiculo.CARRO, EstadoConservacao.NOVO);
        centroParaBairroA = new TrajetoImpl("C", "A");

        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);

        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);


    }
}
