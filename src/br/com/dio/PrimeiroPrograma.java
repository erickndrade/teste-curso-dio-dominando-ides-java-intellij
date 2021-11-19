package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato("bichano", "Cinza", 5);

        System.out.println(gato);

        Livro livro = new Livro("1984", 326);

        System.out.println(livro);

       /* int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a + b));*/
    }
}

class Livro {
    private String nome;
    private Integer npag;

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}