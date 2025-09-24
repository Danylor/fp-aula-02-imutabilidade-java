package com.exemplo.imutabilidade;

public class Main {
    public static void main(String[] args) {
        Cidade cidadeMutavel = new Cidade("Palmas");
        CidadeRecord cidadeRecord = new CidadeRecord("Rio de Janeiro");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidadeMutavel);
        PessoaRecord pessoaDeep = new PessoaRecord("Maria", cidadeRecord);

        System.out.println("Antes: " + pessoaShallow.cidade().getNome());
        cidadeMutavel.setNome("Belo Horizonte");
        System.out.println("Depois: " + pessoaShallow.cidade().getNome());

        System.out.println("PessoaDeep: " + pessoaDeep.nome() + ", " + pessoaDeep.cidade().nome());
    }
}
