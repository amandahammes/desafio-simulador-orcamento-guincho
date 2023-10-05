package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;
import java.util.Scanner;

import static br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao.*;
import static br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo.*;

public class Menu {
    public int escolhaCarro;

    public TipoVeiculo tipoVeiculo;
    public int estadoConservacao;
    public EstadoConservacao estadoConservacaoString;
    public int escolhaGuincho;
    public String escolhaDestino;
    public String escolhaOrigem;
    Scanner scan = new Scanner(System.in);

   public void escolherCarro() throws IllegalArgumentException {
       System.out.println("***** SIMULADOR ORÇAMENTO GUINCHO *****");
       System.out.println("Escolha o carro a ser guinchado digitando o número correspondente ao carro: ");
       System.out.println("1 - CARRO;");
       System.out.println("2 - MINIVAN;");
       System.out.println("3 - ONIBUS;");
       System.out.println("4 - CAMINHAO;");
       escolhaCarro = scan.nextInt();
       if (escolhaCarro<=4 && escolhaCarro > 0){
           escolherEstadoConservacao();
       } else {
           throw new IllegalArgumentException("Número não corresponde a nenhum carro.");
       }
   }

   public void escolherEstadoConservacao(){
       System.out.println("Qual o estado de conservacao do carro? Digite o número correspondente: ");
       System.out.println("1 - NOVO;");
       System.out.println("2 - QUEBRADO;");
       estadoConservacao = scan.nextInt();

       if (estadoConservacao<=2 && estadoConservacao > 0){
           escolherGuincho();
       } else {
           throw new IllegalArgumentException("Número não corresponde a nenhum estado de conservação.");
       }
       transformarEstadoConservacaoString();
   }

   public void escolherGuincho(){
       System.out.println("Agora é hora de escolher o Guincho... Digite o número correspondente:");
       System.out.println("1 - Caminhão de corrente e gancho: utilizado para veículos quebrados. Taxa de deslocamento: R$ 2,00 por quilômetro.");
       System.out.println("2 - Caminhão de reboque integrado: Utilizado para veículos mais pesados. Taxa de deslocamento: R$ 10,00 por quilômetro.");
       System.out.println("3 - Caminhão guincho de plataforma: Utilizado para veículos leves. Taxa de deslocamento: R$ 5,00 por quilômetro.");
       escolhaGuincho = scan.nextInt();
       scan.nextLine();
       escolherOrigem();
   }

   public String escolherOrigem(){
       System.out.println("Momento de escolher o trajeto que o Guincho fará: ");
       System.out.println("Qual a origem? Digite: ");
       System.out.println("A - Para Bairro A;");
       System.out.println("B - Para Bairro B;");
       System.out.println("C - Para CENTRO;");
       escolhaOrigem = scan.next().toUpperCase();
       transformarCarroEmTipoVeiculo();
       escolherDestino();
       return escolhaDestino;
   }

   public String escolherDestino(){
       System.out.println("Qual o destino? Digite: ");
       System.out.println("A - Para Bairro A;");
       System.out.println("B - Para Bairro B;");
       System.out.println("C - Para CENTRO;");
       escolhaDestino = scan.next().toUpperCase();
       return escolhaDestino;
   }

   public void transformarCarroEmTipoVeiculo(){
       if (escolhaCarro == 1){
           tipoVeiculo = CARRO;
       } else if (escolhaCarro == 2) {
           tipoVeiculo = MINIVAN;
       } else if (escolhaCarro == 3) {
           tipoVeiculo = ONIBUS;
       } else if (escolhaCarro == 4) {
           tipoVeiculo = CAMINHAO;
       }
   }

    public void transformarEstadoConservacaoString(){
        if (estadoConservacao == 1){
            estadoConservacaoString = NOVO;
        } else if (estadoConservacao == 2) {
            estadoConservacaoString = QUEBRADO;
        }
    }

    public int getEscolhaCarro() {
        return escolhaCarro;
    }

    public int getEstadoConservacao() {
        return estadoConservacao;
    }

    public int getEscolhaGuincho() {
        return escolhaGuincho;
    }


    public String getEscolhaDestino() {
        return escolhaDestino;
    }

    public String getEscolhaOrigem() {
        return escolhaOrigem;
    }

}
