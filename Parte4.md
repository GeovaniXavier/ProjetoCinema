## Parte 4: Menu 

### Descrição

O cinema está ficando popular e os clientes começaram a reclamar que não é prático o programa pare comprar um ingresso. Vamos adicionar um menu que lhes permitirá comprar ingressos e exibir o estado atual da disposição dos assentos quando necessário.

### Objetivos
No início, seu programa deve ler dois números inteiros positivos que representam o número de filas e assentos em cada fila. Em seguida, deve imprimir um menu com os três itens a seguir:

- EXIBIR ASSENTOS - deve imprimir a disposição atual dos assentos. Os lugares vazios devem ser marcados com um símbolo S e os lugares ocupados são marcados com um símbolo X.
- COMPAR INGRESSO - deve-se ler o numero da fila e o assento e imprimir o preço do ingresso. Depois disso, o assento escolhido deve ser marcado com um X quando o item EXIBIR ASSENTOS for selecionado.
- SAIR - deve interromper o programa.

###Exemplo

O símbolo de maior que seguido por um espaço (>) representa a entrada do usuário. Observe que não faz parte da entrada.


Exemplo 1:

```
Digite o numero de filas:
> 7
Digite o numero de assentos por fila:
> 8

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 1

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 2

Digite o numero da fila:
> 3
Digite o numero do assento da fila:
> 6

Preço do Ingresso: R$10


1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 1

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S X S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S


1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 0
```