## Parte 2 - O Faturamento

### Descrição

Agora eles querem expandir o cinema e adicionar salas com mais assentos. No entanto, isso é caro, então eles querem ter certeza de que valerá a pena. Ajude-os a calcular o faturamento da sala se  todos os ingressos forem vendidos, dependendo do número de assentos disponíveis.

### Objetivos

Você precisa ler dois números inteiros positivos da entrada: o número de linhas e o número de assentos em cada linha. 

O preço do ingresso é determinado pelas seguintes regras:

- Se o número total de assentos na sala não for superior a 60, o preço de cada ingresso será de 10 reais.
- Em uma sala maior, os ingressos custam 10 reais para a metade das fileiras da frente e 8 reais para a metade do fundo. Observe que o número de fileiras pode ser ímpar, por exemplo, 9 fileiras. Neste caso, a primeira metade são as 4 primeiras fileiras e a segunda metade são as 5 fileiras restantes.

Calcule o lucro dos ingressos vendidos em função do número de assentos e imprima o resultado conforme os exemplos abaixo. 

Depois disso, seu programa deve sair. Observe que, neste projeto, o número de filas e assentos não será maior que 9.

### Exemplos

- O símbolo de maior que seguido por um espaço (>) representa a entrada do usuário. Observe que não faz parte da entrada.

Exemplo 1:

```
Digite o numero de filas:
> 4
Digite o numero de assentos por fila:
> 5
Faturamento Total:
R$200
```

Exemplo 2:

```
Digite o numero de filas:
> 8
Digite o numero de assentos por fila:
> 9
Faturamento Total:
R$648
```

Exemplo 3:

```
Digite o numero de filas:
> 9
Digite o numero de assentos por fila:
> 7
Faturamento Total:
R$560
```
