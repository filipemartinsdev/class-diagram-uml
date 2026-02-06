### [Índice](../../../../README.md)

# Associação unidirecional

Representada por uma linha sólida com seta na extremidade, significa uma classe conhece a outra, mas não o contrário.

## Símbolo

<img src="/src/main/resources/images/associacao_unidirecional.png" width="300pt">

## Quando usar

Utilize quando uma classe armazena uma referência para outra classe.

## Exemplo

<img src="/src/main/resources/images/exemplo_associacao_unidirecional.png" width="600pt">


````java
class Pessoa {
    public String nome;
    public Pet pet;
}

class Pet {
    public String nome;
}
````
[Acessar código](Exemplo.java)

### [Próximo (Dependência)](../dependencia/DEPENDENCIA.md)
