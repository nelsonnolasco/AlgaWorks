package aulaMergulhandoOrientacaoObjetos;

public class Principal {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Nelson Nolasco";
        eu.cpf = "111.321.746-68";
        eu.anoNascimento = 1965;

        Pessoa voce = new Pessoa();
        voce.nome = "João das Couves";
        voce.cpf = "324.321.978-56";
        voce.anoNascimento = 1984;

        Carro meucarro = new Carro();
        meucarro.anoFabricacao = 2024;
        meucarro.cor = "preto";
        meucarro.fabricante = "Honda";
        meucarro.modelo = "HR-V";
        meucarro.proprietario = eu;

//        meucarro.proprietario = new Pessoa();
//        meucarro.proprietario.nome = "Nelson Nolasco";
//        meucarro.proprietario.cpf = "111.321.746-68";
//        meucarro.proprietario.anoNascimento = 1965;
        //         ou...


        Carro seucarro = new Carro();
        seucarro.anoFabricacao = 2022;
        seucarro.cor = "Branco";
        seucarro.fabricante = "BMW";
        seucarro.modelo = "X6";
        seucarro.proprietario = voce;

        System.out.println("Meu Carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s%n", meucarro.modelo);
        System.out.printf("Ano: %d%n", meucarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meucarro.proprietario.nome);

        System.out.println("\nSeu Carro");
        System.out.println("-----------------");
        System.out.printf("Modelo: %s%n", seucarro.modelo);
        System.out.printf("Ano: %d%n", seucarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seucarro.proprietario.nome);
    }
}
