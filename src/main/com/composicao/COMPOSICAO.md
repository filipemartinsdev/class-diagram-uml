### [Índice](../../../../README.md)

# Composição

Representada por uma linha sólida com um losango preenchido na extremidade. Significa uma relação de pertencimento.

## Símbolo

<img src="/src/main/resources/images/composicao.png" width="300pt">

## Quando usar

Utilize quando uma classe é **parte** de um **todo**, e não pode existir sem o **todo**.

## Exemplo

<img src="/src/main/resources/images/exemplo_composicao.png" width="600pt">


````java
class Pessoa {
    public String nome;
    public CPF cpf;
}

class CPF {
    public String valor;
}
````
[Acessar código](Exemplo.java)

### [Próximo (Agregação)](../agregacao/AGREGACAO.md)
