## Parte 5: Finalizando 


### Descrição
Vamos adicionar estatísticas ao seu programa. As estatísticas mostrarão a renda atual, a renda total, o número de assentos disponíveis e a porcentagem de ocupação.

Além disso, não é bom quando um usuário pode comprar um ingresso que já foi comprado por outro usuário. Vamos consertar isso!

### Objetivos
Agora seu menu deve ser parecido com este:

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR

Quando o item Estatísticas for escolhido, seu programa deverá imprimir as seguintes informações:

- O número de ingressos comprados;
- O número de ingressos comprados representado como uma porcentagem. As porcentagens devem ser arredondadas para 2 casas decimais;
- Renda atual;
- A receita total que mostra quanto dinheiro o teatro receberá se todos os ingressos forem vendidos.

Os demais itens do menu devem funcionar da mesma maneira que antes, exceto que o item Comprar um ingresso não deve permitir que um usuário compre um ingresso que já foi comprado.

- Se um usuário escolher um assento já ocupado, imprima Esse ingresso já foi comprado! e peça que ele insira uma nova fila e assento até que escolham um assento disponível. 
- Você não deve permitir filas e assentos que estão fora dos limites. Se isso acontecer, imprima a entrada errada! e peça para inserir filas e assentos diferentes até que o usuário escolha um assento disponível.

Exemplos
O símbolo de maior que seguido por um espaço (>) representa a entrada do usuário. Observe que não faz parte da entrada.


Exemplo 1:

```
Digite o numero de filas:
> 6
Digite o numero de assentos por fila:
> 6

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 3

NUMERO DE INGRESSOS VENDIDOS: 0
PECENTUAL: 0.00%
FATURAMENTO ATUAL: R$0
FATURAMENTO TOTAL: R$360

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 1

Cinema:
  1 2 3 4 5 6 
1 S S S S S S 
2 S S S S S S 
3 S S S S S S 
4 S S S S S S 
5 S S S S S S 
6 S S S S S S 

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 2

Digite o numero da fila:
> 1
Digite o numero do assento da fila:
> 1

Preço do Ingresso: R$10

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 3

NUMERO DE INGRESSOS VENDIDOS: 1
PECENTUAL: 2.78%
FATURAMENTO ATUAL: R$10
FATURAMENTO TOTAL: R$360

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 2

Digite o numero da fila:
> 1
Digite o numero do assento da fila:
> 1

Esse ingresso já foi comprado!

Digite o numero da fila:
> 10
Digite o numero do assento da fila:
> 10

Entrada errada!

Digite o numero da fila:
> 4
Digite o numero do assento da fila:
> 4

Preço do Ingresso: R$10

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 1

Cinema:
  1 2 3 4 5 6 
1 X S S S S S 
2 S S S S S S 
3 S S S S S S 
4 S S S X S S 
5 S S S S S S 
6 S S S S S S 

1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
3. ESTATÍSTICAS
0. SAIR
> 3

NUMERO DE INGRESSOS VENDIDOS: 2
PECENTUAL: 5.56%
FATURAMENTO ATUAL: R$20
FATURAMENTO TOTAL: R$360


1. EXIBIR ASSENTOS
2. COMPAR INGRESSO
0. SAIR
> 0
```