package aulaMergulhandoOrientacaoObjetos;

public class TesteInicializacao {

    public static void main(String[] args) {

        Carro meucarro = new Carro();

        meucarro.fabricante = "Honda";
        meucarro.anoFabricacao = 2021;
        meucarro.proprietario.nome = "Maria";

        meucarro.proprietario = new Pessoa();

        System.out.println(meucarro.fabricante);
        System.out.println(meucarro.modelo);
        System.out.println(meucarro.anoFabricacao);
        System.out.println(meucarro.proprietario.nome);



    }

}
