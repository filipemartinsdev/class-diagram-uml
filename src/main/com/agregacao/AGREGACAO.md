### [Índice](../../../../README.md)

# Agregação

Representada por uma linha sólida com um losango não preenchido na extremidade. Significa que uma classe agrega a outra.

## Símbolo

<img src="/src/main/resources/images/agregacao.png" width="300pt">

## Quando usar

Utilize quando uma classe pertence a um **todo**, porém, pode existir sem o **todo**.

## Exemplo

<img src="/src/main/resources/images/exemplo_agregacao.png" width="600pt">


````java
class Pessoa {
    public String nome;
    public Acessorio acessorio;
}

class Acessorio {
    public String nome;
}
````
[Acessar código](Exemplo.java)

### [Próximo (Multiplicidade)](../multiplicidade/MULTIPLICIDADE.md)
