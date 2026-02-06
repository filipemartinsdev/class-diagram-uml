package main.com.implementacao;

interface SerVivo {
    void respirar();
}

class Animal implements SerVivo {
    public String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    @Override
    public void respirar() {
        System.out.println(this.nome+" está respirando...");
    }
}