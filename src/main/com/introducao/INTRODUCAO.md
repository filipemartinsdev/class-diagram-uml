### [Índice](../../../../README.md)

# Introdução

Antes de modelar relacionamentos, é necessário entender a sintaxe básica e como um diagrama é estruturado.

## Estrutura padrão

Toda classe possui três campos:
- Cabeçalho
- Atributos
- Métodos

Ao descrever um atributo ou método, você pode utilizar os prefixos **"+"** ou **"-"** para indicar modificadores de acesso **público** ou **privado**, respectivamente.
Observe as imagens abaixo para melhor entendimento.


<img src="../../resources/images/estrutura_classe.png" width="600pt">

<img src="../../resources/images/detalhes_classe.png" width="600pt">


## Tipos de classe

- **Classe**

    Esse é o tipo padrão, que representa uma classe comum. 


  <img src="../../resources/images/classe.png" width="300pt">
   

---


- **Interface**
    
    Uma interface é somente o contrato de uma classe, sem atributos, somente métodos abstratos públicos.


  <img src="../../resources/images/interface.png" width="300pt">


---


- **Enum**
    
    Esse tipo é utilizado para manter uma lista de valores imutáveis.


  <img src="../../resources/images/enum.png" width="300pt">

> Nota: métodos construtores padrões (público e sem argumentos/todos os argumentos) não são obrigatórios na modelagem UML.


### [Próximo (Associações)](../associacoes/ASSOCIACOES.md)
