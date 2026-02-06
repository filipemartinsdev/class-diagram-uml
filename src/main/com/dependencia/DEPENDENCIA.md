### [Índice](../../../../README.md)

# Dependência

Representada por uma linha tracejava com uma seta aberta, significa vínculo fraco entre duas classes, sendo que somente uma conhece a outra.

## Símbolo

<img src="/src/main/resources/images/dependencia.png" width="300pt">

## Quando usar

Utilize quando uma classe utiliza outra temporariamente, sem armazenar referência permanentemente.

## Exemplo

<img src="/src/main/resources/images/exemplo_dependencia.png" width="600pt">


````java
class App {
    public void escrever(String texto){
        SaidaDeDados saida = new SaidaDeDados();
        saida.escrever(texto);
    }
}

class SaidaDeDados {
    public void escrever(String dado){
        System.out.println(dado);
    }
}
````
[Acessar código](Exemplo.java)

### [Próximo (Herança)](../heranca/HERANCA.md)
