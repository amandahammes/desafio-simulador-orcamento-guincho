package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.implementacoes.SimuladorDeOrcamentoImpl;
import br.tec.db.servicoguincho.implementacoes.TrajetoImpl;
import br.tec.db.servicoguincho.implementacoes.VeiculoImpl;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;
import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
