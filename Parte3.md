## Parte 3: Ingressos

### Descrição

Ao escolher um ingresso, você se orienta não apenas pela sua preferência de espaço, mas também por suas finanças. Vamos implementar a oportunidade de verificar o preço do ingresso e ver o assento reservado.

### Objetivos

Leia dois números inteiros positivos que representam o número de filas e assentos em cada fila e imprima a disposição dos assentos como na Parte 1. 
Em seguida, leia dois números inteiros da entrada: o número da fila e o número do assento nessa fila. 
Estes números representam a posição do assento, o qual o programa deve imprimir o preço do ingresso. O preço do ingresso é determinado pelas mesmas regras da Parte 2:

- Se o número total de assentos na sala não for superior a 60, o preço de cada ingresso será de 10 reais.
- Em uma sala maior, os ingressos custam 10 reais para a metade das fileiras da frente e 8 reais para a metade do fundo. Observe que o número de fileiras pode ser ímpar, por exemplo, 9 fileiras. Neste caso, a primeira metade são as 4 primeiras fileiras e a segunda metade são as 5 fileiras restantes.

Em seguida, o programa deve imprimir todas as poltronas da sala conforme mostrado no exemplo e marcar a poltrona escolhida com o símbolo X. 
Finalmente, deve imprimir o preço do ingresso e sair. 
Observe que, neste projeto, o número de filas e assentos não será maior que 9.

### Exemplos
O símbolo de maior que seguido por um espaço (>) representa a entrada do usuário. 
Observe que não faz parte da entrada.

Exemplo 1:

```
Digite o numero de filas:
> 7
Digite o numero de assentos por fila:
> 8

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S S S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

Digite o numero da fila:
> 3
Digite o numero do assento da fila:
> 6

Preço do Ingresso: R$10

Cinema:
  1 2 3 4 5 6 7 8
1 S S S S S S S S
2 S S S S S S S S
3 S S S S S X S S
4 S S S S S S S S
5 S S S S S S S S
6 S S S S S S S S
7 S S S S S S S S

```

Exemplo 2:

```
Digite o numero de filas:
> 8
Digite o numero de assentos por fila:
> 9

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S S S S S S
7 S S S S S S S S S
8 S S S S S S S S S

Digite o numero da fila:
> 6
Digite o numero do assento da fila:
> 5

Preço do Ingresso: R$10

Cinema:
  1 2 3 4 5 6 7 8 9
1 S S S S S S S S S
2 S S S S S S S S S
3 S S S S S S S S S
4 S S S S S S S S S
5 S S S S S S S S S
6 S S S S X S S S S
7 S S S S S S S S S
8 S S S S S S S S S

```
