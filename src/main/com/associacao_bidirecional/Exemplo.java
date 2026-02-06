package main.com.associacao_bidirecional;

class Funcionario {
    public String nome;
    public Cubiculo cubiculo;
}

class Cubiculo {
    public int numero;
    public Funcionario funcionario;
}
