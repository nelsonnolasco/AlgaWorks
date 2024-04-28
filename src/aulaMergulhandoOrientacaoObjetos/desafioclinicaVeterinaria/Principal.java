package aulaMergulhandoOrientacaoObjetos.desafioclinicaVeterinaria;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Granola";
        cachorro.sexo = "Femea";

        System.out.println(cachorro.nome);
        System.out.println(cachorro.sexo);

    }
}
