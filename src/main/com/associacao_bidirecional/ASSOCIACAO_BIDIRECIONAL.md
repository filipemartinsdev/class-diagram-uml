### [Índice](../../../../README.md)

# Associação bidirecional

Representada por uma linha reta, significa que ambas as classes se conhecem.
A relação pode ser tanto ao nível de Classe, quanto instância.

## Símbolo

<img src="/src/main/resources/images/associacao_bidirecional.png" width="300pt">

## Quando usar

Utilize quando ambas as classes se conhecem (armazenam referência uma da outra).

### Exemplo

<img src="/src/main/resources/images/exemplo_associacao_bidirecional.png" width="600pt">


````java
class Funcionario {
    public String nome;
    public Cubiculo cubiculo;
}

class Cubiculo {
    public int numero;
    public Funcionario funcionario;
}
````
[Acessar código](Exemplo.java)

### [Próximo (Associação unidirecional)](../associacao_bidirecional/ASSOCIACAO_BIDIRECIONAL.md)
