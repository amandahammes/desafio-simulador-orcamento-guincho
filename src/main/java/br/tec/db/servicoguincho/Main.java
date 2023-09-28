package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class Main {

    public static void main(String[] args) {
        // Cenário 1 -  carro novo - do centro para o bairro A
        SimuladorDeOrcamento simulador; // instanciar implementação de simulaodr
        Veiculo carroNovo; // instanciar implementação de veiculo
        Trajeto centroParaBairroA; // instanciar trajeto
        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);
    }
}
