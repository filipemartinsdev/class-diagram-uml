### [Índice](../../../../README.md)

# Multiplicidade

Em muitos casos, somente o relacionamento não é claro o suficiente. Para isso, existe a **notação de multiplicidade**. Essa notação define a quantidade de vínculos entre classes. Com isso, podemos escrever explicitamente relacionamentos _Many to One_, _One to Many_, etc.

As notações de multiplicidade ficam nas extremidades dos símbolos de Associação.

<img src="/src/main/resources/images/multiplicidade.png" width="400pt">

_"Um B possui vários A"_

---

## Estrutura padrão

A notação de multiplicidade fica sempre ao lado da classe que o representa. 

### Tipos

| Notação      | Significado         | Descrição                                    |
|--------------|---------------------|----------------------------------------------|
| 1            | Exatamente um       | Somente um objeto por vínculo                |
| n            | Número fixo         | Valor definido, fixo                         |
| *            | Muitos              | Muitos vínculos, sem limite                  |
| n..*         | n ou muitos         | n ou muitos vínculos                         |
| 0..1         | Zero ou um          | Nenhum vínculo, ou no máximo um              |
| m..n         | m ou n              | Valores específicos                          |
| m, n, p, ... | m ou n ou p ou ...  | Somente um dos valores definidos no conjunto |

> Observação: 
> Notação de multiplicidade pode ser utilizada em conjunto com os diferentes tipos de associação.

## Exemplos

<img src="/src/main/resources/images/exemplo_multiplicidade_1.png" width="300pt">

**Um** professor pode agregar **múltiplas** disciplinas


---

<img src="/src/main/resources/images/exemplo_multiplicidade_2.png" width="300pt">

Uma String possui **múltiplos** Chars

--- 

<img src="/src/main/resources/images/exemplo_multiplicidade_3.png" width="300pt">

**Uma** pessoa pode ser agregada por **nenhum ou múltiplos** acessórios.  

---

## Observações

De acordo com as especificações para UML, a multiplicidade no lado do "todo" em composições é implicitamente 0..1 ou 1, então alguns arquitetos simplificam a visualização.

Vale resaltar que algumas ferramentas de modelagem, como o JHipster, permitem que a multiplicidade seja simplificada. No entanto, é importante lembrar que a multiplicidade é uma parte fundamental da modelagem de classes e deve ser explicitamente definida para garantir a clareza do modelo.


### [Próximo (Pacotes)](../pacotes/PACOTES.md)
