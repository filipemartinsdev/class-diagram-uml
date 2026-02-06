### [Índice](../../../../README.md)

# Implementação

Representada por uma tracejava com a mesma seta de **Herança**, significa que uma classe implementa uma interface.

## Símbolo

<img src="/src/main/resources/images/implementacao.png" width="300pt">

## Quando usar

Utilize quando uma classe implementa uma interface.

## Exemplo

<img src="/src/main/resources/images/exemplo_implementacao.png" width="600pt">


````java
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
````
[Acessar código](Exemplo.java)

### [Próximo (Composição)](../composicao/COMPOSICAO.md)
