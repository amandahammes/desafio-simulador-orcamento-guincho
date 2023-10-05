package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.implementacoes.CaminhaoPlataforma;
import br.tec.db.servicoguincho.implementacoes.CaminhaoReboqueIntegrado;
import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

import java.util.Scanner;

public class Menu {
    public static int escolhaCarro;
    public static int estadoConservacao;
    public static int escolhaGuincho;
    public static String escolhaDestino;
    public static String escolhaOrigem;
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

    public static int getEscolhaCarro() {
        return escolhaCarro;
    }

    public static int getEstadoConservacao() {
        return estadoConservacao;
    }

    public static int getEscolhaGuincho() {
        return escolhaGuincho;
    }


    public static String getEscolhaDestino() {
        return escolhaDestino;
    }

    public static String getEscolhaOrigem() {
        return escolhaOrigem;
    }

}
