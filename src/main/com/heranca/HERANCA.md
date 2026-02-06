### [Índice](../../../../README.md)

# Herança

Representada por uma linha tracejava com seja fechada não preenchida, significa que uma classe herda de outra.

## Símbolo

<img src="/src/main/resources/images/heranca.png" width="300pt">

## Quando usar

Utilize quando uma classe extende outra classe.

## Exemplo

<img src="/src/main/resources/images/exemplo_heranca.png" width="600pt">


````java
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
````
[Acessar código](Exemplo.java)

### [Próximo (Implementação)](../implementacao/IMPLEMENTACAO.md)
