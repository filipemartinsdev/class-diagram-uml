package main.com.heranca;

class Animal {
    public String nome;

    public Animal(String nome){
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    public RacaCachorro raca;

    public Cachorro(String nome, RacaCachorro raca){
        super(nome);
        this.raca = raca;
    }
}

enum RacaCachorro {
    VIRA_LATA, SALSICHA, GOLDEN, OUTRO;
}